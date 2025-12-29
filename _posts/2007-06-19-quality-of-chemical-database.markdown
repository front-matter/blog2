---
layout: post
title:  "Quality of Chemical Database"
date:   2007-06-19 00:10
modified_date: 2025-08-10
doi: 10.59350/49wqj-62k11
blogger-link: https://chem-bla-ics.blogspot.com/2007/06/quality-of-chemical-database.html
tags: justdoi:10.1186/1471-2105-7-517 opendata chemistry doi:10.1021/CI034244P pubchem rdf
  justdoi:10.59350/jy0f5-7m219 justdoi:10.59350/zwnp1-qy767 nmrshiftdb
---

Lately, [Chemical blogspace](http://cb.openmolecules.net/) has seen an interesting discussion on the quality of opendata and free chemical database (over
[32 free resources now <i class="fa-solid fa-recycle fa-xs"></i>](https://doi.org/10.59350/jy0f5-7m219)), such as the
[NMRShiftDB.org](http://nmrshiftdb.org/). For example, see [Antony's view on the NMRShiftDB](http://www.chemspider.com/blog/?p=44)
and [Robien's analysis](http://nmrpredict.orc.univie.ac.at/csearch_summary/more_or_less_than_250_errors.html).

[Opendata](http://en.wikipedia.org/wiki/Open_data) makes such quality assurance possible, and I am happy that the NMRShiftDB was
explored like this; the found problems can be reported and corrected. If correcting them upstream is difficult, opendata allows
one to make a better derivative; that's what opendata is about. For example, [BioMeta](http://biometa.cmbi.ru.nl/)
(DOI:[10.1186/1471-2105-7-517](https://doi.org/10.1186/1471-2105-7-517)) took data from KEGG and corrected a lot of molecular
problems (like reaction balancing, stereo chemistry, etc).

I have contributed almost 900 spectra to the NMRShiftDB, and I am sure I may have made a mistake here and there. But my submission is verified
by a reviewer, and furthermore, users of the database can report inconsistencies via the NMRShiftDB.org website. Now, I have focused on uncommon
NMR nuclei, like <sup>11</sup>B, <sup>195</sup>Pt and <sup>29</sup>Si (see the [stats](http://nmrshiftdb.ice.mpg.de/nmrshiftdbhtml/statistics.html)),
which tend to have only one peak. Nothing much that can go wrong; still, one or two errors were catched by the reviewer.

## Ensuring data quality

Humans make errors, but not even only when data is entered; they make mistakes checking data too. Nothing much that can
be done about that, other than using computers to find patterns. This is exactly what Robien did: he used his software
which implements common patterns to find entries in the database that did not comply to those patterns.

Automated quality assurance requires a easy to use, machine-readable interface. For example, CMLRSS
(DOI:[10.1021/ci034244p](https://doi.org/10.1021/ci034244p)) can be used for running new entries in databases
against known patterns. But other interfaces are most welcome too. Rich recently
[discussed the new PUG interface <i class="fa-solid fa-recycle fa-xs"></i>](https://doi.org/10.59350/zwnp1-qy767),
which offers an interface to [PubChem](http://pubchem.ncbi.nlm.nih.gov/).

German scientists offer a RDF interface to [Wikipedia](http://wikipedia.org/): [DBPedia](http://dbpedia.org/).
Informal semantic markup in Wikipedia, such as the [Infobox template](http://en.wikipedia.org/wiki/Wikipedia:Infobox_templates),
[are used to create triples](http://dbpedia.org/docs/). It's a shame that the [ChemBox](http://en.wikipedia.org/wiki/Template:Chembox)
is not used yet, which would make [detecting molecules in blogs <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/06/19/using-wikipedia-to-recognize-molecules.html)
even easier.
