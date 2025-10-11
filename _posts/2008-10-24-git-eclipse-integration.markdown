---
layout: post
title:  "Git-Eclipse integration"
date:   2008-10-24
modified_date: 2025-10-11
blogger-link: https://chem-bla-ics.blogspot.com/2008/10/git-eclipse-integration.html
doi: 10.59350/sejc5-h3m89
tags: git eclipse
image: /assets/images/gitEclipse.png
---

Recently, I have been blogging about [Git](http://git.or.cz/):

* [GitToDo support for Freemind <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2008/10/20/gittodo-support-for-freemind-graphical.html)
* [Git mirror for the CDK <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2008/09/30/git-mirror-for-cdk.html)
* [CDK development with branches using Git <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2008/09/07/cdk-development-with-branches-using-git.html)
* [Offline CDK development using git-svn <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/10/31/offline-cdk-development-using-git-svn.html)

One concern expressed by people was the lack of integration with IDEs. Now, an [Eclipse plugin](http://git.or.cz/gitwiki/EclipsePlugin)
seems well on its way:

![](/assets/images/gitEclipse.png)

With a experimental update site ([http://www.jgit.org/update-site](http://www.jgit.org/update-site)),
the plugin is just an Eclipse reboot away.

Now, the plugin is still in its early stages and many [open feature requests](http://git.or.cz/gitwiki/EclipsePluginWishlist),
but fortunately the bug tracker can easy be [integrated with Mylyn](http://code.google.com/p/egit/wiki/ConfiguringMylyn),
and is [still actively developed](http://repo.or.cz/w/egit.git?a=log).

Cheers to Shawn and Robin for their work!
