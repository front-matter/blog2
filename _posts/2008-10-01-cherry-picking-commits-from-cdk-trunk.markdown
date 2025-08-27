---
layout: post
title:  "Cherry-picking commits from CDK trunk: how to make a reasonable commit message"
date:   2008-10-01
blogger-link: https://chem-bla-ics.blogspot.com/2008/10/cherry-picking-commits-from-cdk-trunk.html
doi: 10.59350/6h7hy-t8615
tags: git cdk
---

Some of you heard me complain about commit messages resulting from `git cherry-pick` which allows me to apply patches from
[CDK](http://cdk.sf.net/) [trunk](http://cdk.svn.sourceforge.net/viewvc/cdk/cdk/trunk/) to a branch, without needing to do
a full merge of what happens in trunk. The commit messages would be identical, which made it seem that those original messages were mine.

However, this is how I can modify those messages:

```shell
$ git commit --amend
```

This allows me to convert a mere *refactored a method* into *Applied patch from trunk (rev 12479): [shk3] refactored a method*.
