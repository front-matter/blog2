---
layout: post
title:  "Git-Eclipse integration"
date:   2008-10-24
blogger-link: https://chem-bla-ics.blogspot.com/2008/10/git-eclipse-integration.html
doi: 10.59350/sejc5-h3m89
tags: git eclipse
image: /blog/assets/images/gitEclipse.png
---

Recently, I have been blogging about [Git](http://git.or.cz/):

* [GitToDo support for Freemind](http://chem-bla-ics.blogspot.com/2008/10/gittodo-support-for-freemind-graphical.html)
* [Git mirror for the CDK](http://chem-bla-ics.blogspot.com/2008/09/git-mirror-for-cdk.html)
* [CDK development with branches using Git](http://chem-bla-ics.blogspot.com/2008/09/cdk-development-with-branches-using-git.html)
* [Offline CDK development using git-svn](http://chem-bla-ics.blogspot.com/2007/10/offline-cdk-development-using-git-svn.html)

One concern expressed by people was the lack of integration with IDEs. Now, an [Eclipse plugin](http://git.or.cz/gitwiki/EclipsePlugin)
seems well on its way:

![](/blog/assets/images/gitEclipse.png)

With a experimental update site ([http://www.jgit.org/update-site](http://www.jgit.org/update-site)),
the plugin is just an Eclipse reboot away.

Now, the plugin is still in its early stages and many [open feature requests](http://git.or.cz/gitwiki/EclipsePluginWishlist),
but fortunately the bug tracker can easy be [integrated with Mylyn](http://code.google.com/p/egit/wiki/ConfiguringMylyn),
and is [still actively developed](http://repo.or.cz/w/egit.git?a=log).

Cheers to Shawn and Robin for their work!
