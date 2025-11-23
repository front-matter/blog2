---
layout: post
title:  "NMRShiftDB enters rdf.openmolecules.net"
date:   2009-03-18
blogger-link: https://chem-bla-ics.blogspot.com/2009/03/nmrshiftdb-enters-rdfopenmoleculesnet.html
doi: 10.59350/yk97t-8s820
tags: nmrshiftdb rdf opendata
image: /blog/assets/images/nmrRDF.png
---

This morning I finished setting up a [RDF](http://en.wikipedia.org/wiki/RDF) interface to the [NMRShiftDB](http://www.nmrshiftdb.org/) data
(see [nmr:234](http://pele.farmbio.uu.se/nmrshiftdb/?moleculeId=234)):

![](/blog/assets/images/nmrRDF.png)

And made links between the new frontend and [rdf.openmolecules.net](http://rdf.openmolecules.net/), make the
*Linked Open Chemistry Data* (LOCD) network grow (naming following [Linked Open Drug Data](http://esw.w3.org/topic/HCLSIG/LODD)).
In comparison with the previous depiction, I added arrows to indicate the direction of the linking. Green nodes still indicate
sources with an RDF interface; therefore, the LOCD network consists really only of those green nodes:

![](/blog/assets/images/ons2.png)

The link with DBPedia is discussed in [DBPedia enters rdf.openmolecules.net](http://chem-bla-ics.blogspot.com/2009/02/dbpedia-enters-rdfopenmoleculesnet.html).
The [source code for the NMRShiftDB-RDF frontend](http://github.com/egonw/nmrshiftdb-rdf/tree/master) can be found at
[GitHub](http://www.github.com/).
