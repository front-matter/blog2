---
layout: post
title:  "Open NMR data: raw curves and annotated peak lists"
date:   2009-03-04
blogger-link: https://chem-bla-ics.blogspot.com/2009/03/open-nmr-data-raw-curves-and-annotated.html
doi: 10.59350/cxds4-qnq95
tags: opendata chemspider nmr
---

Games are known to trigger technical innovation. But recently it also triggered innovation on open chemical databases. Jean-Claude
[reported](http://usefulchem.blogspot.com/2009/03/spectral-game-update.html):

> We are very excited by what we have put together so far. There are currently 457 H NMR, 389 C NMR, 11 IR and 29 NIR spectra. This
> is only possible because of people who submitted their spectra to ChemSpider as Open Data - please keep uploading!

Now, the [NMRShiftDB](http://nmrshiftdb.org/) also hosts quite a number of NMR spectra, and I have a hobby to submit spectra,
particularly for rare nuclei. In particular, I think it is fun to to have as many as possible structures which have spectra for
all the nuclei in that structure. [Benzene](http://en.wikipedia.org/wiki/Benzene) is a simple example for which NMR spectra are
available for all nuclei (see [this entry](http://nmrshiftdb.chemie.uni-mainz.de/portal/js_pane/P-Results/nmrshiftdbaction/showDetailsFromHome/molNumber/7901)).

Now, the main difference between the NMRShiftDB and [ChemSpider](http://www.chemspider.com/) spectral data is the the first are annotated
peak lists (each shift is assigned to an atom), and the latter are full, but unannotated, spectral curves. So, there are quite a few
things you could do here. For example, see which structures which NMR curves are not yet annotated in NMRShiftDB.
[Antony](http://www.chemspider.com/blog/) pointed me to [this page](http://www.chemspider.com/spectra.aspx) which is an overview
of all spectral data in ChemSpider, but that page is difficult to machine process. Partly, because it is a mix of Open and
Proprietary data, and partly because it uses JavaScript to navigate the table. (BTW, RDF interfaces to both resources would
be much more helpful, and simply allow me to query all molecules which have a spectrum which is Open, and which is not found
in the NMRShiftDB. I am working on a RDF interface to NMRShiftDB.)

Antony also [asked](http://usefulchem.blogspot.com/2009/03/spectral-game-update.html#c6864087472599346745) me to advertise the
option to upload Open spectral curves to ChemSpider. So, hereby. However, I really do hope ChemSpider will make it easier for
others to reuse all the Open Data, as having to machine browsing the linked HTML interface is a waste of ChemSpider computing
resources.

**Update**: the game is now available from [spectralgame.com](http://spectralgame.com/).
