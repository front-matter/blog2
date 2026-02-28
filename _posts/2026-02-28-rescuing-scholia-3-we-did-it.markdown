---
layout: post
title:  "Rescuing Scholia #3: We did it!"
date:   2026-02-28
doi: 10.59350/kd793-2fe02
tags: scholia sparql swat4ls doi:10.3897/RIO.5.E35820
#comments:
#  host: social.edu.nl
#  username: egonw
#  id: ...
---

It was not a set up, when I openly [wondered if we would be able to rescue Scholia in time](https://chem-bla-ics.linkedchemistry.info/2025/12/08/rescuing-scholia.html).
I honestly did not know. Three weeks and some serious hacking by an international team later [I was more optimistic](https://chem-bla-ics.linkedchemistry.info/2025/12/31/rescuing-scholia-2-getting-close.html).
Actually, just before christmas, we started writing a [SWAT4HCLS 2026](https://www.swat4ls.org/) demonstration abstract. This was accepted and
you can read the *Scholia 2026: Compliance with SPARQL 1.1* preprint [here](https://github.com/WolfgangFahl/ScholiaGraphSplitPaper) and
[here](https://commons.wikimedia.org/wiki/File:Scholia_2026_Compliance_with_SPARQL_1.1.pdf).
This paper describes the work that had to be done, and I am deeply grateful to everyone who contributed with smaller or
bigger contributions (Daniel, Peter, Konrad, Johannes, Lars, Wolfgang, Hannah).
I am merely first author for the demo, and just another contributor to the long series of patches, in a
[branch started by Prof. Hannah Bast](https://github.com/WDscholia/scholia/pull/2715).

The work actually started long before that, with the *Robustifying Scholia* grant (see doi:[10.3897/rio.5.e35820](https://doi.org/10.3897/rio.5.e35820)),
where we explored alternatives. The Wikidata graph (RDF) split has been long coming, and I can recommend
[this recent The Signpost article](https://en.wikipedia.org/wiki/Wikipedia:Wikipedia_Signpost/2026-02-17/Technology_report)
by [Lane](https://disobey.net/@Bluerasberry) for a good overview. So, this would not have been possible with
[the many people who contributed over the years](https://github.com/WDscholia/scholia/graphs/contributors).
But this last sprint really made a difference.

The developments of the QLever software in the past year are very important, and the SPARQL endpoint we run now is live updated,
just like we knew from the Wikidata Query Service (WDQS). Recent improvement allowed us to replace all the Wikidata and Blazegraph
specific aspects of the SPARQL queries, and good discussions let to pragmatic approaches to keep localization features
Scholia had for displaying query results from Wikidata.

The work is not completed, however. All queries are SPARQL 1.1 now, but some can still be further optimized, and some still
need some fixing. For example, I still spot some QIDs here and there, instead of the localized labels that should be shown instead.
Also, we are actively looking in getting everything running again on WMF servers (see [this overview issue](https://github.com/WDscholia/scholia/issues/2766)),
so that *scholia.toolforge.org* works again.

For now, however, please use [qlever.scholia.wiki](https://qlever.scholia.wiki/).
