---
layout: post
title:  "Cleaner CDK Code #3: run the PMD tests"
date:   2010-03-26
blogger-link: https://chem-bla-ics.blogspot.com/2010/03/cleaner-cdk-code-3-run-pmd-tests.html
doi: 10.59350/0jvd2-er861
tags: cdk pmd
---

[PMD](http://pmd.sourceforge.net/) is a tool to run some tests against your source code. The check for code style,
common problems, and places where code could be improved. The [CDK](http://cdk.sf.net/) has been using it for years
now, such as [here for CDK 1.3.x](http://pele.farmbio.uu.se/nightly/pmdsummary.html).

## Running the PMD tests from the command line
When you are writing patches for the CDK, you can run the PMD tests via an Ant file, for example via the command line:

```
$ ant -f pmd.xml
```

However, when working on a single file, you will likely appreciated running the tests against a single module. This can be done with (for the data module):

```
$ ant -f pmd.xml -Dpmd.test=custom -Dmodule=data test-module
```

The [custom.xml](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=tree;f=pmd;h=80f6f928bf7b24acdb3c2a909550832b15365ef5;hb=HEAD)
defines the tests we normally run.

The pmd.xml does not create HTML pages, like Nightly does. Instead, an XML file is currently created. The
[xpath](http://manpages.ubuntu.com/manpages/lucid/en/man1/xpath.1p.html) utility can be used to filter out the
information we are interested in. For example, if we want to reports just about DefaultChemObjectBuilder, we issue:

```
$ xpath -e "//violation[@class='DefaultChemObjectBuilder']" \\
    reports/pmd/data.xml
```
