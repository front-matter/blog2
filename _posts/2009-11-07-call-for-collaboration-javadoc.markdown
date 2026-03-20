---
layout: post
title:  "Call for Collaboration: JavaDoc validation with OpenJavaDocCheck"
date:   2009-11-07
blogger-link: https://chem-bla-ics.blogspot.com/2009/11/call-for-collaboration-javadoc.html
doi: 10.59350/49cn8-6n163
tags: cdk javadoc
image: /blog/assets/images/ojdcheck.png
---

I reported recently about my efforts to write an [Open Source DocCheck replacement](http://chem-bla-ics.blogspot.com/2009/10/work-in-progress-open-doccheck.html).
I received the first patches (from [Rajarshi](http://blog.rguha.net/)), and brought it online in a [CDK](http://cdk.sf.net/) branch (see
[this Nightly page](http://pele.farmbio.uu.se/nightly-ojdcheck/ojdcheckSummary.html)).

![](/blog/assets/images/ojdcheck.png)

This list shows a mix of tests that are now implemented in OpenJavaDocCheck itself, but the third line is actually a test that is plugged in and specific for the CDK. This is an important feature, I think, and allows users of OpenJavaDocCheck to add functionality is that is not interesting to the general public, but very interesting for the JavaDoc being analyzed. Well, at least, it is to our CDK project :)

The current list of tests is still quite small, and consists of these tests:

* test if each class and method has JavaDoc
* test for missing @return tags
* test for missing @param tags
* test for @returns instead of @return
* test @param template code, such as added by IDEs like Eclipse
* test @exception template code, such as added by IDEs like Eclipse
* test for redundant @version tags

I am now [seeking feedback](http://github.com/egonw/ojdcheck/issues) on the current code base, and potentially collaboration with writing more
JavaDoc validation tests. There is enough to do, and I have been thinking on tests for:

* spell checking JavaDoc
* checking for 404s of web pages linked with `<a href>` in the JavaDoc
* well-formedness of the HTML in the webpages

And about:

* a PMD-like system to allow people to choose which testing they want or not
* an Eclipse plugin
