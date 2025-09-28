---
layout: post
title:  "Solubility Data in Bioclipse #1"
date:   2008-11-18
blogger-link: https://chem-bla-ics.blogspot.com/2008/11/solubility-data-in-bioclipse-1.html
doi: 10.59350/ydgw3-52978
tags: bioclipse rdf
image: /blog/assets/images/bioclipseRDF.png
---

I am working on converting [Jean-Claude](http://usefulchem.blogspot.com/)'s [Solubility](https://spreadsheets.google.com/ccc?key=plwwufp30hfq0udnEmRD1aQ&hl=en)
data to [RDF](http://www.w3.org/RDF/) (after [Pierre](http://plindenbaum.blogspot.com/)'s model, see [here](http://usefulchem.blogspot.com/2008/10/rdf-triples-for-open-notebook-science.html),
[here](http://usefulchem.blogspot.com/2008/11/ons-solubility-web-query.html), and [here](http://anybody.cephb.fr/perso/lindenb/tmp/jcbradley.rdf),
[here](http://rguha.wordpress.com/2008/11/06/solubility-queries-and-the-google-visualization-api/) for first data exploration), so that I can integrate it with data from
[DBPedia](http://dbpedia.org/About), [Freebase](http://www.freebase.com/), [rdf.openmolecules.net](http://rdf.openmolecules.net/), etc.
[Bioclipse](http://www.bioclipse.net/) will be the workbench in which this will be visualized, and just got graph depiction online using
[Zest](http://www.eclipse.org/gef/zest/). The screenshot does not show the RDF yet, but that will follow soon:

![](/blog/assets/images/bioclipseRDF.png)

Next stops:

* create a Eclipse package for Jena
* read the Solubility data (does anyone know a Java library to read from Google Docs?)
* create a virtual database of Solubility compounds (possibly StructureDB-based)
* Use the CDK to autoextract chemical triples
