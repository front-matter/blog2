---
layout: post
title:  "Where are the CDK 1.3.1 and 1.2.4 releases ?!?"
date:   2009-10-08
blogger-link: https://chem-bla-ics.blogspot.com/2009/10/where-are-cdk-131-and-124-releases.html
doi: 10.59350/pdckn-qjy95
tags: cdk git
image: /assets/images/supernightly1.png
---

You might be wondering what is keeping the [CDK](http://cdk.sf.net/) 1.3.1 and 1.2.4 releases. And right you are. When we look at
[Supernightly](http://pele.farmbio.uu.se/supernightly/), we get a clue (BTW, I hope the [EBI](http://www.mail-archive.com/cdk-user@lists.sourceforge.net/msg01173.html)
nodes will join soon too):

![](/assets/images/supernightly1.png)

Studying this table shows the reasons: there are too many regressions, too many failing unit tests. For example, 1.2.4 (while not yet released,
called 1.2.3.git) has 50 new failing tests. Now, fair enough, this is [mostly because](http://pele.farmbio.uu.se/nightly-1.2.x/test/result-ioformats.html)
of ioformats not being tested in 1.2.3 ***and*** most of the fails caused by a bug in the test, not in the code. But that still leaves 20
other failing tests. Mostly related to known bugs, and for some problems patches are actually available.

These last 22 we also see in the differences between 1.3.0 and 1.3.1 (while not yet released, called 1.3.0.git).
That's because the ioformats modules is not tested in that branch either, pending a new merge with the cdk-1.2.x
branch.
