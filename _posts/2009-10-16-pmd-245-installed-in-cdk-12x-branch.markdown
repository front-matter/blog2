---
layout: post
title:  "PMD 2.4.5 installed in the CDK 1.2.x branch"
date:   2009-10-16
blogger-link: https://chem-bla-ics.blogspot.com/2009/10/pmd-245-installed-in-cdk-12x-branch.html
doi: 10.59350/xewvg-pwc38
tags: cdk pmd
image: /blog/assets/images/supernightly2.png
---

Today I installed [PMD](http://pmd.sf.net/) 4.2.5 in the [CDK 1.2.x branch](http://github.com/egonw/cdk/tree/cdk-1.2.x) which contains
mostly [bug fixes](http://sourceforge.net/project/shownotes.php?release_id=659603&group_id=56262) compared to the 4.2.2 version we had
earlier. Several of these include false positives: warnings which were not really problems, but tests going bad.

![](/blog/assets/images/supernightly2.png)

The number of these false positives seems to be significant as the number of PMD violations for the CDK 1.2.x branch seems to have
dropped about 1500! warnings :)
