---
layout: post
title:  "Bioclipse for CDK Developers #1"
date:   2009-02-15
blogger-link: https://chem-bla-ics.blogspot.com/2009/02/bioclipse-for-cdk-developers-1.html
doi: 10.59350/zv2f4-ac581
tags: bioclipse cdk doi:10.1186/1471-2105-8-59
---

Ola has released the [second beta for Bioclipse 2.0](http://bioclipse.blogspot.com/2009/02/bioclipse-20-beta2-released.html).
Things are getting along, and I will not go into details on the [molecules table Arvid is working on](http://bioclipse.blogspot.com/2008/08/bioclipse-20-alpha01-released.html),
the 1GB+ SD file support, the [validating CML editor](http://chem-bla-ics.blogspot.com/2008/12/editing-and-validation-of-cml-documents.html),
the [support for XMPP services](http://chem-bla-ics.blogspot.com/2008/11/next-generation-asynchronous.html),
or the [brand new welcome page](http://bioclipse.blogspot.com/2009/02/bioclipse-20-beta2-released.html)
which will guide new users around in what Bioclipse has to offer.

This blog will focus on what [Bioclipse](http://www.bioclipse.net/) has to offer [CDK](http://cdk.sf.net/) developers.

While Bioclipse 1.x (doi:[10.1186/1471-2105-8-59](https://doi.org/10.1186/1471-2105-8-59)) was a prototype that showed the
power if integrating different bio- and cheminformatics tools, Bioclipse2 was designed from scratch, taking advantage of
the latest [Eclipse RCP](http://wiki.eclipse.org/index.php/Rich_Client_Platform) technologies. More importantly, the
team in Uppsala decided to have all functionality work via managers, allowing all actions to be recorded. *And*,
scripting of Bioclipse. I blogged earlier about [scripting JChemPaint](http://chem-bla-ics.blogspot.com/2008/11/scripting-jchempaint.html),
and [creating UFF optimized 3D structures from SMILES](http://chem-bla-ics.blogspot.com/2008/10/bioclipse2-scripting-1-from-smiles-to.html).
[Example scripts](http://chem-bla-ics.blogspot.com/2009/01/bioclipse-and-gist-integration.html) can be found on
GitHub (this is [their coverage](http://github.com/blog/317-scripting-bioclipse)), and are
[indexed on Delicious](http://delicious.com/tag/bioclipse+gist).

## R for cheminformatics

The fact that we can script everything makes Bioclipse an ideal platform for doing cheminformatics: we have access to a variety of
cheminformatics libraries, *and* the means to visualize results via [JChemPaint](http://jchempaint.sf.net/) and
[Jmol](http://www.jmol.org/). It is like R for cheminformatics: Bioclipse being the R command line, Bioclipse plugins the R
packages. Eclipse provides an mechanism called *Update Sites*, which makes something like CRAN redundant. Back to the Chemistry
Development Kit.

Over the next weeks, I will blog about scripts aimed at CDK developers and people who want to learn more on how the CDK
internals work. This series assumes Bioclipse 2.0 beta2 (or better) and the CDK Feature installed. I'll be using the Gist
widget to embed scripts in this blog, but you can always download the Gist directly into Bioclipse, with the GUI as described
[here](http://chem-bla-ics.blogspot.com/2009/01/bioclipse-and-gist-integration.html).

Bioclipse uses JavaScript (maybe other scripting languages in the future. File a wishlist report if you like to see Jython,
BeanShell or other support in the [Bioclipse bug track system](http://bugs.bioclipse.net/).)
Bioclipse managers are visible using special variables, such as:

<table>
  <tr>
    <td><span style="font-weight:bold;">Bioclipse Feature</span></td>
    <td>ui</td>
    <td>Bioclipse UI interaction</td>
  </tr>
  <tr>
    <td><span style="font-weight:bold;">Cheminformatics Feature</span></td>
    <td>cdk</td>
    <td>CDK functionality</td>
  </tr>
  <tr>
    <td></td>
    <td>jmol</td>
    <td>Jmol functionality</td>
  </tr>
  <tr>
    <td><span style="font-weight:bold;">CDK Feature</span></td>
    <td>cdx</td>
    <td>CDK Developer functionality</td>
  </tr>
</table>

Bioclipse scripting has TAB completion support, so you can type cdk. (notice the dot at the end) to which methods the cdk manager provides.

## Debugging CDK's Atom Type

As I wrote last week with the email on the [first CDK 1.2 release candidate](http://chem-bla-ics.blogspot.com/2007/07/atom-typing-in-cdk.html),
the new CDK atom typer is a core component of the new CDK. The new implementation covers all atom types used in CDK 1.0, and many more.
In particular, [Miguel](http://chemistry-to-informatics.blogspot.com/) boosted support for charged and radical atom types.

However, the atom types in your data set may not be covered, or perception fails otherwise. That happens. Bioclipse2 makes
debugging of this important step in cheminformatics quite insightful. The following script reads a molecule from SMILES,
visualizes 2D diagram in JChemPaint, and perceives atom types: The atom type perception results are return to the JavaScript
console, and if there are *nulls* given, then the CDK algorithm did not find a matching atom type for that atom. If you are
sure your cheminformatics representation is in order, I welcome a bug report
[here](http://sourceforge.net/tracker2/?atid=120024&group_id=20024&func=browse).

CDK developers can take advantage of this functionality, to eliminate possible causes why a certain algorithm fails. CDK atom typing is used for a variate of algorithms, including counting implicit hydrogens, which many other algorithms need to know.

## How does the CDK read a SMILES

A use case for people who want to know if a particular SMILES feature is read or to make sure it is read correctly:
This script uses the *diff* functionality introduced in CDK 1.2, and shows two aspects of the SMILES specification: 1. it
picked up the isotope information given in the second SMILES; 2. the second SMILES does not include the implicit hydrogen
count, which the SMILES specification then defaults as zero.

## Summary

The CDK managers in Bioclipse (*cdk* and *cdx*) expose functionality of the CDK, and allows using it in Bioclipse' rich
visual workbench environment.
