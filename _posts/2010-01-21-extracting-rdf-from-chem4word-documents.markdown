---
layout: post
title:  "Extracting RDF from Chem4Word documents"
date:   2010-01-21
blogger-link: https://chem-bla-ics.blogspot.com/2010/01/extracting-rdf-from-chem4word-documents.html
doi: 10.59350/jc9ak-pdr79
tags: cml java rdf chem4word strigi
---

[Joe](http://jat45.wordpress.com/) has released the first [Chem4Word](http://research.microsoft.com/en-us/projects/chem4word/)
[demo file](http://jat45.files.wordpress.com/2010/01/example.docx), and has written about how to
[extract the CML with Java](http://jat45.wordpress.com/2010/01/20/extracting-cml-from-a-chem4word-authored-document-java/)
and [with C#](http://jat45.wordpress.com/2010/01/21/extracting-cml-from-a-chem4word-authored-document-c/).

I haven't actually gotten around to fiddling with Java, but ran [Strigi](http://strigi.sf.net/) against it to extract RDF,
while having the [Strigi-Chemistry](http://neksa.blogspot.com/2007/05/introduction.html) plugins installed. This is part of the
[RDF](http://en.wikipedia.org/wiki/Resource_Description_Framework) that came out:

```turtle
<example-doc.docx>
  <http://freedesktop.org/standards/xesam/1.0/core#title>
    "acetic acid",
    "(8R,9S,10R,13S,14S,17S)- 17-hydroxy-10,13-dimethyl- 1,2,6,7,8,9,11,12,14,15,16,17-dodecahydrocyclopenta[a] phenanthren-3-one",
    "testosterone";
  <http://freedesktop.org/standards/xesam/1.0/core#version>
    "2",
    "2";
  <http://rdf.openmolecules.net/0.9#atomCount>
    "8",
    "49";
  <http://rdf.openmolecules.net/0.9#bondCount>
    "7",
    "52";
  <http://rdf.openmolecules.net/0.9#molecularFormula>
    "C2H4O2",
    "C19H28O2";
```

I believe there is quite some room for improvement, but it's a start :) Thanx to Joe for posting the public domain test file, so
that other projects can start play with the exiting new technology. I should note, however, that I am not running a Microsoft OS
nor MS-Word, and the saved documents source are the only way I have access to the
[CML](http://en.wikipedia.org/wiki/Chemical_Markup_Language) right now.
