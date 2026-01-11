---
layout: post
title:  "Bioclipse beta5: really the last one now"
date:   2009-05-21
blogger-link: https://chem-bla-ics.blogspot.com/2009/05/bioclipse-beta5-really-last-one-now.html
doi: 10.59350/6xj82-qag38
tags: chembl bioclipse cdk
image: /blog/assets/images/starlite.png
---

[Bioclipse beta 5](http://bioclipse.blogspot.com/2009/05/bioclipse-20-beta5-released.html) was just released by Ola, and the team had
some bad days over an [problem](http://chemicalrcp.blogspot.com/2009/05/eclipse-spring-export-problem-uses.html) that happened after
a merge of [an important branch](http://jonalv.blogspot.com/2009/04/i-just-came-up-with-yet-another-way-of.html) regarding the
managers we are using to allow scripting of Bioclipse.

![](/blog/assets/images/starlite.png)

In the end, [Jonathan](http://jonalv.blogspot.com/) found a workaround for the problem, even though we still have no clue what was
the exact cause. Additionally, Arvid implemented one of the last missing features of the JChemPaint editor, being the ability to
draw bonds in any arbitrary direction, and the ability to create a new bond to an already existing atom. This really seems to be the
last beta before the 2.0 release candidate. So, head over to [SourceForge](http://sourceforge.net/projects/bioclipse) as it is
now time to report this smaller things you like to see improved.

The beta has many really nice features, and we will have much to write about in later blogs. One thing I particularly like, is the
support for (really) large SD files; the above screenshot is a 800MB file with [StarLite structures](http://chembl.blogspot.com/),
though we also tried files larger than 1GB. There is a *2D-Structure* tab, which will zoom in on the structure in a regular
JChemPaint editor.

For the Bioclipse scripting, I can just encourage you to browse this blog for example scripts.

There are many extensions currently being developed, around the globe, which will extend the basic Bioclipse workbench towards
particular use cases. While surely these will get blogged about in detail later, I do want to briefly mention them. In the works
are features for: QSAR, Decision Support, Speclipse (NMR and MS spectrum handling), Resource Description Framework, a StructureDatabase,
Metabolomics, Medea (MS spectrum and fragmentation prediction), XMPP, and much more.

Focus of Bioclipse 2.1 will be towards bioinformatics: sequence handling, BLAST, better PDB/CIF support for protein structures,
and who knows.
