---
layout: post
title:  "SPARQL end points, Jena and bif:contains"
date:   2009-10-15
blogger-link: https://chem-bla-ics.blogspot.com/2009/10/sparql-end-points-jena-and-bifcontains.html
doi: 10.59350/g7yhg-frs33
tags: sparql rdf bioclipse bio2rdf
---

I have been having fun with SPARQL in [Bioclipse](http://www.bioclipse.net/) for a while now, and blogged at several occasions:

* [NMRShiftDB enters rdf.openmolecules.net #2: SPARQL end point with Virtuoso]()
* [Bioclipse and SPARQL end points #2: MyExperiment](http://chem-bla-ics.blogspot.com/2009/08/bioclipse-and-sparql-end-points-2.html)
* [Bioclipse and SPARQL end points](http://chem-bla-ics.blogspot.com/2009/08/bioclipse-and-sparql-end-points.html)

One thing I had not been able to work out, is that [Virtuoso](http://virtuoso.openlinksw.com/dataspace/dav/wiki/Main/) uses a
(rather nice) *bif:contains* extension that support indexing. However, [Jena](http://jena.sourceforge.net/) would complain with:

```
com.hp.hpl.jena.query.QueryParseException: Line 1, column 31: Unresolved
prefixed name: bif:contains
```

Defining the prefix did not solve the problem either, but [Ivan Mikhailov](http://www.linkedin.com/in/ivanmikhailov) just
replied to my post to the [virtuoso-user](https://sourceforge.net/mailarchive/forum.php?forum_name=virtuoso-users) mailing
list providing the solution.

The solution is in the fact that `bif:` is in its own namespace, which makes it possible to replace `bif:contains` by its
full reference `<bif:contains>`. I directly gave that a try in Bioclipse, and just succesfull ran this Bioclipse
script snippet:

```javascript
rdf.sparqlRemote(
  "http://bio2rdf.org/sparql",
  "SELECT * WHERE {?s ?p ?o . ?o <bif:contains> \"aspirin\" .};"
);
```

Thanx, Ivan!
