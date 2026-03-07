---
layout: post
title:  "Extension point for running JUnit tests in a RCP Application instance?"
date:   2009-09-23
blogger-link: https://chem-bla-ics.blogspot.com/2009/09/extension-point-for-running-junit-tests.html
doi: 10.59350/wprrw-p9490
tags: eclipse bioclipse junit
---

One thing that has been on my wishlist is to be able to run the unit tests we have for [Bioclipse](http://www.bioclipse.net/) from inside a
running Bioclipse instance. That is, we have a Bioclipse Test Suite features on the update site, matching the functional features we have
there. Each such test suite would run all [JUnit](http://www.junit.org/) tests we have for that feature.

The good thing about this is twofold:

1. users can verify that their installation is working as intended
2. the development team can easily run the test suite on foreign systems, without the need to install a fully operational [Eclipse](http://www.eclipse.org/) with Bioclipse development workspace

Now, the tricky thing is likely the following. How do we get to run all test suites? That is, I don't want to need to have to run the suites
for each feature separately. Of course, this is exactly what [extension points](http://www.vogella.de/articles/EclipseExtensionPoint/article.html)
are for.

So, my question is, did anyone set up an system like this? And, is there an extension point that allows features to plugin additional
JUnit test suites into a larger test suite dynamically?
