---
layout: post
title:  "Bioclipse and Gist integration"
date:   2009-01-16
blogger-link: https://chem-bla-ics.blogspot.com/2009/01/bioclipse-and-gist-integration.html
doi: 10.59350/gkcs6-62t68
tags: bioclipse git github
image: /blog/assets/images/gist3.png
---

As you might have read, [Bioclipse](http://www.bioclipse.net/) has scripting support (see for example, [Scripting JChemPaint](http://chem-bla-ics.blogspot.com/2008/11/scripting-jchempaint.html)),
and that we have been collection them on [Gist](http://gist.github.com/) and indexing them on Delicious with the tags [bioclipse and gist](http://delicious.com/tag/bioclipse+gist).
This provides a nice overview of what you can do with the current SVN version of Bioclipse2. And, hopefully, when released, allow users to quickly learn about Bioclipse features,
allow people to share scripts etc. Think of it as [MyExperiment.org](http://myexperiment.org/) for Bioclipse.

Now, what was missing until today, was easy access to gists in Bioclipse itself. No `gist.load(33421)` yet. There still is not, but I uploaded earlier today a Wizard for it.
(The manager will follow later). Right click on an open Project, select New -> Other, and pick *Download Gist*:

![](/blog/assets/images/gist3.png)

and click *Next*:

![](/blog/assets/images/gist4.png)

Then, just type the number of the Gist you want to open in Bioclipse, for example [18315](http://gist.github.com/18315) (see
[Bioclipse2 Scripting #1: from SMILES to a UFF optimized structure in Jmol](http://chem-bla-ics.blogspot.com/2008/10/bioclipse2-scripting-1-from-smiles-to.html)),
and click another *Next* to select a file name and location:

![](/blog/assets/images/gist5.png)

The current code does require you to know the Gist number, so you'll need a web browser to look it up, but we do have search facilities in mind. Also, while the code
attempts so, the resulting Gist is not automatically openend in an editor (a bug). Another idea is to just install the
[egit](http://chem-bla-ics.blogspot.com/2008/10/git-eclipse-integration.html) plugin in Bioclipse :)
