---
layout: post
title:  "JChemPaint hack session at Uppsala"
date:   2009-06-30
blogger-link: https://chem-bla-ics.blogspot.com/2009/06/jchempaint-hack-session-at-uppsala.html
doi: 10.59350/m0zsx-9ta16
tags: cdk jchempaint
image: /blog/assets/images/jcpHackWeek.JPG
---

Arvid and I had a meeting on the ControllerHub refactoring, to make it modular to the bone. Actually,
it is the [IChemModelRelay](http://cdk.svn.sourceforge.net/viewvc/cdk/cdk/branches/jchempaint-primary/src/main/org/openscience/cdk/controller/IChemModelRelay.java?view=log)
that needs refactoring. This is what we wrote down:

![](/blog/assets/images/jcpHackWeek.JPG)

In this picture you can see our priorities (1,2 for Arvid, and A,B for me).

**1** The above mentioned relay will get refactored to have each method a separate class, which at the same time will provide
the undo/redo functionality. We might even have undo at a scripting level :)

**2** Second item on Arvid's list is extending the mouse relay to handle key modifiers, an unfortunate omission in that design.
This is needed to Ctrl- and Apple's Command-based selection approach.

**A** To easy the footprint reduction of JChemPaint, we are going to split the current *render* module into **render** and **renderextra**.
The second may see future split ups, and both may see name changes, but the first go will split them according to requiring an
IAtomContainer data model or a IChemModel data model.

This will help us clean up dependencies, by forcing us to have the core functionality not pull in, for example, reaction functionality.
Additionally, isotope related rendering will go into *renderextra* so removing the dependency on the IsotopeFactory and the associated
800kB-sized *isotope.xml* data file.

This will not immediately help the applet class partitioning and indexing, but it will help us to keep a sane overview of all the stuff
we have around.

**B** The goal is to merge this work on JChemPaint back into the CDK libary, so that we again have a CDK version with a
fully working editing environment as did CDK 1.0. However, that requires to code to be stable, which includes full unit
testing, no PMD violations, complete JavaDoc. However, as I wrote this morning to the
[cdk-jchempaint mailing list](https://lists.sourceforge.net/lists/listinfo/cdk-jchempaint):

> But, there is a lot of clean up to do. I counted 497 missing test
> methods; 326 PMD violations, and saw a lot of missing JavaDoc. This
> means, that the current patch is pretty messed up indeed, and we are a
> long way away from seeing a merge with CDK master :(
