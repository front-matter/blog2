---
layout: post
title:  "Optical Chemical Structure Recognition"
date:   2007-07-31 00:10
modified_date: 2025-10-11
blogger-link: https://chem-bla-ics.blogspot.com/2007/07/optical-chemical-structure-recognition.html
doi: 10.59350/gh6e5-t2g74
tags: cheminf justdoi:10.1021/ci9601022 justdoi:10.1021/ci00008a018 justdoi:10.1016/S1359-6446(05)03682-2
---

Days after the release of [OSRA <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/07/20/osra-gpl-ed-molecule-drawing-to-smiles.html) last week, I saw
the *optical chemistry structure recognition* on the front page of my favorite Dutch [/.](http://www.slashdot.org/) equivalent,
[Tweakers.net](http://tweakers.net/), *[Duitsers leren computer chemische structuren herkennen](http://life.tweakers.net/nieuws/48640/Duitsers-leren-computer-chemische-structuren-herkennen.html)*,
written by [René Gerritsen](http://tweakers.net/plan/crew/134). The article discusses the Fraunhofer Institute's
[ChemoCR](http://www.scai.fraunhofer.de/chemocr.html), which was, IIRC, presented as poster at last year's
[German Conference on Chemoinformatics](http://scholle.oc.uni-kiel.de/users/cic/tagungen/workshop06/) (to be held again
[this year](http://www.gdch.de/gcc2007/)). Meanwhile, the CCL.net mailing list had a
[discussion on the alternatives](http://www.ccl.net/cgi-bin/ccl/day-index.cgi?2007+07+20) too; I think it is fair to say that
the chemical community realizes the importance of these tools. Below is a short overview of the available tools, including some
important information regarding integration into workflows.

## ChemoCR
ChemoCR seems to be proprietary software, as I could not find any download, and InfoChem seems to be the party to sell licenses.
The [screenshot](http://tweakers.net/ext/i/1185808728.gif) in the Tweakers.net article seems to show that is is written
in Java, but that hardly matters if not open source. The project is said to have started three years ago.

## CLiDE
[CLiDE](http://www.simbiosys.ca/clide/) is another commercial (expensive) program to do the job. It was developed more
than ten years ago, and the [most recent scientific publication](http://dx.doi.org/10.1021/ci9601022) is from 1997
(as the webpage states).

## OSRA
[OSRA](http://cactus.nci.nih.gov/osra/) (see my [previous blog <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/07/20/osra-gpl-ed-molecule-drawing-to-smiles.html))
is opensource and uses the GPL license. It is written in C++. It does not as feature complete as ChemoCR yet, but that
will surely come. This project is surely the youngest project.

## Kekule
I have not picked up copy of the paper [Kekule: OCR-optical chemical (structure) recognition](http://dx.doi.org/10.1021/ci00008a018)
cited by [Tony](http://www.chemspider.com/blog/?p=83), so cannot say much about that right now.

It is obvious that only OSRA lends itself to embedding in reproducable workflows. Debra Banville
[reviewed the two commercial programs CLiDE and ChemoCR](http://dx.doi.org/10.1016/S1359-6446(05)03682-2)
last year, along with a few other text mining tools in chemoinformatics. I am curious about her opinion of
the new opensource tools in this arena.
