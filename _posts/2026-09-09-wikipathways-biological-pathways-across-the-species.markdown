---
layout: post
title:  "WikiPathways: biological pathways across the species"
date:   2026-09-09
doi: 10.59350/pgq2r-6xj29
tags: wikipathways openscience justdoi:10.1371/journal.pbio.0060184 justdoi:10.1126/science.321.5889.623c
  justdoi:10.12688/wellcomeopenres.18658.1 justdoi:10.1073/pnas.2109019118 justdoi:10.1093/genetics/iyae185
  justdoi:10.1038/npre.2010.5361.1 justdoi:10.1038/455022A justdoi:10.3389/fgene.2019.01370
  justdoi:10.1007/978-1-0716-5360-9_3
image: /assets/images/wp_pws_per_species_thumbnail.png
#comments:
#  host: social.edu.nl
#  username: egonw
#  id: ...
---

I was not there. I only joined the [WikiPathways](https://wikipathways.org/) project in late 2011, just as a contributor.
And it was just before joining the
[BiGCaT research team](https://www.maastrichtuniversity.nl/research/bioinformatics) of Prof. Chris Evelo in January 2012,
where I started a project in the [Open PHACTS](https://en.wikipedia.org/wiki/OpenPHACTS) project, not really about WikiPathways,
but the open science WikiPathways was the main reason for me to join the group. Open PHACTS was close to my research and
just created that opportunity.

WikiPathways was already around five years old when I created my account. It was created in January 2007
(doi:[10.1038/npre.2010.5361.1](https://doi.org/10.1038/npre.2010.5361.1)). It was first formally published in 2008
(doi:[10.1371/journal.pbio.0060184](https://doi.org/10.1371/journal.pbio.0060184)), so the project is about 20 years
old (maybe a new WikiPathways conference next year?). The launch made it to Science
(doi:[10.1126/science.321.5889.623c](https://doi.org/10.1126/science.321.5889.623c)):

> The makers of GenMAPP [..] have launched a site for
> sharing findings on metabolic pathways. [..]
> WikiPathways (wikipathways.org) offers a way to integrate
> information on these complex networks [..]
> The site has more than 300 registered users and contains
> information on 500 metabolic pathways in seven species,
> including humans.

And Nature (doi:[10.1038/455022A](https://doi.org/10.1038/455022A)):

> Alexander Pico remembers just when the idea hit him. In January 2007, he and his boss, Bruce Conklin, were discussing
> how to push their software tool for visualizing intracellular signalling pathways to the next level of interactivity —
> when Pico blurted out, "What we really need is a wiki!"

Just like review article curate and put primary literature in context, so that WikiPathways.
They pitched it at the time as modelled after Wikipedia, but surely it is also just as well modelled
after traditional knowledge dissemination approaches. One can easily argue that the wiki approach is
essential: anyone can create an account. And this has been held against WikiPathways. But if you look
at the who actually edits WikiPathways, these are only people working in an academic research
environment.

WikiPathways is, of course, used as a reference knowledgebase, and the use in pathway enrichment and
networking approaches are perhaps the best known. Another aspect of a wiki, however, is the community approach:
a community can work out a collection of machine-readable (FAIR) pathway models, even when the discovery is in full swing.
WikiPathways is also a platform to exchange knowledge, discuss literature, do research. The use to of
this feature turned out [really useful at the start of the COVID-19 pandemic](https://chem-bla-ics.linkedchemistry.info/2020/05/07/new-project-covid-19-disease-maps.html).

## Genomes, species, and pathways

The set of full genome assemblies was not that large; in 2021 there were 3278 genome assemblies for animal species
(doi:[10.1073/pnas.2109019118](https://doi.org/10.1073/pnas.2109019118) and the *Genomes on a Tree*
(doi:[10.12688/wellcomeopenres.18658.1](https://doi.org/10.12688/wellcomeopenres.18658.1)) reports 27883 assemblies
for [664 complete genomes](https://goat.genomehubs.org/search?result=taxon&taxonomy=ncbi&includeEstimates=true&report=histogram&x=assembly_date&rank=species&cat=assembly_level%5B4%5D%3Dscaffold%2Cchromosome%2Ccontig%2Ccomplete%20genome&stacked=true&excludeAncestral%5B0%5D=assembly_span&excludeMissing%5B0%5D=assembly_span&caption=Progress%20of%20genome%20assemblies%20published%20on%20INSDC%20over%20time%2C%20by%20assembly%20level&offset=0&xOpts=&fields=assembly_date%2Cgenome_size%2Cassembly_level%2Cassembly_span%2Cchromosome_number%2Chaploid_number&includeDescendants=false&emptyColumns=false&query=tax_rank%28species%29%20AND%20assembly_date%3E%3D1925-01-01%20AND%20assembly_date%3C2027-01-01%20AND%20assembly_level%3Dcomplete%20genome#tax_rank(species)%20AND%20assembly_date%3E%3D1925-01-01%20AND%20assembly_date%3C2027-01-01%20AND%20assembly_level%3Dcomplete%20genome).

For WikiPathways, seven species in 2008 grew to [39 species today](https://www.wikipathways.org/browse/organisms) today,
though many of them only have a few curated pathways. Indeed, human is still the predominent species, in number of
pathways (visualized with [this SPARQL query](https://edu.nl/8644d)).

[![](/assets/images/wp_pws_per_species.png)](https://query.wikidata.org/#%23defaultView%3ABarChart%0APREFIX%20dc%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0APREFIX%20wp%3A%20%3Chttp%3A%2F%2Fvocabularies.wikipathways.org%2Fwp%23%3E%0A%0ASELECT%20%2a%20WHERE%20%7B%0A%20%20SELECT%20DISTINCT%20%28str%28%3Flabel%29%20as%20%3Fname%29%20%3Forganism%20%28count%28%3Fpw%29%20as%20%3FpathwayCount%29%0A%20%20WHERE%20%7B%0A%20%20%20%20SERVICE%20%3Chttps%3A%2F%2Fsparql.wikipathways.org%2Fsparql%3E%20%7B%0A%20%20%20%20%20%20%3Fpw%20dc%3Atitle%20%3Ftitle%20%3B%0A%20%20%20%20%20%20%20%20wp%3Aorganism%20%3Forganism%20%3B%0A%20%20%20%20%20%20%20%20wp%3AorganismName%20%3Flabel%20.%0A%20%20%20%20%7D%0A%20%20%7D%20GROUP%20BY%20%3Flabel%20%3Forganism%0A%7D%0AORDER%20BY%20DESC%28%3FpathwayCount%29)

That said, several communities have worked in the past to create
[sets of pathways](https://chem-bla-ics.linkedchemistry.info/2026/02/22/where-do-the-wikipathways-come-from.html)
around specific species. In that post, I already mentioned Wormbase, but we also have a collection of pathways
from [YeastPathways](https://pathway.yeastgenome.org/) (doi:[10.1093/genetics/iyae185](https://doi.org/10.1093/genetics/iyae185)),
for example [wikipathways:WP137](https://www.wikipathways.org/pathways/WP137).
Now, the yeast pathways are not in sync with the upstream SDG YeastPathways, I think, so there is some
curation to do on our side (from the 2025 Genetics paper):

> As the first major update since 2012, we updated 62 pathways with expert summaries on
> pathway genetics, biochemistry, regulation, and more. Thirty-three new pathways with
> specificity for yeast biochemistry were propagated from MetaCyc at SRI (Caspi et al. 2018),
> and 105 existing pathways were edited for proper enzymatic classification, reaction
> connectivity, and gene attribution. Compounds that were previously missing a chemical
> structure have also now been updated, along with the stoichiometry and scheme of many
> pathway reactions.

In similar style, WikiPathways has had similar project around setting up a pathway collection
for a new species, like cow in a project by [Zahra Roudbari](https://www.wikipathways.org/authors/Zari.html)
(doi:[10.3389/fgene.2019.01370](https://doi.org/10.3389/fgene.2019.01370)).
And more recently [atlantic cod](https://www.wikipathways.org/organisms/cod)
(ongoing research by [Madhushri S. Varunjikar](https://www.wikipathways.org/authors/MadhushriMSV.html)
from the Norwegian [Institute of Marine Research](https://www.hi.no/)).

## Homology converted pathways

But WikiPathays also has a feature to convert pathways from one species to another. With more and
more whole genome assemblies becoming available, so are mappings of genes between one species and
another. This is the basis of that cow project (from [the article](https://doi.org/10.3389/fgene.2019.01370)):

> The online biological pathway repository, WikiPathways (Slenter et al., 2017), contains pathways
> of different species, however a B. taurus collection was missing.

And:

> Second, the WikiPathways homology based the homology mapper which is available at GitHub
> (https://github.com/PathVisio/homology.mapper) was updated to improve homology coverage for gene
> products that were annotated with different data sources. The pathways were converted from human
> pathways, with a required minimum successful conversion of at least 50% of the original human genes.

The question is, of course, what is the best model species to use. That decision can be based on
multiple aspect, including the use case. There is freedom.

So, when this week the article *Xenbase: A Guide to the Xenopus Genetics and Genomics Knowledgebase*
was published (doi:[10.1007/978-1-0716-5360-9_3](https://doi.org/10.1007/978-1-0716-5360-9_3)), and
was pinged WikiPathways was cited, I started reading.

> WikiPathways are linked via gene symbol (Fig. 6A, black arrow) link redirects to a pre-set gene
> symbol search on this community-curated open science resource [20].

The linking via gene symbol made me write up this post. If they have the mappings, then with
the [GPML Homology Mapper](https://github.com/PathVisio/homology.mapper) we can create pathways
for the two frog species (*X. laevis* and *X. tropicalis*).

## Species specific curation

And there are reasons to do that. WikiPathways allows you to cite literature, at a pathway level,
for a gene, protein, or metabolite, and even at the level of an interaction. That literature is
species specific. The curation can also work out what to do with those parts of pathways for
which no genes were mapped. Having this is machine-readable knowledge has shown to be of
great usability, at the very least making the knowledge much, much easier to find.

And that brings us back to another role of review articles, of book chapters giving expert overviews,
but also of wiki's: put knowledge in perspective of the literature from which it is derived.
I wish pathways database, generally, are used to communicate and get peer reviewed the fruits
of the work studying the biological processes on all these species.

With more than 600 full genomes and 39 species in WikiPathays, we have an exciting and growing seed.
