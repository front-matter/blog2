---
layout: post
title:  "Wicked chemistry and unit testing"
date:   2008-05-03
modified_date: 2025-10-11
blogger-link: https://chem-bla-ics.blogspot.com/2008/05/wicked-chemistry-and-unit-testing.html
doi: 10.59350/fwsac-99191
tags: cdk pubchem
image: /assets/images/sid12279910.png
---

After a discussion on starting development releases for [CDK](http://cdk.sf.net/) on [cdk-devel](https://lists.sourceforge.net/lists/listinfo/cdk-devel),
the discussion continued on the state of the [CDK atom typer <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/07/01/atom-typing-in-cdk.html).
[Dan](http://dtp.nci.nih.gov/branches/itb/itb_index.html) and [Rajarshi](http://cheminfo.informatics.indiana.edu/~rguha/)
have done tests in the past against [PubChem](http://pubchem.ncbi.nlm.nih.gov/) and its DTP/NCI subset. Rajarshi made his
analysis part of [CDK Nightly](http://cheminfo.informatics.indiana.edu/~rguha/code/java/nightly/),
and provides but [a summary](http://cheminfo.informatics.indiana.edu/~rguha/code/java/nightly/)
(which seems broken: zero fails) and a [detailed list](http://cheminfo.informatics.indiana.edu/~rguha/tmp/dtp-atype-report.txt).

Dan, do I understand correctly that those *Structure Evaluation:No Comparision - Unparameterized Atom - S.* lines in the
**Depositor-Supplied Comments** section on PubChem are based on CDK trunk? That would be a great honor! Anyways...

The amount of atom types we use to describe the chemistry we observe is overwhelming (even without charged or radical atoms).
And, most atom type lists are quite limited in what they represent. However, having an explicit list allows the computer to
decide if it can do reasonable calculations on a structure. **Always filter your data to screen for unrecognized atom types,
before heading of to, for example, QSAR calculations!**

Now, many fails are because of the incomplete CDK atom type list (e.g. Au in [SID:413374](http://pubchem.ncbi.nlm.nih.gov/summary/summary.cgi?sid=413374)),
or because the atom typer code has a bug (e.g. [SID:403517](http://pubchem.ncbi.nlm.nih.gov/summary/summary.cgi?sid=403517)).
And these screenings against PubChem provide a nice priority list. However, others are either because the used SDF format
cannot represent the chemistry (e.g. [SID:420394](http://pubchem.ncbi.nlm.nih.gov/summary/summary.cgi?sid=420394)), or the
entry is a plain wrong (e.g. [SID:301178](http://pubchem.ncbi.nlm.nih.gov/summary/summary.cgi?sid=301178)). The latter
two types of fails, I am annotating using [del.icio.us/egonw/pubchem+check-valency](http://del.icio.us/egonw/pubchem+check-valency)
for others to comment on (just tag the same page using [del.ici.us](http://del.icio.us/), and I'll see the comments show up.

## Unit testing

For the first two types of fails, basically three things need to be done:

* add the atom type to [the ontology](http://cdk.svn.sourceforge.net/viewvc/*checkout*/cdk/cdk/trunk/src/main/org/openscience/cdk/config/data/cdk_atomtypes.xml?content-type=text%2Fxml)
* write a unit test for [CDKAtomTypeMatcherTest](http://cdk.svn.sourceforge.net/viewvc/cdk/cdk/trunk/src/test/org/openscience/cdk/atomtype/CDKAtomTypeMatcherTest.java?view=log)
* add perception code to [CDKAtomTypeMatcher](http://cheminfo.informatics.indiana.edu/~rguha/code/java/nightly/api/org/openscience/cdk/atomtype/CDKAtomTypeMatcher.html)

Because we cannot use [SMILES](http://www.opensmiles.org/) or file readers for writing these tests (than we can confounding
of error sources), we have to hard code the chemical structure, which may be a bit cumbersome.

Unless you use the [CDKSourceCodeWriter](http://cheminfo.informatics.indiana.edu/~rguha/code/java/nightly/api/org/openscience/cdk/io/CDKSourceCodeWriter.html)!
This [IChemObjectWriter](http://cheminfo.informatics.indiana.edu/~rguha/code/java/nightly/api/org/openscience/cdk/io/IChemObjectWriter.html)
creates CDK source code, staring with a IMolecule. Now, because our bug reports are derived from fails against the PubChem
screening, we can simply use this [BeanShell](http://www.beanshell.org/) code to download a structure from
PubChem and convert it to CDK source code:

```java
#!/usr/bin/bsh

import org.openscience.cdk.Molecule;
import org.openscience.cdk.io.MDLV2000Reader;
import org.openscience.cdk.io.CDKSourceCodeWriter;

if (bsh.args.length == 0 || bsh.args[0] == null) {
  System.out.println("Syntax: pubchem2unittest.bsh [CID]\n");
  System.exit(0);
}

String cid = bsh.args[0];
String urlString = "http://pubchem.ncbi.nlm.nih.gov/summary/summary.cgi?disopt=SaveSDF&cid=" + cid;

URL url = new URL(urlString);

MDLV2000Reader reader = new MDLV2000Reader(url.openStream());
Molecule mol = reader.read(new Molecule());

StringWriter stringWriter = new StringWriter();
CDKSourceCodeWriter writer = new CDKSourceCodeWriter(stringWriter);
writer.write(mol);
writer.close();

System.out.print(stringWriter.toString());
```

For example, I am currently debugging a sulphur atom type perception problem, for which the simplest
substructure looks like ([sid=12279910 <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2008/05/03/wicked-chemistry-and-unit-testing.html),
`InChI=1/C2H7NS/c1-4(2)3/h3H,1-2H3)`:

![](/assets/images/sid12279910.png)

I can convert this PubChem entry to CDK source code with:

```shell
$ bsh -classpath dist/jar/cdk-svn-20080221.jar tools/pubchem2unittest.bsh 12279910
```

Resulting in this output which I can copy/paste into my unit test:

```java
IMolecule mol = new Molecule();
IAtom a1 = mol.getBuilder().newAtom("S");
a1.setPoint2d(new Point2d(2.866, 0.25));  mol.addAtom(a1);
IAtom a2 = mol.getBuilder().newAtom("N");
a2.setPoint2d(new Point2d(3.7321, 0.75));  mol.addAtom(a2);
IAtom a3 = mol.getBuilder().newAtom("C");
a3.setPoint2d(new Point2d(2.0, 0.75));  mol.addAtom(a3);
IAtom a4 = mol.getBuilder().newAtom("C");
a4.setPoint2d(new Point2d(2.866, -0.75));  mol.addAtom(a4);
IAtom a5 = mol.getBuilder().newAtom("H");
a5.setPoint2d(new Point2d(2.31, 1.2869));  mol.addAtom(a5);
IAtom a6 = mol.getBuilder().newAtom("H");
a6.setPoint2d(new Point2d(1.4631, 1.06));  mol.addAtom(a6);
IAtom a7 = mol.getBuilder().newAtom("H");
a7.setPoint2d(new Point2d(1.69, 0.2131));  mol.addAtom(a7);
IAtom a8 = mol.getBuilder().newAtom("H");
a8.setPoint2d(new Point2d(2.246, -0.75));  mol.addAtom(a8);
IAtom a9 = mol.getBuilder().newAtom("H");
a9.setPoint2d(new Point2d(2.866, -1.37));  mol.addAtom(a9);
IAtom a10 = mol.getBuilder().newAtom("H");
a10.setPoint2d(new Point2d(3.486, -0.75));  mol.addAtom(a10);
IAtom a11 = mol.getBuilder().newAtom("H");
a11.setPoint2d(new Point2d(4.269, 0.44));  mol.addAtom(a11);
IBond b1 = mol.getBuilder().newBond(a1, a2, DOUBLE);
mol.addBond(b1);
IBond b2 = mol.getBuilder().newBond(a1, a3, SINGLE);
mol.addBond(b2);
IBond b3 = mol.getBuilder().newBond(a1, a4, SINGLE);
mol.addBond(b3);
IBond b4 = mol.getBuilder().newBond(a2, a11, SINGLE);
mol.addBond(b4);
IBond b5 = mol.getBuilder().newBond(a3, a5, SINGLE);
mol.addBond(b5);
IBond b6 = mol.getBuilder().newBond(a3, a6, SINGLE);
mol.addBond(b6);
IBond b7 = mol.getBuilder().newBond(a3, a7, SINGLE);
mol.addBond(b7);
IBond b8 = mol.getBuilder().newBond(a4, a8, SINGLE);
mol.addBond(b8);
IBond b9 = mol.getBuilder().newBond(a4, a9, SINGLE);
mol.addBond(b9);
IBond b10 = mol.getBuilder().newBond(a4, a10, SINGLE);
mol.addBond(b10);
```
