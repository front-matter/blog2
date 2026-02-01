---
layout: post
title:  "Maintaining the JChemPaint-Primary patch"
date:   2009-07-31 00:20
blogger-link: https://chem-bla-ics.blogspot.com/2009/07/maintaining-jchempaint-primary-patch.html
doi: 10.59350/fht9j-cv384
tags: cdk jchempaint git bioclipse
image: /blog/assets/images/jcpPatch.png
---

Not so long ago, I finished porting the JChemPaint-Primary [branch](http://cdk.svn.sourceforge.net/viewvc/cdk/cdk/branches/jchempaint-primary/)
to be a [patch](http://pele.farmbio.uu.se/cgi-bin/gitweb.cgi?p=jchempaint-primary.git;a=shortlog;h=refs/heads/bioclipse-2.1.x) on top of
[CDK](http://cdk.sf.net/) [master from our git repository](http://github.com/egonw/cdk/tree/master). This means frequent rebasing, to incorporate
the latest changes in the CDK *master* branch. Today, I did such a rebase, after the [CDK 1.3.0 release](https://sourceforge.net/projects/cdk/files/cdk%20(development)/1.3.0/).
Hoping that at least some find this informative, this is what I did. Remember, that the *patch* is organized around the *render*
and *control* modules, which is why we have so many branches, while merely in linear relationship.

```shell
$ # to download all new patches from origin to the master branch:
git pull origin master
# then rebase all patches in the desired order (which makes absolutely no numerical sense)
# 0, 1, 2, 9, 6, 7, 3, 8, 4, 5, 11, 10
git checkout 0-other
git rebase master
git checkout 1-render
git rebase 0-other
git checkout 2-renderbasic
git rebase 1-render
git checkout 9-rendercontrol
git rebase 2-renderbasic
git checkout 6-control
git rebase 9-rendercontrol
git checkout 7-controlbasic
git rebase 6-control
git checkout 3-renderextra
git rebase 7-controlbasic
git checkout 8-controlextra
git rebase 3-renderextra
git checkout 4-renderawt
git rebase 8-controlextra
git checkout 5-rendersvg
git rebase 4-renderawt
git checkout 11-controlawt
git rebase 5-rendersvg
git checkout 10-unsorted
git rebase 11-controlawt
```

This give me, again a clean patch against the latest CDK master:

![](/blog/assets/images/jcpPatch.png)
