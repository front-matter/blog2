---
layout: post
title:  "Bugzilla Eclipse IDE integration: Mylyn"
date:   2008-10-20 00:10
blogger-link: https://chem-bla-ics.blogspot.com/2008/10/bugzilla-eclipse-ide-integration-mylyn.html
doi: 10.59350/a10pf-47781
tags: eclipse bioclipse
image: /blog/assets/images/bugzilla.png
---

A new environment means new tools. [Bioclipse](http://www.bioclipse.net/) is Eclipse RCP-based, so colleagues work with Eclipse and are much more into
Eclipse too. For example, into [Mylyn](http://www.eclipse.org/mylyn/). Mylyn is a tool to track tasks and assign context to them. The tasks I am interested
in (for this blog item), is fixing bug reports. Mylyn is rather suited for this, as it allows linking Java source files to bug reports. With a growing list
of *projects* in my navigator, browsing them becomes difficult because the list is way too long. Mylyn allows me to only show those source files which are
actually related to the bug I am fixing. Cool!

However, SourceForge, our bug tracker, integrates, but to too limited functionality. [Bugzilla](http://www.bugzilla.org/), though, has excellent integration.
And curious about what that would look like, I installed Bugzilla on an Ubuntu system. Which failed. Due to a bug know for two years already! Anyway, two
tweaks to the system got it working!

1. Work around the password in the postinstall script (see [here](http://ph.ubuntuforums.com/showthread.php?t=625588))
2. Set up a /bugs/ link (see [here](http://ubuntuforums.org/showthread.php?t=405283))

This is Bugzilla as viewed in Mylyn:

![](/blog/assets/images/bugzilla.png)

(The bug content is derived from [Ubuntu bug #1.](https://bugs.launchpad.net/bugs/1))
