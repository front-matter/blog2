---
layout: post
title:  "New paper: pyBiodatafuse: Extending interoperability of data using modular queries across biomedical resources"
date:   2026-05-30
doi: 10.59350/7n2bs-zsm80
tags: python database doi:10.1093/BIOINFORMATICS/BTAG064 doi:10.37044/OSF.IO/MHSQP
  justdoi:10.37044/OSF.IO/PTMG5_V1
image: /assets/images/pyBiodatafuseGraph.png
#comments:
#  host: social.edu.nl
#  username: egonw
#  id: ...
---

The number of data and knowledge source relevant to your biological or chemical question
increases every year. They all come with different API and different data models. These
need to be documented and mapped. What better way to do that than actually do that and
then use that. I never asked, but I can imagine that was the original idea of Tooba
and Yojana. At the very least, it demonstrates the level of interoperability we need
in the life sciences.

In a recent paper, [Yojana Gadiya](https://orcid.org/0000-0002-7683-0452),
[Javier Millán Acosta](https://orcid.org/0000-0002-4166-7093), and
[Tooba Abbassi-Daloii](https://orcid.org/0000-0002-4904-3269) led a project called
BioDataFuse (worked on at the biohackathons of ELIXIR in [2023](https://doi.org/10.37044/osf.io/mhsqp)
and [2024](https://doi.org/10.37044/osf.io/ptmg5_v1)
and of SWAT4HCLS in [2024](https://ceur-ws.org/Vol-3890/paper-23.pdf)
and [2025](https://ceur-ws.org/Vol-4196/paper_71.pdf)) and the matching Python package,
[pyBiodatafuse](https://github.com/BioDataFuse/pyBiodatafuse)
(doi:[10.1093/bioinformatics/btag064](https://doi.org/10.1093/bioinformatics/btag064)).

With a group of researchers from The Netherlands, Switzerland, Czech Republic, and
the USA, multiple databases are wrapped in a uniform data model. The package
allows the generation of a graph across the imported databases which can then
be further analyzed and visualized. This is an example (RDF) graph that was generated:

![](/assets/images/pyBiodatafuseGraph.png)

Seeing this kind of interoperability brings back [good memories](https://chem-bla-ics.linkedchemistry.info/2010/03/04/rdf-jena-bioclipse-eclipse-zest-2-icons.html).

Congrats to all authors!
