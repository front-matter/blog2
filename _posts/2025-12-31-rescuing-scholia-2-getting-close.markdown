---
layout: post
title:  "Rescuing Scholia #2: getting closer"
date:   2025-12-31
doi: 10.59350/6t2qh-2f839
tags: wikidata scholia sparql rdf
comments:
  host: social.edu.nl
  username: egonw
  id: 115813885467920641
---

Three weeks ago, I wrote a the post [Rescuing Scholia: will we make it in time?](https://chem-bla-ics.linkedchemistry.info/2025/12/08/rescuing-scholia.html),
where I sketched a future without [Scholia](https://scholia.toolforge.org/). Scholia, started
[almost 10 years ago](https://chem-bla-ics.linkedchemistry.info/2023/01/27/scholia-timeline.html)
and I think it is worth keeping around longer.

Fortunately, it looks like we will have a working replacement in time before the
[WDQS](https://www.mediawiki.org/wiki/Wikidata_Query_Service) instance with all the
[Wikidata](https://wikidata.org/) triples in a single SPARQL endpoint goes down,
likely in a week or so (even tho we may be behind [the citation peak](https://openalex.org/works?page=1&filter=cites:w2767995756)).

The work of the past year helped, for exampe, making it easier to configure Scholia for a different
endpoint and the asynchronous loading of panels (reducing the stress on the SPARQL end point).
Already in September, Prof. [Hannah Bast](https://github.com/hannahbast) started
[a branch](https://github.com/WDscholia/scholia/pull/2715) for the transition and various
hackathons this autumn, and the work by [Konrad Linded](https://github.com/KonradLinden)
who explored and addressed some of the hurdles to take. The tips and suggestions from
Hannah and [RobinTF](https://github.com/RobinTF) really made a difference. And also a huge thanks
to [Daniel](https://orcid.org/0000-0001-9488-1870) who kept relentlessly pushing this forward.

When I posted my [will we make it](https://chem-bla-ics.linkedchemistry.info/2025/12/08/rescuing-scholia.html) post,
there was a demo instance and a spreadsheet showing the state of each query. The instance
showed no human-readable labels. This was because the WDQS `wikibase:label` service 
was used a lot, and there is no replacement for that. Getting labels for all relevant
items is possible, but makes the queries a lot heavier and made even more queries
run out of memory. Various solutions were [discussed](https://github.com/ad-freiburg/scholia/issues/17),
Finn indicated he [preferred a macro solution](https://github.com/ad-freiburg/scholia/issues/17#issuecomment-3605952951),
which [Lars implemented](https://github.com/ad-freiburg/scholia/pull/20/changes), and
saw some tweaks after that. Then followed a long series of patches by particularly
[Peter](https://github.com/pfps) to update all the SPARQL queries to have them use
the new labels macro. But plenty of other things were fixed or newly implemented,
such as [Wolfgang](https://github.com/WolfgangFahl)'s [/backend](https://qlever.scholia.wiki/backend)
page.

So, with one week to go, we need your help: as the weekly
[Wikidata Status Update](https://www.wikidata.org/wiki/Wikidata:Status_updates/2025_12_29)
already indicated:

> this month's Scholia hackathon has moved Scholia closer to its planned switch to a
> QLever backend. Beta testers can assist by exploring the
> [interim QLever-backed Scholia instance](https://qlever.scholia.wiki/)
> and [reporting any issues](https://github.com/WDscholia/scholia/issues).

And thanks to [Adriano](https://github.com/Adafede) and others who already have!

Now, we are not done yet. The real instance at [scholia.toolforge.org](https://scholia.toolforge.org/)
has seen ridiculous abuse by scrapers (and the main instance is regularly unusable, to be honest),
and we have no idea the new setup is powerful enough. And we need to point to the new servers anyway.
So, plenty of work is left to be done in the next few days.

But we are getting close. So, please give [qlever.scholia.wiki](https://qlever.scholia.wiki/)
a go, and let us know your observations. As [Linus's law](https://en.wikipedia.org/wiki/Linus%27s_law) writes:

> Given enough eyeballs, all bugs are shallow.
