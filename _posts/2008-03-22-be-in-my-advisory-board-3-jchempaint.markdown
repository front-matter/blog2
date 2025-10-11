---
layout: post
title:  "Be in my Advisory Board #3: JChemPaint widgets?"
date:   2008-03-22
blogger-link: https://chem-bla-ics.blogspot.com/2008/03/be-in-my-advisory-board-3-jchempaint.html
doi: 10.59350/5zbfp-9wb13
tags: jchempaint bioclipse
modified_date: 2025-10-11
---

[As promised <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2008/01/15/be-in-my-advisory-board-2-jchempaint.html), I am working on JChemPaint. I have progressed in cleaning up
the [CDK trunk/](http://cdk.svn.sourceforge.net/viewvc/cdk/cdk/trunk/) repository by removing traces of the old JChemPaint applet and application. And,
importantly, removed the `GeometryTools` class that took rendering coordinates. The history here is that the original `GeometryTools` was renamed to
`GeometryToolsInternalCoordinates`, but is now available as `GeometryTools` again. I still have to merge Niels' additions with it, though. And,
I have set up a new [JChemPaint trunk/](http://cdk.svn.sourceforge.net/viewvc/cdk/jchempaint/trunk/) where I have moved
[Niels' demo editor](http://cdk.svn.sourceforge.net/viewvc/cdk/jchempaint/trunk/src/main/org/openscience/jchempaint/TestEditor.java?view=log).

Main goal for the next weeks is to further clean up things, and get the new JChemPaint project further up and going. There are, however, some new
choices for focus now. [Bioclipse](http://www.bioclipse.net/) needs a SWT widget, the applet would need a Swing widget, and an application could
be based on that too, while I could even create a Qt widget, so that in the foreseeable future we can have JChemPaint on our cell phones. So,
might [my advisory board <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/11/27/be-in-my-advisory-board-1-being-good.html) (that can be you too) take the
opportunity to advice me in these matters, and indicate what you would prefer?

## The SQT Widget

For Bioclipse mostly. Bioclipse provides a perfect opportunity to replace the old JChemPaint appliaction (not applet), with a attractive and
powerful GUI.

## The Swing Application

Maybe you'd rather see the old JChemPaint application reinstated, with the less attractive Swing-based GUI. I'd really suggest the Bioclipse
approach, so if you pick this option please explain in the comments of this item why I should do this.

## The Qt Widget

The [Qt lib comes with Java support](http://trolltech.com/products/qt/jambi), and this might be an interesting alternative. Besides being able
to make an Qt-based application, the widget would also make it easier to port JChemPaint to the cell phone and to the
[KDE desktop](http://www.kde.org/).

## The Applet

The applet is important, and requires a Swing or AWT widget. Personally, I'd rather focus on the SWT widget first, as that is a place where
no good alternative is available. On the applet side, we compete with the JME applet and [Rich' nice applet](http://metamolecular.com/chemwriter/).

I do intend to provide an applet version, but this request for advice is for setting priorities.
