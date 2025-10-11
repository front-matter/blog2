---
layout: post
title:  "Comparing JUnit test results between CDK trunk/ and a branch #2"
date:   2008-05-02
modified_date: 2025-10-11
blogger-link: https://chem-bla-ics.blogspot.com/2008/05/comparing-junit-test-results-between.html
doi: 10.59350/frwk8-r6898
tags: cdk junit
---

I reported earlier on how to compare unit test results [between CDK trunk and a branch <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/11/07/comparing-junit-test-results-between.html).
Later, I noted that the diff typically overestimates the fail count, when unit tests had been moved to a different module. Therefore, a sort has
to be added. The code is also updated for the SVN directory restructuring:

```shell
$ cdk cdk/
$ cdk trunk/
$ ant -lib develjar/junit-4.3.1.jar -logfile ant.log test-all
$ cd ../branches/miguelrojasch-CMLReact
$ ant -lib develjar/junit-4.3.1.jar -logfile ant.log test-all
$ cd ..
$ grep Testcase trunk/reports/*.txt | cut -d':' -f2,3 | sort > trunk.results
$ grep Testcase branches/miguelrojasch-CMLReact/reports/*.txt | cut -d':' -f2,3 | sort > branch.results
$ diff -u trunk.results branch.results
```

Obviously, you can still use wc for counting changes:

```shell
$ diff -u trunk.results branch.results | grep "^-Testcase" | wc -l
$ diff -u trunk.results branch.results | grep "^+Testcase" | wc -l
```

A second improvement, would be taking advantage of the ant.log files that are created anyway. Using the
[BeanShell](http://www.beanshell.org/) tool [tools/extractTestStats.bsh <i class="fa-solid fa-recycle fa-xs"></i>](http://cdk.svn.sourceforge.net/viewvc/cdk/cdk/trunk/tools/extractTestStats.bsh?revision=10760&view=markup)
revision 10760 (see also [this blog on bsh](https://chem-bla-ics.linkedchemistry.info/2008/02/27/cdk-is-now-available-from-your-nearest.html)):

```shell
$ bsh trunk/tools/extractTestStats.bsh trunk/ant.log | grep run | grep -v total | grep -v antlogFile | cut -d' ' -f1-4 | sort > trunk.overview
$ bsh trunk/tools/extractTestStats.bsh branches/miguelrojasch-CMLReact/ant.log | grep run | grep -v total | grep -v antlogFile | cut -d' ' -f1-4 | sort > branch.overview
$ diff -u trunk.overview branch.overview
```
