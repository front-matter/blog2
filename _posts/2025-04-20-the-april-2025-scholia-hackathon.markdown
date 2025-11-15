---
layout: post
title:  "The April 2025 Scholia hackathon"
date:   2025-04-20
modified_date: 2025-04-20 14:58
doi: 10.59350/d79ep-rzd32
tags: scholia javascript sparql
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

This is the third weekend I am working on Scholia, the first two part of the [April 2025 hackathon](https://www.wikidata.org/wiki/Wikidata:Scholia/Events/Hackathon_April_2025#Participants). It follows the hackathons
last year [October](https://www.wikidata.org/wiki/Wikidata:Scholia/Events/Hackathon_October_2024) and
[November](https://chem-bla-ics.linkedchemistry.info/2024/11/17/sparql-examples.html) hackathons.
There is some urgency for this unpaid work, because Wikidata is splitting the RDF into two
SPARQL endpoints (see [this The Signpost](https://en.wikipedia.org/wiki/Wikipedia:Wikipedia_Signpost/2024-05-16/Op-Ed)
and [this post by Finn](https://finnaarupnielsen.wordpress.com/2024/10/18/scholia-in-the-age-of-the-wikidata-query-service-split/)).
This split has happened, but there is a *legacy* server for tools that have not been upgraded.

Scholia has not been upgraded. It has more then 350 SPARQL queries, and each one has to be tested
separately and updating every query is not trivial. Together with Daniel, Finn, and others, I have
hacked up patches last year to:

* [configure Scholia for the endpoint to use](https://chem-bla-ics.linkedchemistry.info/2024/08/23/scholia.html)
* [create pages for many Scholia SPARQL queries](https://chem-bla-ics.linkedchemistry.info/2024/11/17/sparql-examples.html)

This month I continued working on the second, and I:

* [added titles for chemistry aspect panels](https://github.com/WDscholia/scholia/pull/2597)
* [use the legacy SPARQL endpoint](https://github.com/WDscholia/scholia/pull/2589)

That second also indicated that the legacy server has more limited resources and users will more
quickly run into error messages that too many queries are run in parallel. Now, users can rerun
the query, but then the results table contains the previous error message. Second, you want to run
the queries for one aspect to not run all at the same time, but have Scholia send of the
query when the panel becomes visible (and scrolling a page takes a bit of time).

For these issues, I wrote these two patches (yet to be approven and merged):

* [delete the previous error message](https://github.com/WDscholia/scholia/pull/2608)
* [lazy load the table and iframe panels](https://github.com/WDscholia/scholia/pull/2611)

Now, the iframes already had some aspects of lazy loading, but it turned out that it was mostly
lazy display, and the queries were still run as soon as possible. This last patch challenged my
JavaScript skills and I learned `Intersection Observer API`, a browser technology that allows
the browser to see what part of the webpage you are looking at right now. Yeah, I can easily
see how that does user profiling, but in this case it is just used to fire of the SPARQL
query when it become relevant. It uses an additional callback function, so I had to
make sure Jekyll/Liquid creates custom callback functions for each panel.
Actually, I intended to show the code here, but I am not entirely sure how to escape
the code so that Jekyll does not try to run the instructions. For now, you have to
[check the PR](https://github.com/WDscholia/scholia/pull/2611/files).

## Scholia Chemistry paper

The other things I have been doing, is finally finish up the Scholia Chemistry paper.
That actually depended on the maturing of various tools, me figuring out how to characterize
the actual amount of content contributed to Wikidata and how to make that transparent,
and more recently, the above to be able to convince readers Scholia will not die with
the graph split. With the above pages, we have, I think, sufficient guarantee it will
be around for another few years, at least.

This paper, which I hope to finish the final draft today, applying
some good feedback from co-author last weekend, is the final bit of work done on
the Alfred P. Sloan Foundation grant.

We intend to put the paper up as preprint soon and then submit it do a Diamond Open Access
journal, one that supports CiTO citation intent annotation.
