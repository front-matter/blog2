---
layout: post
title:  "The Internet Journal of Chemistry"
date:   2025-08-11
doi: 10.59350/2ss5b-jpr33
tags: publishing wikidata scholia doi:10.5281/ZENODO.1495470
  cito:citesAsEvidence:10.1080/00987913.2000.10764578 europepmc
image: /assets/images/ia_ijc.png
comments:
  host: social.edu.nl
  username: egonw
  id: 115009169485329450
---

The [Internet Journal of Chemistry](https://scholia.toolforge.org/topic/Q27211732) (IJC, issn:1099-8292) was one of the first scientific journals to get
published on the world wide web (part of *the Internet*), see doi:[10.1080/00987913.2000.10764578](https://doi.org/10.1080/00987913.2000.10764578).
Issues were published from 1998 to 2004. But because it predates
systematic archiving of webpages by libraries, a lot is lost. The nature of the journal, however, makes it unique, and quite
a number of articles are cited a lot, and should be part of the *scientific record*.
But I soon realized it actually is quite hard to track down content of the journal. I knew some articles have been
*author accepted manuscripts* online. One of that was my own first (and single) author-article, self-archived on
Zenodo (doi:[10.5281/zenodo.1495470](https://doi.org/10.5281/zenodo.1495470)), green open access style.

I wanted to see what I could recover, and here I describe what I did and what could be done next.

## A list of all articles

The first step is actually to create a list of all articles published in the IJC and collect as much metadata about
them as possible. With just over 100 articles, I decided to use Wikidata, as a machine-readable database, supporting the curation and reporting. I wanted at least
two independent sources, and for Wikidata, use public resources. That means, while Web of Science does have a list of
all articles, I only used this for validation, and **not** as information source. Instead, I used citations to IJC
articles and, of course, the Internet Archive (IA). It turns out [a query like this](https://web.archive.org/web/*/http://www.ijc.com/abstracts/*)
does wonders (well, for the abstracts; I did not find full-texts archived on IA):

```
https://web.archive.org/web/*/http://www.ijc.com/abstracts/*
```

I found that all but one article had the abstract archived in the IA. Here's [an example](https://web.archive.org/web/20000925050415/http://www.ijc.com/abstracts/abstract2n8.html):

![](/assets/images/ia_ijc_abstract.png)

This gave my a lot of information to add to Wikidata. Title, publication date, volume, article number, keywords, an absstract,
and, of course, the list of authors. Some authors I know personally, many I did not. But it did allow me to enter all
articles to Wikidata along with the authors and "author" ([P50](https://www.wikidata.org/wiki/Property:P50)) or
"author name string" ([P2093](https://www.wikidata.org/wiki/Property:P2093)).

## The article authors

It also turned out that multiple authors listed their IJC article on their public ORCID profile.
That greatly helped identification. I managed to [link many authors](https://w.wiki/Ezda) to mostly existing Wikidata items:

![](/assets/images/ijc_authors.png)

I already mentioned that I used Wikidata to collect this information. Besides the [interactive visualization with Scholia](https://scholia.toolforge.org/venue/Q27211732),
it also gave me the option to track my progress with SPARQL queries. For example, [this query](https://w.wiki/Ezdf) helped
me do that author FAIR-ification:

![](/assets/images/ijc_sparql1.png)

You can see here two columns with author information, one for P50 and the other for P2093. There is quite some
identification left to be done, and additional information is welcome:

![](/assets/images/ijc_sparql2.png)

## Sources

So, that brings us to this list of sources:

* Internet Archive: abstracts and metadata
* ORCID profiles: ORCIDs of (some) authors
* Google Scholar: metadata and citations
* Web of Science: independent list for external validation

Because there is plenty of work left to be done and I hope the collected information will further spread
in library collections, I added sources as much as possible. [This query](https://w.wiki/Em9i) lists for all
articles the Web of Science identifier (recorded so that everyone can check the consistency), the link
to the Internet Archive-d abstract page, and a link to a known full text (five).

If you wonder, neither [OpenAlex](https://openalex.org/works?page=1&filter=primary_location.source.id:s32147083)
or [Europe PMC](https://europepmc.org/search?query=JOURNAL%3A%28%22Internet%20Journal%20of%20Chemistry%22%29) have a full list.

## What's next?

I do not have a formal training in archiving, but I am happy with the minimal viable metadata collection.
I know more can be done (and love to hear your pointers and suggestions): more author identies,
better coverage of keyword annotation, etc. But I think an important addition is adding citations
to and from the IJC articles are important. The journal predates efforts like the [I4OC](https://i4oc.org/) and
[Open Citations](https://opencitations.net/), so I may have to manually recover citations from Google Scholar.
I will have to report on that later. But you can enjoy the citations that are
[already there](https://scholia.toolforge.org/venue/Q27211732#Citations). And now that we have sufficient metadata,
I can use this to find more full texts.

Btw, I have made contact with Prof. [Steven Bachrach](https://scholia.toolforge.org/author/Q28420106),
who founded the journal and was the Editor-in-Chief.
