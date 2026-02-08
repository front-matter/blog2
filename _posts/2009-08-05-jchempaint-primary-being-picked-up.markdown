---
layout: post
title:  "JChemPaint-Primary being picked up..."
date:   2009-08-05
blogger-link: https://chem-bla-ics.blogspot.com/2009/08/jchempaint-primary-being-picked-up.html
doi: 10.59350/wkk5p-56y41
tags: jchempaint
image: /blog/assets/images/compound.png
---

Backporting the [JChemPaint-Primary patch for master](http://chem-bla-ics.blogspot.com/2009/07/maintaining-jchempaint-primary-patch.html) to the cdk-1.2.x
branch turned out to be fairly easy, but is a major step forward as we now have a patch to extend CDK 1.2.x with rendering support again, a major thing we
lost when going from the CDK 1.0 to the 1.2 series.

For example, [KNIME](http://www.knime.org/) delayed moving to CDK 1.2 because of the lack of the renderer. Another project that really wanted to have the
renderer was Ruby CDK ([rcdk-ng](http://github.com/sklemm/rcdk-ng/tree/master), but not the same as the [R rcdk package](http://cran.r-project.org/web/packages/rcdk/index.html)
:), originally [started by Rich](http://depth-first.com/articles/2006/10/30/agile-chemical-informatics-development-with-cdk-and-ruby-rcdk-0-3-0),
now maintained by Sebastian Klemm at the [Institute for Pharmatechnology of the University of Applied Science](http://www.fhnw.ch/lifesciences/ipt),
Switzerland.

Ruby CDK is a web environment for molecular structures, and based on the new rendering code, it looks like (copyright by Sebastian):

![](/blog/assets/images/compound.png)
