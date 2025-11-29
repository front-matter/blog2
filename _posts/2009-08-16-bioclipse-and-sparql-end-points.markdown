---
layout: post
title:  "Bioclipse and SPARQL end points"
date:   2009-08-16
blogger-link: https://chem-bla-ics.blogspot.com/2009/08/bioclipse-and-sparql-end-points.html
doi: 10.59350/qtb5r-fxm04
tags: bioclipse sparql rdf dbpedia
modified_date: 2025-11-29
---

Last week, there was a very interesting thread on the [DBPedia](http://dbpedia.org/) mailing list, on using Java for doing remote
[SPARQL](http://en.wikipedia.org/wiki/SPARQL) queries. This was one of the features still missing in [bioclipse.rdf](http://github.com/egonw/bioclipse.rdf/tree/master).
[Richard Cyganiak](http://dowhatimean.net/) replied pointing the code in Jena which conveniently does this and which bioclipse.rdf is already using anyway. Next,
[Fred Durao](http://iwis.cs.aau.dk/blog/4) even gave a full code example relieving me from any further research, resulting in
`sparqlRemote()` now implemented in the `rdf` manager:

```
> rdf.sparqlRemote(
  "http://dbpedia.org/sparql",
  "select distinct ?Concept where{[] a ?Concept } LIMIT 10"
);
[[http://dbpedia.org/ontology/Place], [http://dbpedia.org/ontology/Area],
[http://dbpedia.org/ontology/City], [http://dbpedia.org/ontology/River],
[http://dbpedia.org/ontology/Road], [http://dbpedia.org/ontology/Lake],
[http://dbpedia.org/ontology/LunarCrater],
[http://dbpedia.org/ontology/ShoppingMall], [http://dbpedia.org/ontology/Park],
[http://dbpedia.org/ontology/SiteOfSpecialScientificInterest]]
```

I reported earlier [two example SPARQL queries for chemistry <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/02/dbpedia-lookup-and-autocomplete-of.html),
which can now be rewritten as Bioclipse scripts:

<script src="https://gist.github.com/168582.js"></script>

and

<script src="https://gist.github.com/168583.js"></script>
