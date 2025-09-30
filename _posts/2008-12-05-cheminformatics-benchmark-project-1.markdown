---
layout: post
title:  "Cheminformatics Benchmark Project #1"
date:   2008-12-05
blogger-link: https://chem-bla-ics.blogspot.com/2008/12/cheminformatics-benchmark-project-1.html
doi: 10.59350/wngzb-y3329
tags:
---

Yesterday's blog about [Who says Java is not fast?!?](http://chem-bla-ics.blogspot.com/2008/12/who-says-java-is-not-fast.html)
caused quite some feedback (thanx to all commenters!) with several good points. Of course, a table like that in the cinfony paper
(see also the comments in the blogs by [Noel](http://baoilleach.blogspot.com/2008/12/cinfony-paper-published-in-chemistry.html)
(the author) and [Rich](http://depth-first.com/articles/2008/12/04/choose-java-for-speed)). Many things determine why the CDK
might be fastest in that table for SDF iterating. Suggestions have been that OpenBabel and RDKit may be doing much more than simple reading; Java might actually take advantage of the second core for caching file content.

[ZZ](http://www.simbiosys.ca/blog/) observed something I overlooked: calculating the molecular mass in CDK is by far slowest
of all three toolkit, though people have suggestions on why that may is.

## Benchmarking

The correct way to compare toolkits, open source, proprietary, free, commercial, is to have a proper benchmark toolkit for
cheminformatics. That's what I am suggesting here: [a project to define simple and fair benchmarks](http://github.com/egonw/cheminfbenchmark/tree/master).
It's an open project, and anyone can contribute in order to keep tests balanced in impartial towards any tested toolkit.
