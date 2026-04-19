---
layout: post
title:  "Supramolecular chemistry"
date:   2010-12-11 00:20
modified_date: 2026-04-19
blogger-link: https://chem-bla-ics.blogspot.com/2010/12/supramolecular-chemistry.html
doi: 10.59350/5wjex-vtd55
tags: oscar beilstein chemistry justdoi:10.3762/bjoc.6.32
  inchikey:ZXBXTKLPJKVXBD-KKLWWLSJSA-N
---

Some smart software developer once said to not optimize your code too early. However, not caring about it at all does not help either.
Some basic knowledge of memory management can keep you going. That is, I just ran into the limits of [Oscar](http://oscar3-chem.sf.net/)
and ChemicalTagger. As I blogged earlier today, I am [analyzing the BJOC literature <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/12/11/status-update-on-bjoc-analysis-with.html),
but Lezan and I are running into a reproducible out-of-memory exception. At first I thought it was a memory leak, as it was the 95th
paper if fell over on, but after we optimized our code a bit, by reusing classes, the problem remained and turned out to be not in
recreating objects (though the code is significantly faster now), but in a single BJOC paper being too large.

The particular paper is not even ridiculously large, though it has an amazing 800 references! The paper, *Molecular recognition of
organic ammonium ions in solution using synthetic receptors* (doi:[10.3762/bjoc.6.32](https://doi.org/10.3762/bjoc.6.32)), is in
fact an interesting review paper on supramolecular chemistry. The molecules I worked on (see one below) in my own supramolecular chemistry
time (doing a M.Sc. minor (6 month practical) with Peter Buijnsters in organic chemistry in the
[group of Prof. Nolte](http://www.molchem.science.ru.nl/about.php)), are actually of the type they review, though surfactants are
not really covered in it particularly.

![](/assets/images/surfactant2002.png)

Yeah, supramolecular chemistry has this nice level complexity; it is so supramolecular, that it is currently outside the scope
of the molecular analysis of Oscar and ChemicalTagger ;)

* Buijnsters, P. J. J. A.; García-Rodríguez, C. L.; Willighagen, E. L.; Sommerdijk, N. A. J. M.; Kremer, A.; Camilleri, P.; Feiters, M. C.;
  Nolte, R. J. M.; Zwanenburg, B. (2002). Cationic Gemini Surfactants Based on Tartaric Acid: Synthesis, Aggregation, Monolayer Behaviour,
  and Interaction with DNA European Journal of Organic Chemistry, 2002 (8), 1397-1406 :
  DOI:[10.1002/1099-0690(200204)2002:8%3C1397::AID-EJOC1397%3E3.0.CO;2-6](https://doi.org/csqhbn)
