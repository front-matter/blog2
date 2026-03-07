---
layout: post
title:  "ChemPedia RDF #1: the SPARQL end point"
date:   2009-11-19
modified_date: 2026-03-07
doi: 10.59350/qfhff-gen31
blogger-link: https://chem-bla-ics.blogspot.com/2009/11/chempedia-rdf-1-sparql-end-point.html
tags: rdf sparql chempedia justdoi:10.59350/kprj3-gyg97 nmrshiftdb
---

Well, you might spot a pattern here; yes, another chemical [SPARQL end point](http://pele.farmbio.uu.se/cc0/sparql)
(actually, it shares the end point with the [Solubility data](http://chem-bla-ics.blogspot.com/2009/11/open-notebook-science-solubility-sparql.html)).
This time around [Rich](http://depth-first.com/)'s [ChemPedia](http://chempedia.com/substances). Taking advantage of the
[CC0-licensed downloads <i class="fa-solid fa-recycle fa-xs"></i>](https://doi.org/10.59350/kprj3-gyg97),
I have created a small [Groovy](http://groovy.codehaus.org/) script (using this [JSON library](http://json-lib.sourceforge.net/))
to convert the ChemPedia [JSON](http://en.wikipedia.org/wiki/Json) into
[Notation3](http://en.wikipedia.org/wiki/Notation3):

```groovy
import net.sf.json.groovy.JsonSlurper;

input = new File("substances.json")
json = new JsonSlurper().parse(input);

println "@prefix dc: <http://purl.org/dc/elements/1.1/>";
println "@prefix cp: <http://rdf.openmolecules.net/chempedia/onto#>";
json.each { it ->
  println "<" + it.uri + "> dc:identifier \"" + it.gsid + "\";";
  println " <http://www.w3.org/2002/07/owl#sameAs> <http://rdf.openmolecules.net/?" + it.inchi + ">;";
  println "  <http://www.iupac.org/inchi> \"" + it.inchi + "\".";
  if (it.namings.size() > 0) {
    for (int i = 0; i<it.namings.size(); i++) {
      naming = it.namings.get(i);
      namingURI = it.uri + "/naming" + i;
      println "<" + it.uri + "> cp:hasNaming " +
        "<" + namingURI + ">.";
      println "<" + namingURI + "> a cp:Naming;";
      println "  cp:hasName \"" + naming.name + "\";";
      println "  cp:hasStatus \"" + naming.status + "\";";
      println "  cp:hasScore \"" + naming.score + "\".";
    }
  }
}
```

After uploading it into [Virtuoso](http://virtuoso.openlinksw.com/dataspace/dav/wiki/Main/VOSIndex) (now using `DB.DBA.TTLP` instead of
[DB.DBA.RDF_LOAD_RDFXML_MT <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/09/04/nmrshiftdb-enters-rdfopenmoleculesnet-2.html)), we can now have our
regular SPARQL fun with the data from ChemPedia. For example, list the 10 names with the most votes:

```sparql
prefix dc: <http://purl.org/dc/elements/1.1/>
prefix cp: <http://rdf.openmolecules.net/chempedia/onto#>

select distinct ?name ?score where {
  ?s a cp:Naming ;
     cp:hasName ?name ;
     cp:hasScore ?score .
} ORDER BY DESC(?score) LIMIT 10
```
