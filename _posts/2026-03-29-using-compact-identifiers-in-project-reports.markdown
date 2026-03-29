---
layout: post
title:  "Using compact identifiers in project reports"
date:   2026-03-29
doi: 10.59350/re9j2-hk972
tags: identifier semweb cito cito:usesMethodIn,includesQuotationFrom:10.1038/sdata.2018.29
  cito:obtainsBackgroundFrom:10.1007/s12021-015-9284-3 cito:usesMethodIn:10.1093/bioinformatics/btaa864
  cito:usesMethodIn:10.1038/s41597-022-01807-3 cito:obtainsBackgroundFrom:10.1038/sdata.2016.18
  cito:includesQuotationFrom:10.1186/s13321-022-00614-7 cito:includesQuotationFrom:10.1186/s13321-020-00448-1
grants:
  - grant:
    title: "FAIR4ChemNL: Accelerating the adoption of universal data standards in chemistry"
    acronym: "FAIR4ChemNL"
    id: doi:10.61686/XVYQV45374
    funder:
      name: "Dutch Research Council"
      ror: 04jsz6e67
#comments:
#  host: social.edu.nl
#  username: egonw
#  id: ...
---

This document describes how you can improve the FAIR-ness of your project report by using
compact identifiers. Of course, it can be applied to any other document too, and has been used
in, for example, journal articles and online documentation already.

Compact identifiers find a balance between compactness in writing and being a persistent, unique,
and global identifier. It "is a string constructed by concatenating a namespace prefix, a separating colon,
and a locally unique identifier (LUI)" (doi:[10.1038/sdata.2018.29](https://doi.org/10.1038/sdata.2018.29)).
For example, for proteins it can represent the PDB structure [2gc4](https://bioregistry.io/pdb:2gc4) as
*pdb:2gc4*. There is a clear similarity with the SciCrunch [Research Resource Identifiers](https://rrid.site/)
(RRIDs) as used by several journals, like
[eLife](https://elifesciences.org/inside-elife/ff683ecc/rrids-how-did-we-get-here-and-where-are-we-going)
(doi:[10.1007/s12021-015-9284-3](https://doi.org/10.1007/s12021-015-9284-3)).

When the prefixes are defined by community standards, then a compact identifier can be resolved.
There currently are multiple providers of prefix files (doi:[10.1038/sdata.2018.29](https://doi.org/10.1038/sdata.2018.29)),
including Identifiers.org (doi:[10.1093/bioinformatics/btaa864](https://doi.org/10.1093/bioinformatics/btaa864))
and Bioregistry (doi:[10.1038/s41597-022-01807-3](https://doi.org/10.1038/s41597-022-01807-3)).
The Bioregistry has an overview of more than twenty registries of prefixes and their metadata
(doi:[10.1038/s41597-022-01807-3](https://doi.org/10.1038/s41597-022-01807-3)). The metadata commonly
includes information on the URL pattern for each identifier. Often this is more than one pattern, as
there may more several databases with information for the same identifier.

It is the URL pattern in the database that allows services to *resolve* the compact identifier
into a link to a database. The above registries correspond to three existing *resolvers* that will take a compact
identifier as part of a resolver URL and redirect to the database with the record matching
that identifier:

* Name-to-Thing (N2T): [https://n2t.net/](https://n2t.net/)
* Identifiers.org: [https://identifiers.org/](https://identifiers.org/)
* The Bioregistry: [https://bioregistry.io/](https://bioregistry.io/)

Each of these URLs can be extended with a compact identifier. For example, a taxon record
from the NCBI databases or the PDB entry mentioned earlier:

* [https://bioregistry.io/pdb:2gc4](https://bioregistry.io/pdb:2gc4)
* [https://identifiers.org/col:6MB3T](https://identifiers.org/col:6MB3T) (`col` is the prefix for the Catalogue of Life)

## Why use in reports?

Using persistent identifiers is generally accepted as a good practice that benefits science
and has been part of the ideas of FAIR data (doi:[10.1038/sdata.2016.18](https://doi.org/10.1038/sdata.2016.18))
and of Open Science. Compact
identifiers make it easy to be precise in reports about what things the reports talk about: they
are relatively short but very precise at the same time. also, that has the benefit that they
are much easier to reuse than labels of things and concepts that intrinsically have a certain
level of uncertainty; a database entry has commonly a very specific meaning.

## Examples uses

The use of compact identifiers can be used in two ways. The simplest is to just put the
compact identifier as plain text in the document, possibly in parentheses
(with the compact identifier highlighted here in bold):

<ul>
  <i>This report is only about the experimental data of the human (<b>NCBITaxon:9606</b>) cell lines.</i>
</ul>

Or:

<ul>
  <i>We found that BRCA1 (<b>ensembl:ENSG00000012048</b>) played an important role.</i>
</ul>

Alternatively, you can add a hyperlink with one of the resolvers, for example, Identifiers.org:

<ul>
  <i>We found that BRCA1 (<b><a href="https://identifiers.org/ensembl:ENSG00000012048">ensembl:ENSG00000012048</a></b>) played an important role.</i>
</ul>

### Compact identifiers for material identifiers

The European Registry of Materials proposes to use the compact identifier for their
ERM identifiers (doi:[10.1186/s13321-022-00614-7](https://doi.org/10.1186/s13321-022-00614-7)):

<ul>
  <i>
    For example, the NanoSolveIT project registered a material with the ERM00000001 identifier.
    The full Uniform Resource Identifier (URI) for this compound is
    https://nanocommons.github.io/identifiers/registry#ERM00000001 which is too long to be used
    in documentation. The corresponding compact identifier <b>erm:ERM00000001</b> is easy to use in written
    material, analogous to the use of Protein Data Bank (PDB) identifiers for proteins in journals.
  </i>
</ul>

### Compact identifiers for citation intent annotations

The compact identifier has also been used as the method to include citation intentions in journal
articles (doi:[10.1186/s13321-020-00448-1](https://doi.org/10.1186/s13321-020-00448-1),
compact identifier here highlighted in bold):

<ul>
  <i>
    We take advantage here of the ability to add notes to full form [..] references in bibliographies.
    These are referred to as bibnotes. The content of the note will be strictly formatted: it will use
    the syntax [<b>cito:usesMethodIn</b>] and formatted in bold. That is, the bibnote starts with the
    [ character, followed by one of the CiTO types, and ends with the ] character. If you wish to
    provide more than one annotation, you can repeat this syntax, separated by one or more spaces,
    for example: [<b>cito:usesMethodIn</b>] [<b>cito:citeAsAuthority</b>].
  </i>
</ul>

Note that in this use, the square brackets and bold typeface are used to make them easier to
be recognized. Also, note that this document uses this approach to indicate the intention of
why the cited articles are cited.

## Conclusion

This document described what the compact identifier is, how it helps linking to online
databases, and how they can be used in written reports as plain text, optionally
hyperlinked with one of the compact identifier resolvers.

### Acknowledgments

I thank [github:tabbassidaloii](https://n2t.net/github:tabbassidaloii),
[github:cthoyt](https://n2t.net/github:cthoyt), and
[github:larsgw](https://n2t.net/github:larsgw) for their comment on
[this GitHub repo](https://github.com/egonw/compact-ids-in-reports).
