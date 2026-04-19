---
layout: post
title:  "Status update on BJOC analysis with Oscar and ChemicalTagger #3"
date:   2010-12-23
doi: 10.59350/8n7nt-fas57
blogger-link: https://chem-bla-ics.blogspot.com/2010/12/status-update-on-bjoc-analysis-with_23.html
tags: oscar chemicaltagger beilstein justdoi:10.1186/1860-5397-1-11
image: /assets/images/chemtag1.png
modified_date: 2026-04-19
---

The [two <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/12/11/status-update-on-bjoc-analysis-with_11.html)
[earlier <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/12/11/status-update-on-bjoc-analysis-with.html) posts
in this series showed screenshots of results of Oscar, but the title also promised results by Lezan's
[ChemicalTagger](http://www-ucc.ch.cam.ac.uk/products/software/chemicaltagger). Sam
helped with getting the HTML pages online via the Cambridge Hudson installation. Where
Oscar find named entities (chemical compounds, processes, etc), ChemicalTagger finds
roles, like solvent, acid, base, catalyst. Roles are properties of chemical compounds
in certain situations. Ethanol is not always a solvent, sometimes it is a Xmas present.
The current output is not entirely where I want to go yet, but makes it easy which
solvents are frequently found in the BJOC corpus:

![](/assets/images/chemtag1.png)

This screenshot of an analysis of 15 BJOC papers shows that AcOEt (is that the
[same as EtOAc?](http://lab.chempedia.com/questions/427/are-etoac-and-acoet-the-same))
is mentioned as solvent three times in [PMC1399459](http://www.ncbi.nlm.nih.gov/sites/ppmc/articles/PMC1399459).
Brine, however, is mentioned as solvent in three papers.

As said, these [two](https://hudson.ch.cam.ac.uk/job/oscar4-chebi/ws/target/output/bjoc.html)
[pages](https://hudson.ch.cam.ac.uk/job/oscar4-chebi/ws/target/output/roles.html) contain
RDF and the tables are sortable. Hudson recompiles them automatically when I update the
source code to create the HTML+RDFa. So, go ahead, send me bug reports, feature requests,
and patches!
