---
layout: post
title:  "NMRShiftDB RDF #1: Spectra by InChI"
date:   2009-09-05
blogger-link: https://chem-bla-ics.blogspot.com/2009/09/nmrshiftdb-rdf-1-spectra-by-inchi.html
doi: 10.59350/7k8wn-jee62
tags: nmrshiftdb sparql
modified_date: 2026-03-07
---

Originally, I wanted to include a SPARQL query in [my yesterdays blog <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/09/04/nmrshiftdb-enters-rdfopenmoleculesnet-2.html)
showing how to retrieve [NMRShiftDB](http://www.nmrshiftdb.org/) spectra based on an InChIKey, but it horribly failed. I have yet to discover why. This
morning I discovered that it is specific for that field, and that using the same thing with InChI is no problem:

<script src="https://gist.github.com/181307.js"></script>
