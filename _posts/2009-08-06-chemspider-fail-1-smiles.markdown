---
layout: post
title:  "ChemSpider fail #1: SMILES"
date:   2009-08-06
blogger-link: https://chem-bla-ics.blogspot.com/2009/08/chemspider-fail-1-smiles.html
doi: 10.59350/hf28w-ngd39
tags: chemspider smiles inchikey:RWRDLPDLKQPQOW-UHFFFAOYSA-N
image: /blog/assets/images/chemSpiderFail.png
---

Cheminformatics is difficult, I know. But I thought I used a simple SMILES when I typed *C1CNCC1*, but [ChemSpider](http://www.chemspider.com/)
got it wrong :) The correct structure should be [pyrrolidine](http://en.wikipedia.org/wiki/Pyrrolidine), not
[pyrrole](http://en.wikipedia.org/wiki/Pyrrole). I always mix up those names, so defaulted to ChemSpider to give me the correct name, which
[ChemSpider knows](http://www.chemspider.com/RecordView.aspx?rid=3fdc7226-0f87-44c5-b367-f3fdbda4bbde) and where it also has the
SMILES correct... there just seems something wrong with there search dialog:

![](/blog/assets/images/chemSpiderFail.png)

There has been [some talk about a ChemSpider Bugzilla](http://www.chemspider.com/blog/?p=55), but I don't think this has
materialized yet, and I'll have the default to *info-at-chemspider-dot-com* ...
