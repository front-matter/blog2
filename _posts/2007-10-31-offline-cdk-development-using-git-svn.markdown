---
layout: post
title:  "Offline CDK development using git-svn"
date:   2007-10-31
blogger-link: https://chem-bla-ics.blogspot.com/2007/10/offline-cdk-development-using-git-svn.html
doi: 10.59350/fvbts-sc941
tags: git svn cdk
---

While [Subversion](http://subversion.tigris.org/) is a signification improvement over [CVS](http://www.nongnu.org/cvs/), they both require a
central server. That is, they do not allow me to commit changes when I am not connected to that server. This is annoying when being on a
long train ride, or somewhere else without internet connectivity. I can pile up all my changes, but that would yield one big ugly patch.

Therefore, I tried [Mercurial](http://www.selenic.com/mercurial/wiki/) where each client is server too. The version I used, however, did
not have the move command, so it put me back into the old CVS days where I lost the history of a file when I reorganize my archive.

## Git

Then [Git](http://git.or.cz/), the version control system developed by [Linus Torvalds](http://en.wikipedia.org/wiki/Linus_Torvalds) when he
found that existing tools did not do what he wanted to do. It seems a rather good product, though with a somewhat larger learning curve,
because of the far more flexible architecture (see [this tutorial](http://www.kernel.org/pub/software/scm/git/docs/tutorial.html)).
Well, [it works for the Linux kernel](http://kernel.org/doc/local/git-quick.html), so must be good :)

Now, [SourceForge](http://www.sf.net/) does not have Git support yet, so we use Subversion. [Flavio](http://www.flavio.castelli.name/),
of [Strigi](http://strigi.sf.net/) fame, however, [introduced me to git-svn](http://www.flavio.castelli.name/howto_use_git_with_svn).
Almost two month ago, already, but finally made some time to try it out. I think I like it.

This is what I did to make [a commit to CDKs SVN repository](http://cdk.svn.sourceforge.net/viewvc/cdk/trunk/cdk/.classpath?r1=8523&r2=9271):

```shell
$ sudo aptitude install git-svn git-core
$ mkdir -p git-svn/cdk-trunk
$ cd git-svn/cdk-trunk
$ git-svn init https://cdk.svn.sourceforge.net/svnroot/cdk/trunk/cdk
$ git-svn fetch -rHEAD
$ nano .classpath
$ git add .classpath
$ git commit
$ git-svn dcommit
```

The first git-svn command initializes a log Git repository based on the SVN repository. The `git-svn fetch` command makes a local copy of
the SVN repository content defined in the previous command. Local changes are, by default, not commited; unless one explicitly git adds
them to a patch. Once a patch is ready you can do all sorts of interesting things with them, among with commit them to the local Git
repository with `git commit`.

Now, these kind of commits are on the local repository, and I do not require internet access for that. When I am connected again, I can
synchronize my local changes with the SVN repository with the `git-svn dcommit` command.

A final important command is `git-svn rebase`, which is used to update the local git command for changes others made to the SVN repository.
