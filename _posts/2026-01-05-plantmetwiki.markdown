---
layout: post
title:  "PlantMetWiki: a linked open data service for querying and analyzing plant pathway knowledge"
date:   2026-01-05
doi: 10.59350/wyz5v-vts33
tags: wikipathways gpml rdf justdoi:10.5281/zenodo.18149988 justdoi:10.1093/nar/gkae991
  justdoi:10.1186/1471-2105-11-5 justdoi:10.5281/zenodo.17245658
image: /assets/images/plantmetwiki.png
comments:
  host: social.edu.nl
  username: egonw
  id: 115841132838944493
---

Back on October I presented *Everything you always wanted to know: plant pathway modelling in WikiPathways* (doi:[10.5281/zenodo.18149988](https://doi.org/10.5281/zenodo.18149988))
at the *Knowledge Graphs for Plant and Microbiome Multiomics* symposium (see [this archived LinkedIn post](https://web.archive.org/web/20260105060309/https://www.linkedin.com/posts/elena-del-pup-840805164_knowledgegraphs-plantbiology-fairdata-activity-7351538387108978689-bgqh/))
on 14th October 2025 ([youtube recording](https://www.youtube.com/watch?v=NgYRHiuBvpc)).
I had not found time yet to post about this meeting, but it was an awesome list of speakers, regrettable absense of some others, but resulting
in new contacts and some slowly evolving collaborations.

Previously, plant pathways were not negatively prioritized at our BiGCaT research group. Something with Dutch academic politics. But that
was 10 years ago, and with the notion that human health very much involves the exposome, which includes live around humans, I think the
plant pathway science is important to human health. Even just the human health impacts of drops in biodiversity. Or the impact on our
nutrition supply chain of climate change.

Anyway, I am happy that [Elena](https://github.com/elenadelpup) and [Denise](https://github.com/DeniseSl22)
pulled me into a [collaboration](https://github.com/pathway-lod) to create an RDF-based knowledge graph about plant pathways.
Their idea was to [PlantCyc](https://plantcyc.org/) pathways (their license seems to allow that; doi:[10.1093/nar/gkae991](https://doi.org/10.1093/nar/gkae991)),
convert that to GPML ([by Max](https://github.com/pathway-lod/Cyc_to_wiki)) and then to RDF. That last step is where I come in. The details will follow later, but Elena announced
the project on LinkedIn ([archived link](https://web.archive.org/web/20260105060958/https://www.linkedin.com/feed/update/urn:li:activity:7407756920041713664/)),
so time to blog about it myself too.

I am happy with this effort, not just because we now have pathways in RDF form for more than 500 species, but also
because it requires continued development of the WikiPathways solutions, like GPML and
[libGPML](https://github.com/PathVisio/libGPML) and the RDF generation
code, but also BridgeDb (doi:[10.1186/1471-2105-11-5](https://doi.org/10.1186/1471-2105-11-5)).
The latter provides the identifier mapping infrastructure, but needed to be extended for
the new species (something I had to do earlier this year for several [caffeine synthesis pathways](https://www.wikipathways.org/search.html?query=caffeine+synthesis)
developed at the [DBCLS BioHackathon 2025](https://2025.biohackathon.org/)).

Lars gave me a tip on how to scale this up (after [a manual addition](https://github.com/bridgedb/datasources/commit/be64e5ac120d21fc70f742a090353fb801279b38)),
[verifier.globalnames.org](https://verifier.globalnames.org/) (doi:[10.5281/zenodo.17245658](https://doi.org/10.5281/zenodo.17245658),
which greatly helped me out. It translates species names
into identifiers, and their JSON is very rich in that process as well as easy to process. So,
[a custom script]() allowed me to update BridgeDb more efficiently. Highly recommended!

So, the resulting knowledge base is available at [plantmetwiki.bioinformatics.nl](https://plantmetwiki.bioinformatics.nl/)
and looks like this (also big thanks to Marvin for support in setting this up!):

![](/assets/images/plantmetwiki.png)
