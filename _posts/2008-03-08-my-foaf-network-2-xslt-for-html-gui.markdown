---
layout: post
title:  "My FOAF network #2: XSLT for a HTML GUI"
date:   2008-03-08
modified_date: 2025-08-17
blogger-link: https://chem-bla-ics.blogspot.com/2008/03/my-foaf-network-2-xslt-for-html-gui.html
doi: 10.59350/p1n99-9sa03
tags: semweb blue-obelisk foaf
image: /assets/images/foafExplorer.png
---


Because the ACS meeting where [Henry](http://www.ch.ic.ac.uk/rzepa/) will present something about FOAF in chemistry,
is nearing very fast now (here's the [first blog it this series <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/10/26/my-foaf-network-1-foafexplorer.html)),
it becomes urgent to beef up the [Blue Obelisk](http://www.blueobelisk.org/) FOAF network, now consisting of
[7 members](http://blueobelisk.sourceforge.net/wiki/Members). All do now show up in
[the FOAFExplorer](http://blueobelisk.sourceforge.net/people/egonw/):

![](/assets/images/foafExplorer.png)

Now, to make sure that my FOAF is in order, I set up the regular XML/RDF toolchain, using *xmllint* to validate the XML and
RDF syntax, and [XSLT](http://blueobelisk.sourceforge.net/people/egonw/foaf2xhtml.xsl) to convert the FOAF to human readable HTML.
Using the `?xml-stylesheet?` syntax this also provide the basic HTML GUI when accessing
[the FOAF file](http://blueobelisk.sourceforge.net/people/egonw/foaf.xml) using Firefox. BTW, I had to rename the file to
make the SourceForge web server aware that the file is an XML file, so that it nicely sets the MIME type.

BTW, I suggest all to validate your FOAF with [this RDF validator](http://www.w3.org/RDF/Validator/), because some of
us got some work to do to make them valid:

* Mine is having some encoding issue
* Henry's has some 8 errors

The others are actually fine.

While the XSLT is getting along quite nicely, I got serious other work to do. The [Strigi](http://strigi.sf.net/)-based
FOAF indexer is sort of working, gets FOAF documents recursively, but I want it to index our publications and presentation
slides too. Now, FOAF has a *foaf:publications* tag, which I thought might be suited. But after chatting with (new)
friends on the #foaf IRC channel ([the log](http://chatlogs.planetrdf.com/foaf/2008-03-08)), it became clear that the
scope of that element is to point to some other file (*foaf:Document*) which lists the publications, such a HTML output
created from BibTeX.

That is, the following syntax is not quite what appears to be intended:

```xml
<foaf:publications>
  <foaf:Document rdf:about="http://dx.doi.org/10.1186/1471-2105-8-59">
    <dc:title>Bioclipse: an open source workbench for chemo-
      and bioinformatics</dc:title>
    <dc:author rdf:resource="#me"/>
  </foaf:Document>
```

The [Bibliontology](http://bibliontology.com/) was suggested and seem a rather good candidate to draft a separate
but RDF/OWL-based publication list. The server was down at the time of writing, but the Google cache showed the
scope nicely. The [Google group is active](http://groups.google.com/group/bibliographic-ontology-specification-group)
and the server should [go back online shortly](http://chatlogs.planetrdf.com/foaf/2008-03-08#T23-05-19).

OK, enough for now. More will follow in this series shortly. Such as a HTML GUI for
[my publication list in Bibliontology format](http://blueobelisk.sourceforge.net/people/egonw/biblio.xml).
