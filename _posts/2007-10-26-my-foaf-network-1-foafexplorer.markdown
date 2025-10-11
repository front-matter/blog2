---
layout: post
title:  "My FOAF network #1: the FOAFExplorer"
date:   2007-10-26
blogger-link: https://chem-bla-ics.blogspot.com/2007/10/my-foaf-network-1-foafexplorer.html
doi: 10.59350/djg2t-d2x55
tags: semweb foaf
image: /assets/images/foaf_egonw.png
---

In this series I will introduce the technologies behind my FOAF network. [FOAF](http://www.foaf-project.org/)
means Friend-of-a-Friend and

> [t]he Friend of a Friend (FOAF) project is creating a Web of machine-readable pages describing people,
> the links between them and the things they create and do.

[My FOAF file](http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf) (draft) will give you details on
who I am, who I collaborate with (and other types of friends), which conferences I am attending, what I
published etc. That is, I'll try to keep it updated. BTW, [FOAF is a RDF language](http://xmlns.com/foaf/spec/).

## FOAFExplorer

[Pierre](http://plindenbaum.blogspot.com/) has done some [excellent FOAF work](http://plindenbaum.blogspot.com/search?q=FOAF)
in the past, and [developed](http://plindenbaum.blogspot.com/2006/01/myfoafexplorer-browse-your-foaf.html) the
[MyFOAFExplorer](http://www.urbigene.com/foafexplorer/), and also developed
[a tool to create a FOAF network](http://plindenbaum.blogspot.com/2006/01/scifoaf-cited-at-pacific-symposium-on.html)
based on the [PubMed database](http://www.ncbi.nlm.nih.gov/sites/entrez), called
[SciFOAF](http://www.urbigene.com/foaf/). The latter is neat, but does not allow putting
all this personal details in the FOAF files. However, the output could be a starting
point.

Back to FOAFExplorer, this is [what the FOAFExplorer shows for my network](http://blueobelisk.sourceforge.net/people/egonw/):

![](/assets/images/foaf_egonw.png)


I'm a bit lonely, even though I have linked to two friends in my FOAF file, of which one has a FOAF
file too ([Henry](http://www.ch.ic.ac.uk/rzepa/rzepa.xrdf)):

```xml
<foaf:knows>
  <foaf:Person rdf:ID="HenryRzepa">
    <foaf:name>Henry Rzepa</foaf:name>
    <rdfs:seeAlso rdf:resource="http://www.ch.ic.ac.uk/rzepa/rzepa.xrdf"/>
  </foaf:Person>
</foaf:knows>
<foaf:knows>
  <foaf:Person rdf:ID="PeterMurrayRust">
    <foaf:name>Peter Murray-Rust
    <foaf:mbox_sha1sum>926d6f8ed367bdded26353a05e80b4f0ce18230d...
  </foaf:Person>
</foaf:knows>
```
I guess the FOAFExplorer does not browse into my network. More on that in later items in this series.


