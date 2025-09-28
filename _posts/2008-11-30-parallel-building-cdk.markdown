---
layout: post
title:  "Parallel building the CDK"
date:   2008-11-30
blogger-link: https://chem-bla-ics.blogspot.com/2008/11/parallel-building-cdk.html
doi: 10.59350/kcxg1-z9t12
tags: cdk
image: /blog/assets/images/buildtimes.png
---

Some time ago, I added parallel building targets for [CDK](http://cdk.sf.net/)'s [Ant](http://ant.apache.org/) `build.xml`. Now that I am setting up a
[Nightly](http://pele.farmbio.uu.se/nightly/) for the [jchempaint-primary](http://cdk.svn.sourceforge.net/viewvc/cdk/cdk/branches/jchempaint-primary/) branch,
and really only want to report on the CDK modules `control` and `render`, I need the build system to use a properties files to define which modules
should be compiled.

So, I hacked a bit on the build system, and made use of two [ant-contrib](http://ant-contrib.sourceforge.net/) tasks, `if` and `foreach` which in the first
place reduce the size of the `build.xml`, but also provide means for parallelization. Earlier, it was using the `parallel` task of
Ant itself for this (see [CDK Module dependencies #2](http://chem-bla-ics.blogspot.com/2008/03/cdk-module-dependencies-2.html)).

The build dependencies between CDK modules are fairly complex, and typically this complexity increases upon bug fixing etc. Ideally, the build dependencies
will be calculated on runtime, instead of being hard-coded right now, and I will explore this in the near future.

These dependencies can be used to build some of the module in parallel, but not all. This causes speed up of the compilation not to scale linearly with the number of
threads or cores. The [below build times](http://spreadsheets.google.com/ccc?key=pdSdCFxXYzmOnssF4qVzwCw&hl=en) are calculated for three replicates, on a four
core machine:

![](/blog/assets/images/buildtimes.png)

Going from one to two threads certainly pays of, but going to 4 shows only a three second speed up. The four processor cores were not utilized 100%,
so I also attempted 2 threads core, but that showed zero improvement.
