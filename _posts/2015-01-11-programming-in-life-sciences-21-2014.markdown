---
layout: post
title:  "Programming in the Life Sciences #21: 2014 Screenshots #1"
date:   2015-01-11
blogger-link: https://chem-bla-ics.blogspot.com/2015/01/programming-in-life-sciences-21-2014.html
doi: 10.59350/vbvzk-2d025
tags: pra3006 openphacts
image: /assets/images/pra3006_screenshot1.png
---

December saw the end of this year's PRA3006 course (aka [#mcspils](http://chem-bla-ics.blogspot.nl/2013/10/programming-in-life-sciences-1-six-day.html)).
Time to blog some screenshots of the student projects. Like last year, the aim is to use the [Open PHACTS API](https://dev.openphacts.org/)
to collect data with [ops.js](https://github.com/openphacts/ops.js) and which should then be visualized in a HTML page, preferably with
[d3.js](http://d3js.org/). This year, all projects reached that goal.

## ACE inhibitors

The first team (Mischa-Alexander and Hamza) focused on the [ACE inhibitors](https://en.wikipedia.org/wiki/ACE_inhibitor) (type:"drug class") and the
[WP554 from WikiPathways](http://wikipathways.org/index.php/Pathway:WP554). The use a tree structure to list inhibitors along with their activity:

![](/assets/images/pra3006_screenshot1.png)

The source code for this project is available under a MIT license.

## Diabetes

The second team (Catherine and Moritz) looked at compounds hitting diabetes mellitus targets. They take advantage from the new disease API methods and
first ask for all targets for the disease, and then query for all compounds. Mind you, the compounds are not filtered by activity, so it mostly shows
interactions that real targets.

![](/assets/images/pra3006_screenshot2.png)

This product too is available with the MIT license.

## Tuberculosis

The third project (Nadia en Loic) also goes from disease to targets and they looked at tuberculosis.

![](/assets/images/pra3006_screenshot3.png)

## Asynchronous calls

If you know the ops.js, d3.js, and JavaScript a bit, you know that these projects are not trivial. The remote web service calls are made in an
asynchronous manner: each call comes with a callback function that gets called when the server returns an answer, at some future point in time.
Therefore, if you want to visualization, for example, compounds with activities against targets for a particular disease, you need two web service
calls, with the second made in the callback function of the first call. Now, try to globally collect the data from that with JavaScript and HTML,
and make sure to call the visualization call when all information is collected! But even without that, the students need to convert the returned
web service answer into a format that d3.js can handle. In short: quite a challenge for six practical days!
