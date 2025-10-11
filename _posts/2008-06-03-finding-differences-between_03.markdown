---
layout: post
title:  "Finding differences between IChemObjects #2"
date:   2008-06-03
blogger-link: https://chem-bla-ics.blogspot.com/2008/06/finding-differences-between_03.html
doi: 10.59350/9tk1a-d6c07
tags: cdk qsar
modified_date: 2025-10-11
---

[CDK](http://cdk.sf.net/) QSAR descriptors are not allowed to change the input [molecule|atom|bond], and I
recently added a unit tests (rev [11138](http://cdk.svn.sourceforge.net/viewvc/cdk?view=rev&revision=11138)) for that to the
abstract class [AtomicDescriptorTest](http://cdk.svn.sourceforge.net/viewvc/cdk/cdk/trunk/src/test/org/openscience/cdk/qsar/descriptors/atomic/AtomicDescriptorTest.java?view=log).

After some code clean up of the diff module code earlier this morning (in anticipation of the rain stopping), I applied this patch
(rev [11269](http://cdk.svn.sourceforge.net/viewvc/cdk?view=rev&revision=11269)) that `noModification` unit test:

```diff
 public void testCalculate_NoModifications() throws Exception {
   IAtomContainer mol = someoneBringMeSomeWater();
   IAtom atom = mol.getAtom(1);
-  String priorString = atom.toString();
+  IAtom clone = (IAtom)mol.getAtom(1).clone();
   descriptor.calculate(atom, mol);
-  String afterString = atom.toString();
+  String diff = AtomDiff.diff(clone, atom);
   assertEquals(
-    "The descriptor must not change the passed bond in any respect.",
-    priorString, afterString
+    "The descriptor must not change the passed bond in any respect, but found this diff: " + diff,
+    0, diff.length()
   );
 }
```

This is a nice example of where the new [diff module <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2008/06/01/finding-differences-between.html)
is useful. Instead of dumping to long IAtom.toString()s, the output now gives output like:

```
AtomDiff(AtomTypeDiff(, NULL/H, NC:0/1, V:0/1))
```

This indicates (yes, a bit cryptic) that the formal neighbor count (NC) and the valence (V) fields have been modified, in addition
to that first field, which I don't know what it refers too. Indeed, the output still needs a bit more tuning :)
