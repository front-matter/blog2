---
layout: post
title:  "Solubility Data in Bioclipse #3: Finding ChEBI IDs"
date:   2009-02-27
blogger-link: https://chem-bla-ics.blogspot.com/2009/02/solubility-data-in-bioclipse-3-finding.html
doi: 10.59350/gh3np-xbm68
tags: gist sparql rdf chebi
---

With the RDF functionality set up in [Bioclipse](http://www.bioclipse.net/) (see
[Solubility Data in Bioclipse #2: handling RDF](http://chem-bla-ics.blogspot.com/2009/02/solubility-data-in-bioclipse-2-handling.html)),
we can start mining the Chemical RDF space. Check out this mashup:

<script src="https://gist.github.com/egonw/71677.js"></script>

What happens in this script is the following:

1. Load the ONS Solubility data (line 4-5)
2. ask for all owl:sameAs relations to navigate (line 8-14)
3. load the RDF for the [rdf.openmolecule.net](http://chem-bla-ics.blogspot.com/2009/02/dbpedia-enters-rdfopenmoleculesnet.html) resources (line 16-26)
4. query for all solvents which have an [ChEBI](http://www.ebi.ac.uk/chebi/) identifier (line 28-38)

The output will look like the following (in the future this will be opened as spreadsheet in Bioclipse):

```
[[ethanol 40C, CHEBI:16236],
[acetonitrile, CHEBI:38472],
[chloroform, CHEBI:35255],
[methanol 30C, CHEBI:17790],
[THF, CHEBI:26911],
[ethanol, CHEBI:16236],
[ethanol 30C, CHEBI:16236],
[methanol 40C, CHEBI:17790],
[methanol, CHEBI:17790]]
```

Now, this example shows a simple yet powerful feature of how RDF is used nowadays: the ChEBI identifier was not part of the original
[Solubility spreadsheet at Google Docs](https://spreadsheets.google.com/ccc?key=plwwufp30hfq0udnEmRD1aQ&hl=en). But, taking advantage
of the unique and *resolvable* URIs for molecules, when can simply look them up.

Nice, isn't it?
