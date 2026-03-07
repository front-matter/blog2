---
layout: post
title:  "JChemPaint update: merging of patches and CDK statistics"
date:   2009-09-18 00:10
blogger-link: https://chem-bla-ics.blogspot.com/2009/09/jchempaint-update-merging-of-patches.html
doi: 10.59350/sna4h-d4c37
tags: cdk jchempaint git
image: /assets/images/jcpStatus.png
---

With the [JChemPaint workshop](http://sourceforge.net/apps/mediawiki/cdk/index.php?title=JChemPaintWorkshop2009) just passed, there is much work from UU and the
EBI to be integrated. Moreover, [Rajarshi](http://rguha.wordpress.com/) just merged a lot of fixes from CDK [1.2.x](http://github.com/egonw/cdk/tree/cdk-1.2.x)
into the [master](http://github.com/egonw/cdk) branch, which will be a big rebase too. That said, I need to do this to recalculate source code statistics for
the CDK.

The current set of JChemPaint patches looks like:

![](/assets/images/jcpStatus.png)

The two top most branches (*bioclipse-2.1.x* and *12-ebiStage*) are actually staging branches: patches that have not yet been integrated into the
JChemPaint-Primary branch. Likewise, the *0-other* branch is a staging branch for patches that are in or up for the review process for CDK *master*
itself.

This will mean that I am now going to rebase all these branches once more.
