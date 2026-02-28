---
layout: post
title:  "NMRShiftDB RDF #2: Some statistics"
date:   2009-09-05
blogger-link: https://chem-bla-ics.blogspot.com/2009/09/nmrshiftdb-rdf-2-some-statistics.html
doi: 10.59350/3afny-p1c44
tags: nmrshiftdb sparql justdoi:10.1021/jo971176v
---

This morning I had some more fun, and since the [statistics](http://www.ebi.ac.uk/nmrshiftdb/nmrshiftdbhtml/statistics.html) view on the
[NMRShiftDB](http://www.nmrshiftdb.org/) server is down, I though I could recalculate the statistics myself. Because the current RDF
version of the data does not include all information yet, I cannot reproduce all of them. On the other hand, I can determine some other
interesting statistics.

## Spectra per spectrum type

One of the statistics given in the aforementioned page is the number of spectra per nuclei. This can be recalculated with the following SPARQL:

<script src="https://gist.github.com/181315.js"></script>

The results for the 1.3.3 release are:

|nucleus|count|
|-------|-----|
|13C|21958|
|1H|3031|
|11B|326|
|17O|131|
|15N|79|
|195Pt|68|
|19F|50|
|31P|38|
|73Ge|18|
|33S|8|
|29Si|5|

I am a bit surprised by the count for the silicon NMR spectra, as I would have thought I alone had entered more than just five.

## Molecules with the most spectra

It turns out that the molecules have in the 1.3.3 NMRShiftDB release at most 7 spectra, as I can calculate with:

<script src="https://gist.github.com/181324.js"></script>

That is going to change, as the paper I am digitizing now (doi:[10.1021/jo971176v](http://dx.doi.org/10.1021/jo971176v)) has carbon and
hydrogen NMR spectra for 7 solvents for each compound :) It should be possible to summarize the number of molecules for each number of
spectra per molecule, but did not manage to get this SPARQL to work out well.

BTW, did you know you can find reprint PDFs of a paper (if any; this one happens to have a [PDF copy](http://ccc.chem.pitt.edu/wipf/Web/4505.pdf))
with Google using the title in quotes and `filetype:pdf`? Try [this query](http://www.google.com/search?hl=en&&as_epq=NMR+Chemical+Shifts+of+Common+Laboratory+Solvents+as+Trace+Impurities+&as_oq=&as_eq=&num=10&lr=&as_filetype=pdf&ft=i&as_sitesearch=&as_qdr=all&as_rights=&as_occt=any&cr=&as_nlo=&as_nhi=&safe=images).
The top hit was molecule 10016314 ([RDF](http://pele.farmbio.uu.se/nmrshiftdb/?moleculeId=10016314)), which has 4 <sup>13</sup>C
spectra, one <sup>15</sup>N and two proton NMR spectra.

## Molecules with the most different nuclei

In the first query, we already save saw in the first SPARQL, there are 11 different nuclei in the database, though carbon and
hydrogen are by far the most abundant spectra. I like diversity, so one statistic I find interesting, is the molecules which
have spectra with the most different nuclei. This is done with the query:

<script src="https://gist.github.com/181326.js"></script>

It shows that molecule 10023801 ([RDF](http://pele.farmbio.uu.se/nmrshiftdb/?moleculeId=10023801)) has 5 different NMR types:
<sup>13</sup>C spectra, one <sup>15</sup>N, <sup>29</sup>Si spectra, one <sup>17</sup>O, and <sup>1</sup>H spectra. Unfortunately,
the compound also has chlorines, so it disqualifies as molecule for which NMR spectra are available for all its elements.
