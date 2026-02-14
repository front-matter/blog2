---
layout: post
title:  "Searching PubChem from within Bioclipse"
date:   2009-08-07
blogger-link: https://chem-bla-ics.blogspot.com/2009/08/searching-pubchem-from-within-bioclipse.html
doi: 10.59350/wcms5-hqy57
tags: bioclipse pubchem inchikey:VNWKTOKETHGBQD-UHFFFAOYSA-N
image: /blog/assets/images/pubchemSearchResults.png
---

For the application note which we are about to submit, I was working on improving the [PubChem](http://pubchem.ncbi.nlm.nih.gov/)
[Bioclipse](http://www.bioclipse.net/) API a bit, resulting in new `download` methods:

<script src="https://gist.github.com/163281.js"></script>

The search allows using [PubChem Filters](http://pubchem.ncbi.nlm.nih.gov/help.html#PubChem_index) which provides
many simple means to restrict the search results. For example, we can search molecules and restrict on the molecular
weight:

```javascript
lists = pubchem.download(pubchem.search("malaria 300:500[MW]"))
```

Other filters you can use in pubchem.search (provided by PubChem itself), includes (with examples):

* **[el]**: `pubchem.search("Au[el]")`
* **[inchi]**: `pubchem.search("\"InChI=1S/CH4/h1H4\"[inchi]")`
* **[inchikey]**: `pubchem.search("VNWKTOKETHGBQD-UHFFFAOYSA-N[inchikey]")`
* **[mimass]**: `pubchem.search("375.9785:375.9786[mimass]")`

And many, many more... see the linked Filters page.

Now, you surely want to look at the hits, for which we use the molecular table editor:

```javascript
list = pubchem.download(pubchem.search("375.9785:375.9786[mimass]"))
cdk.saveSDFile("/Virtual/hits.sdf", list)
ui.open("/Virtual/hits.sdf")
```

Resulting in:

![](/blog/assets/images/pubchemSearchResults.png)
