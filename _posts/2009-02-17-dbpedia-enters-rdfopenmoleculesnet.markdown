---
layout: post
title:  "DBPedia enters rdf.openmolecules.net"
date:   2009-02-17
blogger-link: https://chem-bla-ics.blogspot.com/2009/02/dbpedia-enters-rdfopenmoleculesnet.html
doi: 10.59350/tt4n7-sqs27
tags: rdf dbpedia sparql inchi smiles chebi cb
image: /blog/assets/images/ons.png
---

As of tonight, [rdf.openmolecules.net](http://rdf.openmolecules.net/) links to the chemistry [DBPedia](http://www.dbpedia.org/) (1816 chemical compounds),
for which I used the SPARQL given in [DBPedia: lookup and autocomplete of chemistry](http://chem-bla-ics.blogspot.com/2009/02/dbpedia-lookup-and-autocomplete-of.html).
It's first of several steps to extend rdf.openmolecules.net to link up various chemistry database. The below figure shows the current state, where the green nodes are fully RDF-ied:

![](/blog/assets/images/ons.png)

Drugs are still missing, but will add those too, and since not all entries had InChIs, SMILES were converted using
[CDK 1.1.5](http://chem-bla-ics.blogspot.com/2009/02/cdk-12-release-candidate.html).
