---
layout: post
title:  "Bioclipse Manager for MyExperiment.org"
date:   2009-11-04
blogger-link: https://chem-bla-ics.blogspot.com/2009/11/bioclipse-manager-for-myexperimentorg.html
doi: 10.59350/c7qy9-qdj95
tags: bioclipse rdf sparql myexperiment
modified_date: 2026-03-19
---

Some time ago I wrote about using [Bioclipse to query to MyExperiment.org SPARQL end point <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/08/21/bioclipse-and-sparql-end-points-2.html).
I think I had not mentioned that I have also written a manager to download [MyExperiment](http://www.myexperiment.org/)
[Bioclipse Scripting Language](http://wiki.bioclipse.net/index.php?title=A_Meta_Language_for_Bioclipse (BSL)) scripts (though
there are no GUI elements yet):

```javascript
> myexperiment.search("RDF")
[921, 928, 889]

> myexperiment.search("Kabsch")
[937]
```

The returned lists give the workflow numbers for matching BSL scripts, which you can then simply download with:

```javascript
> var file = myexperiment.downloadWorkflow(937)
ui.open(file)
```
