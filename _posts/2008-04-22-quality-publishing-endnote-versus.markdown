---
layout: post
title:  "Quality Publishing: EndNote versus InChIs"
date:   2008-04-22
modified_date: 2025-10-11
blogger-link: https://chem-bla-ics.blogspot.com/2008/04/quality-publishing-endnote-versus.html
doi: 10.59350/jgk66-e2a52
tags: publishing inchi justdoi:10.1186/1860-5397-3-50 cml rss foaf
---

Some publishers hesitate a bit, but others go full speed ahead into the electronic publishing era.
[Noel](http://baoilleach.blogspot.com/) commented on my [post about OA/OD inviting added value <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2008/04/21/open-access-open-data-leads-to-added.html):

> I heard a talk by the [RSC](http://www.rsc.org/) at the ACS, saying that their RSS feeds contain
> [InChI](http://www.iupac.org/inchi/)s now! Just thought I'd throw that out there :-)

The RSC [Project Prospect](http://www.rsc.org/Publishing/Journals/ProjectProspect/) is ahead of other
publishers, for [over a year already <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/02/01/rsc-first-publisher-to-go-semantic.html).
Adding InChIs to RSS feeds are a cheap way of adding machine-readable chemistry to ones publishing
pipeline; adding CML would allow much more detail (see
[this overview of CMLRSS information in my blog](http://chem-bla-ics.blogspot.com/search?q=CMLRSS)). <!-- keep link -->

But, importantly, it allows third-parties to efficiently set up DOI-InChI tables. Cheap (Asian?) workers become
rather expensive, when compared to machine mining to create such databases. Sure, the authoring becomes
somewhat more expensive, but who will argue that scientists might be a bit more precise in what they
publish. I, for sure, would love to see authors focus on adding InChIs to experimental sections, then
that they focus on getting EndNote to put the comma, bold and upper casing in the right place, to meet
journal standards.

Another publisher who takes its job seriously is [Beilstein](http://www.beilstein-journals.org/).
Stephan recently showed me some of the things they are up too, like information rich figures (yes,
you'll have access to the source, and identify the molecular structures in reaction schema). He
also showed me to the RDF now by default available for all their articles. For example, for
DOI:[10.1186/1860-5397-3-50](http://dx.doi.org/10.1186/1860-5397-3-50),
[the RDF is available here](http://www.beilstein-journals.org/bjoc/content/rdf/1860-5397-3-50.rdf).
It's indicated in the HTML with:

```html
<link rel='alternate' type='text/rdf' title='RDF' href='http://www.beilstein-journals.org/bjoc/content/rdf/1860-5397-3-50.rdf'/>
```

There is, actually, also a lot of citation information available in the `<meta>` tags in the HTML,
but apparently not the right stuff yet to have [Zotero](http://www.zotero.org/) pick it up nicely
(not sure what this Firefox plugin is actually looking for). No chemistry in the RDF it seems,
but there is [BIBO <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2008/03/10/my-foaf-network-3-my-publications.html),
[FOAF <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/tag/foaf) and Dublin Core.

Main suggestion to Stephan, right now, would be to include InChIs in the RDF and RSS feed.

Disclaimer: [Colin](http://chem-bla-ics.blogspot.com/search?q=project+prospect+CUBIC), behind <!-- keep link -->
Project Prospect, visit our group when I was still in Cologne; Stephan contributed code bits
to the CDK project, e.g. this [this Matrix class](http://cheminfo.informatics.indiana.edu/~rguha/code/java/nightly/api/org/openscience/cdk/math/Matrix.html).

Oh, [Nature <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/10/16/lunch-at-nature-hq-with-euan-joanna-ian.html) is,
of course, also a publisher who actively gets into electronic publishing age.
