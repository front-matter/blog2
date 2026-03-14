---
layout: post
title:  "NMRShiftDB RDF #3: Bio2RDF"
date:   2009-10-09
blogger-link: https://chem-bla-ics.blogspot.com/2009/10/nmrshiftdb-rdf-3-bio2rdf.html
doi: 10.59350/rnjv0-tj350
tags: nmrshiftdb rdf bio2rdf
image: /blog/assets/images/nmrRDF1.png
---

My might have seen my efforts to convert the [NMRShiftDB](http://www.nmrshiftdb.org/) data into RDF:

* [NMRShiftDB RDF #2: Some statistics](http://chem-bla-ics.blogspot.com/2009/09/nmrshiftdb-rdf-2-some-statistics.html)
* [NMRShiftDB RDF #1: Spectra by InChI ](http://chem-bla-ics.blogspot.com/2009/09/nmrshiftdb-rdf-1-spectra-by-inchi.html)
* [NMRShiftDB enters rdf.openmolecules.net #2: SPARQL end point with Virtuoso](http://chem-bla-ics.blogspot.com/2009/09/nmrshiftdb-enters-rdfopenmoleculesnet-2.html)

[Peter Ansell](http://bio2rdf.blogspot.com/) has shortly after that copied the data into [Bio2RDF](http://bio2rdf.org/),
but I had not blogged about that yet. So, here goes. If you have not looked at Bio2RDF yet, this is a good time to do that.
The structure of the exposed triples is not perfect, and I just realized I made a beginners mistake, to use a domain name
in a namespace I have not control over (bad me). The Virtuoso6 faceted browser allows you to navigate the data in Bio2RDF
by molecule (e.g. [molecule 234](http://cu.bio2rdf.org/page/nmrshiftdb_molecule:234)):

![](/blog/assets/images/nmrRDF1.png)

And by spectrum too (e.g. [spectrum 4735](http://cu.bio2rdf.org/page/nmrshiftdb_spectrum:4735)):

![](/blog/assets/images/nmrRDF2.png)
