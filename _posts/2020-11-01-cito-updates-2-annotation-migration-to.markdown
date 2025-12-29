---
layout: post
title:  "CiTO updates #2: annotation migration to Wikidata and first Scholia patch"
date:   2020-11-01 00:10
blogger-link: https://chem-bla-ics.blogspot.com/2020/11/cito-updates-2-annotation-migration-to.html
doi: 10.59350/6v7gp-pfd21
tags: cito wikidata scholia
image: /assets/images/cito_in_wikidata.png
grants:
  - grant:
    title: "To support development on Scholia, a software tool to facilitate the exploration and curation of the research literature"
    acronym: "Scholia"
    identifier: G-2019-11458
    uri: https://sloan.org/grant-detail/G-2019-11458
    funder:
      name: "Alfred P. Sloan Foundation"
      ror: 052csg198
---

During the time of the editorial about the Journal of Cheminformatics
[Citation Typing Ontology (CiTO) Pilot](https://chem-bla-ics.blogspot.com/2020/07/new-editorial-adoption-of-citation.html)
I already worked out a model to add CiTO annotation in Wikidata. It looks like this for
[the first research article with annotation](https://chem-bla-ics.blogspot.com/2020/11/cito-updates-1-first-research-paper-in.html):

![](/assets/images/cito_in_wikidata.png)

At the time I also write some [SPARQL queries against Wikidata](https://github.com/egonw/cito-wikidata-queries) to
summaries the current use. There are, for example, at this moment [128 CiTO annotations in Wikidata](https://query.wikidata.org/#SELECT%20%3FcitingArticle%20%3FcitingArticleLabel%20%3FcitedArticle%20%3FcitedArticleLabel%20%3Fintention%20%3FintentionLabel%20%3Fcito%20WHERE%20%7B%0A%20%20%3FcitingArticle%20p%3AP2860%20%3FcitationStatement%20.%0A%20%20%3FcitationStatement%20pq%3AP3712%20%3Fintention%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20ps%3AP2860%20%3FcitedArticle%20.%0A%20%20%3Fintention%20wdt%3AP31%20wd%3AQ96471816%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20wdt%3AP2888%20%3Fcito%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D)
(with the above model). At this moment the citation intention ["uses method in cited work" is currently the most common](https://query.wikidata.org/embed.html#SELECT%20%3Fcito%20%3FintentionLabel%20(COUNT(DISTINCT%20%3FcitingArticle)%20AS%20%3Fcount)%20WHERE%20%7B%0A%20%20%3FcitingArticle%20p%3AP2860%20%3FcitationStatement%20.%0A%20%20%3FcitationStatement%20pq%3AP3712%20%3Fintention%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20ps%3AP2860%20%3FcitedArticle%20.%0A%20%20%3Fintention%20wdt%3AP31%20wd%3AQ96471816%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20wdt%3AP2888%20%3Fcito%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fcito%20%3Fintention%20%3FintentionLabel%0A%20%20ORDER%20BY%20DESC(%3Fcount)).
And 20 journals now have one or more articles with CiTO annotation, with the [Journal of Cheminformatics the most](https://query.wikidata.org/embed.html#SELECT%20%3Fjournal%20%3FjournalLabel%20(COUNT(DISTINCT%20%3FcitingArticle)%20AS%20%3Fcount)%20WHERE%20%7B%0A%20%20%3FcitingArticle%20p%3AP2860%20%3FcitationStatement%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20wdt%3AP1433%20%3Fjournal%20.%0A%20%20%3FcitationStatement%20pq%3AP3712%20%3Fintention%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20ps%3AP2860%20%3FcitedArticle%20.%0A%20%20%3Fintention%20wdt%3AP31%20wd%3AQ96471816%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D%20GROUP%20BY%20%3Fjournal%20%3FjournalLabel%0A%20%20ORDER%20BY%20DESC(%3Fcount))
(no surprise).

## Scholia

Next up is to enrich [Scholia](https://scholia.toolforge.org/). This may be a bit tricky at this moment, with the annotation not
being very abundant at this moment. However, I have started a patch (WIP, **w**ork **i**n **p**rogress) to show CiTO information.
The first step is an extension to the venue aspect, here in action (locally) for the Journal of Cheminformatics:

![](/assets/images/cito_jcheminf.png)

What we learn from this bubble graph is that at this moment that 'updates the cited work' is the most common annotation of
articles citing J.Cheminform. articles. Similar pages will have to be developed for works, authors, etc.

This Scholia work, btw, was funded by a Alfred P. Sloan under grant number [G-2019-11458](https://sloan.org/grant-detail/8961).
