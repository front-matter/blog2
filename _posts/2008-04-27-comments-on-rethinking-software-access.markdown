---
layout: post
title:  "Comments on 'Rethinking software access'"
date:   2008-04-27
blogger-link: https://chem-bla-ics.blogspot.com/2008/04/comments-on-rethinking-software-access.html
doi: 10.59350/37jh5-ybw75
tags: opensource cml jmol jchempaint justdoi:10.1038/451648a
modified_date: 2025-10-11
---

[bbgm](http://mndoci.com/blog/blog/) was [rethinking software access](http://mndoci.com/blog/2008/04/26/rethinking-software-access/).
The blog observes:

1. current commercial licensing is unfriendly towards home science
2. bench tools do not easily allow mash ups

## About 1
Actually, much of the work I have been doing in opensource chemoinformatics was done as 'home' science; I started as organic chemist
student, and later data analyst, while the CDK/Jmol/JChemPaint was something I did at home because I liked, and needed it. I started
in 1995 working on a website to aid my organic chemistry studies, the *Woordenboek Organische Chemie* (open data). And, I needed
semantic tools for 2D and 3D display of molecular structure. Commercial offerings were not an option, for me as student, so I got
involved with the [Chemical Markup Language](http://cml.sourceforge.net/), [Jmol](http://www.jmol.org/) and
[JChemPaint](http://jchempaint.sf.net/) in 1997-98.

Note, that in that time free academic licenses were rarer than now. I always had, and still have, the feeling that those clauses are
just there to give academics a reason to support non-opensource tools. Also note that a lot of commercial offerings started as
incorporation of the code base of some PhD work. Not uncommonly, the PhD would simply be hired by the company.

Fact is, commercial chemoinformatics licenses are indeed unfriendly for scientists who maintain related hobbies at home. And,
given my experience, I appreciate your worries: the high costs for those tools, which I certainly could not afford with my student
funding, drove me to the opensource ideas many, many years ago.

## About 2
The second issue brought up, regards the ability to make mash ups. Open source and open standards are indeed important to make
mash ups, though the former only helps you work around lack of use of open standards. Using web services contributes to the
solution as it has a well-defined, open standard interface. Open source is particularly important for reproducibility of scientific
results (see [my thesis <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2008/03/01/todo-april-2nd-defend-my-phd-work.html)), and is the opposite of
proprietary software, not commercial software. So, it seems bbgm is just looking for
[Blue Obelisk](http://www.blueobelisk.org/) projects.

On a practical note, I think that [Bioclipse](http://www.bioclipse.net/) might just be what you are looking for, and integrates
local services as well as services on the internet, just alike. Particularly, the upcoming
[Bioclipse2](http://wiki.bioclipse.net/index.php?title=Bioclipse2) is strong at this, and supports
[SOAP](http://wiki.bioclipse.net/index.php?title=Bc_webservices), BioMart,
[BioMoby](http://wiki.bioclipse.net/index.php?title=BioMoby_plugin) for online services (also
[see this](http://bioclipse.blogspot.com/2008/03/general-service-infrastructure-in.html)), as well as
[R](http://www.r-project.org/), BioJava, CDK, Jmol as local services. You can even
[run Taverna workflows](http://wiki.bioclipse.net/index.php?title=Run_Workflows_inside_Bioclipse) from within Bioclipse, if you
like. Mash ups can be done in various ways. Hard code Java coders would go the RCP plugin way, for example
[this nanotube example](http://bioclipse.blogspot.com/2008/04/jnanotube-nanotube-plugin-for-bioclipse.html). Others will prefer
[scripting languages](http://bioclipse.blogspot.com/2008/01/complete.html), such as JavaScript and Ruby (in addition to R and
Jmol scripting). Or, you might do record as script the tihngs you did graphically, using the
[recording feature](http://bioclipse.blogspot.com/2008/03/recording-progress.html).

Of course, there are other solutions... Bioclipse is just one, one to which I contributed.

## About running webservices...
Running webservices, is basically being hosting provider, and requires some commercial model. One conflicting problem is that,
at least being said, that large groups withing the potential user base, aka pharma industry, does not even like sending over
their highly secret data over an `httpS://` line to the outside world.

[Rajarshi](http://cheminfo.informatics.indiana.edu/~rguha/) and the rest of the Indiana group have been running chemoinformatics
webservices. They might be the provider you are looking for.

## Conclusion
All I can say to bbgm: "Yes, your two thoughts are indeed issues, and many from within the Blue Obelisk community have been
addressing them." Oh, and we will not stop either. [Peter](http://wwmm.ch.cam.ac.uk/blogs/murrayrust/) recently gave in
Nature a nice overview of what we, Blue Obelisk members, have been cooking on:
[Chemistry for Everyone](http://www.nature.com/nature/journal/v451/n7179/full/451648a.html): and *that* includes the
hobby scientist.
