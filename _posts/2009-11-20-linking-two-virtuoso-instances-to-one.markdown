---
layout: post
title:  "Linking two Virtuoso instances to one Apache server"
date:   2009-11-20
modified_date: 2026-05-05
blogger-link: https://chem-bla-ics.blogspot.com/2009/11/linking-two-virtuoso-instances-to-one.html
doi: 10.59350/zgafr-mre81
tags: virtuoso apache
---

[Virtuoso](http://virtuoso.openlinksw.com/dataspace/dav/wiki/Main/) comes with its own web front end, but I did not want to make that public.
Additionally, I actually have two instances running, one for the [GNU FDL](http://www.gnu.org/copyleft/fdl.html)
licensed [NMRShiftDB <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/09/04/nmrshiftdb-enters-rdfopenmoleculesnet-2.html)
data, and one for the CC0 [ChemPedia <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/11/19/chempedia-rdf-1-sparql-end-point.html) and
[Solubility <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/11/19/open-notebook-science-solubility-sparql.html) data sets.

So, I used [Apache's proxy module](http://httpd.apache.org/docs/2.0/mod/mod_proxy.html) linking to two Virtuoso instances.
These two are set up by just duplicating a data based folder and to have it use two *virtuoso.ini* config files. Modify one
of two config files to have them run on a different port in the Parameters section, for example 1198 and 1199:

```
[Parameters]
ServerPort                      = 1199
```

And assign a different server ports in the HTTPServer section, such as 2290 and 2291:

```
[HTTPServer]
ServerPort                      = 2291
```

Then modify the */etc/apache2/mods-enabled/proxy.conf* (or whatever equivalent on your system) to have two sections creating two URL rewrites proxying the request to the virtuoso server:

```
<Proxy /nmrshiftdb/sparql>
  RewriteEngine On
  Allow from all
  ProxyPass        http://localhost:2290/sparql
  ProxyPassReverse http://localhost:2290/sparql
</Proxy>

<Proxy /cc0/sparql>
  RewriteEngine On
  Allow from all
  ProxyPass        http://localhost:2291/sparql
  ProxyPassReverse http://localhost:2291/sparql
</Proxy>
```
