---
layout: post
title:  "ChEMBL RDF #1:SPARQL end point"
date:   2010-02-09
blogger-link: https://chem-bla-ics.blogspot.com/2010/02/chembl-rdf-1sparql-end-point.html
doi: 10.59350/1g80w-92w22
tags: rdf chembl sparql
image: /blog/assets/images/chemblSnorQL.png
---

In a [series](http://chem-bla-ics.blogspot.com/2009/11/chempedia-rdf-1-sparql-end-point.html)
[of](http://chem-bla-ics.blogspot.com/2009/11/open-notebook-science-solubility-sparql.html)
[SPARQL end points](http://chem-bla-ics.blogspot.com/2009/09/nmrshiftdb-enters-rdfopenmoleculesnet-2.html),
I am happy to present a new [Virtuoso 6.1](http://virtuoso.openlinksw.com/dataspace/dav/wiki/Main/VOSNews#Announcing%20Virtuoso%20Open-Source%20Edition%20v6.1.0)-hosted
SPARQL end point for the [ChEMBL database](http://www.ebi.ac.uk/chembl/) ([CC-BY-SA](http://creativecommons.org/licenses/by-sa/3.0/)),
at our groups new [rdf.farmbio.uu.se](http://rdf.farmbio.uu.se/) server. The server is hosting
[23.8M triples](http://rdf.farmbio.uu.se/chembl/snorql/?query=SELECT+DISTINCT+count(*)+WHERE+{+%3Fs+%3Fp+%3Fo+}),
with the data based on [ChEMBL 02](ftp://ftp.ebi.ac.uk/pub/databases/chembl/releases/chembl_02/).
There is a [SPARQL end point](http://rdf.farmbio.uu.se/chembl/sparql/), as well as a
[SNORQL interface](http://rdf.farmbio.uu.se/chembl/snorql/):

![](/blog/assets/images/chemblSnorQL.png)

There are 2.4M [activities](http://rdf.farmbio.uu.se/chembl/snorql/?query=SELECT+DISTINCT+%3Finstance%0D%0AWHERE+{+%3Finstance+a+%3Chttp://rdf.farmbio.uu.se/chembl/onto/%23Activity%3E+}%0D%0AORDER+BY+%3Finstance+LIMIT+25),
34k [papers](http://rdf.farmbio.uu.se/chembl/snorql/?query=SELECT+DISTINCT+%3Finstance%0D%0AWHERE+{+%3Finstance+a+%3Chttp://purl.org/ontology/bibo/Article%3E+}%0D%0AORDER+BY+%3Finstance+LIMIT+25),
517k [compounds](http://rdf.farmbio.uu.se/chembl/snorql/?query=SELECT+DISTINCT+%3Finstance%0D%0AWHERE+{+%3Finstance+a+%3Chttp://rdf.farmbio.uu.se/chembl/onto/%23Compound%3E+}%0D%0AORDER+BY+%3Finstance+LIMIT+25),
416k [assays](http://rdf.farmbio.uu.se/chembl/snorql/?query=SELECT+DISTINCT+%3Finstance%0D%0AWHERE+{+%3Finstance+a+%3Chttp://rdf.farmbio.uu.se/chembl/onto/%23Assay%3E+}%0D%0AORDER+BY+%3Finstance+LIMIT+25),
associated with 7k [targets](http://rdf.farmbio.uu.se/chembl/snorql/?query=SELECT+DISTINCT+%3Finstance%0D%0AWHERE+{+%3Finstance+a+%3Chttp://rdf.farmbio.uu.se/chembl/onto/%23Target%3E+}%0D%0AORDER+BY+%3Finstance+LIMIT+25)
(proteins etc):

![](/blog/assets/images/chemblSnorQL1.png)

I will not discuss any cool mashups with the rich data set and [Bioclipse](http://www.bioclipse.net/),
as that is the main topic my student [Annzi's Masters project](http://annziproject.blogspot.com/).
