---
layout: post
title:  "Bioclipse-JChemPaint #2"
date:   2009-07-07 00:10
blogger-link: https://chem-bla-ics.blogspot.com/2009/07/bioclipse-jchempaint-2.html
doi: 10.59350/qj1xp-mas31
tags: bioclipse jchempaint cdk doi:10.1186/1471-2105-8-59 chembl
image: /blog/assets/images/jcpRoundingError.png
---

Recently, I blogged about [Bioclipse-JChemPaint](http://chem-bla-ics.blogspot.com/2009/06/bioclipse-jchempaint.html) of the imminent Bioclipse 2.0.0
release, a complete rewrite of the [Bioclipse](http://www.bioclipse.net/) application as published in doi:[10.1186/1471-2105-8-59](https://doi.org/10.1186/1471-2105-8-59).
I also [blogged](http://chem-bla-ics.blogspot.com/2009/05/bioclipse-beta5-really-last-one-now.html) about the feature to
browse large [MDL SF files](http://en.wikipedia.org/wiki/Chemical_table_file) (Bioclipse 2.1 will have support one or more CML
conventions for chemical tables). Ola did some [profiling on processing SD files](http://bioclipse.blogspot.com/2009/07/working-with-large-sdfiles-in-bioclipse.html),
but also notes that such may be more suitable for the StructureDB

Browsing a large set of structures with there properties gives a quick overview of the data set. It also makes bugs shallow,
such as the one shown below found when I was browsing the [StarLite](http://www.chemblog.org/) database:

![](/blog/assets/images/jcpRoundingError.png)

The MDL molfile for structure 55 is available from the [bug report I filed against Bioclipse](http://pele.farmbio.uu.se/cgi-bin/bugzilla/attachment.cgi?id=78&action=edit).
