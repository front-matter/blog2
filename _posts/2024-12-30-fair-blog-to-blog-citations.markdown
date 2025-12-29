---
layout: post
title:  "FAIR blog-to-blog citations"
date:   2024-12-30
tags: cito blog publishing justdoi:10.59348/1z1p2-nn569 justdoi:10.59350/1nmwy-nhk20 justdoi:10.53731/3c6pm-xbp04
image: /assets/images/nanopub1.png
doi: 10.59350/er1mn-m5q69
---

[Linkrot is real](https://chem-bla-ics.linkedchemistry.info/2021/08/28/scholarly-journals-should-use-archived.html) and
[digital preservation problematic](https://doi.org/10.59348/1z1p2-nn569). One reason why I have
[started migrating my blog](https://chem-bla-ics.linkedchemistry.info/2023/07/27/archiving-and-updating-my-blog.html)
to a more robust platform. That first step gave me version control. This summer my blog was
[accepted to Rogue Scholar](https://chem-bla-ics.linkedchemistry.info/2024/07/21/rogue-scholar-and-more.html).
That gave me DOIs. And an idea.

Things are coming together, and while commercial publishers (SpringerNature, Elsevier, MDPI, Frontiers, etc)
are focused on profit ("shareholder value") instead of the community they serve, Open Science is providing
working, real-world, inexpensive, superior FAIR solutions for scientific dissemination. Maybe European
universities are not convinced yet (see [Björn's post](https://doi.org/10.59350/1nmwy-nhk20)), but it is
happening.

Two things that are happening are [OpenAlex](https://openalex.org/) and [OpenCitations](https://opencitations.net/).
[CiTO adoption](https://chem-bla-ics.linkedchemistry.info/tag/cito) not so much yet, but I am not giving up
yet. Simply because Open Science doesn't go away and everything can be picked up tomorrow. Each holiday
I am picking up the Citation Typing Ontology and this holiday the
[use of nanopublications for CiTO intent annotation](https://chem-bla-ics.linkedchemistry.info/2024/04/02/open-science-retreat-2.html)
of April this year.

Yesterday, I played with the nanopublication templates used by NanoDash, got to the triples of it, and
ended up using the web interface to create [a derived template](https://w3id.org/np/RA43F9EoOuzF0xoNUnCMNyFsfIqlsuWDdPHCnN0wCdCAw)
from [Tobias' template from April](https://w3id.org/np/RAX_4tWTyjFpO6nz63s14ucuejd64t2mK3IBlkwZ7jjLo).
What makes this nanopublication template special is that it uses [the CiTO ontology](https://github.com/SPAROntologies/cito).

The difference is that the original template used `ScholarlyWork` as type for the citing resource,
while the derivative uses `CreativeWork` from the schema.org namespace, allowing things like this:

* article to software release: [example nanopub](https://w3id.org/np/RAzmTPPM7v5Ilgvo-3aFRRZgdD3ImaUB434NtGlfI0G90)
* article to blog: [example nanopub](https://w3id.org/np/RAaRH1WhRgirso3JiTUJJ0XcBaRyHI6G4OZPdWBoIf17U)
* blog to article: [example nanopub](https://w3id.org/np/RAXL9q3jakrpaDh8oyVaNS1Y7JowmZm4tx4WcdIFMmg8g)
* blog to blog: [example nanopub](https://w3id.org/np/RAJOwolZUwUxuvPEhMFiQYHywJdWMWTlt_gnXoUbUBaYY)

The last three are possible because of the Rogue Scholar DOIs. Let's continue with the fourth example,
the blog to blog citation. While an URL is a unique, global identifier, the digital preservation depends
on a lot of things. On the other hand, a DOI with the associated metadata is easier to preserve. For example,
because it can be spread more easily than the digital object itself.

So, when [Martin Fenner](https://blog.front-matter.io/author/martin/) and
[I](https://chem-bla-ics.linkedchemistry.info/2024/12/08/rich-l-apodaca.html)
[started](https://chem-bla-ics.linkedchemistry.info/2024/12/27/archiving_blogs.html)
[archiving](https://doi.org/10.53731/3c6pm-xbp04)
the [Depth-First blog of Rich Apodaca](https://depth-first.com/) to digitally preserve his blog, <!-- keep link -->
it also automatically gave the blog posts DOIs. This makes the blog more FAIR, just like it does
for my blog. And being more FAIR, we can use the DOIs for other things too, like blog to blog
citations with CiTO intent annotation, as nanopublications.
(Technically, any Springer Nature journal can do this, but they found reasons to not do it.)

So, let's take [this blog post](https://chem-bla-ics.linkedchemistry.info/2024/12/08/rich-l-apodaca.html).
I have today updated this to not use `depth-first.com` URLs but, following Martin's example, use the DOIs <!-- keep link -->
for those posts instead.

And when I make a nanopublication out of this, I can add the citation intent, and then it looks like
[this](https://w3id.org/np/RAmETOQXyoS5dYeP8yhJscOrAIimf1RHFnzG2GtziqIQ8):

![](/assets/images/nanopub1.png)

For some reason, the DOIs do not show up as references as they do for this post for the DOIs of the
posts of Martin Paul Eve, Björn Brembs, and Martin Fenner. It does for
[this post citing Depth-First](https://chem-bla-ics.linkedchemistry.info/2009/11/19/chempedia-rdf-1-sparql-end-point.html).

So, from now on, I will use DOIs when citing other blog posts, and I hope many other blogs will
start using Rogue Scholar or some other service to generate DOIs for single blog posts.
I also have to figure out if I want to use DOIs to link to posts in my own blog.
And hopefully, OpenCitations will soon accept citations provided by nanopublications.
With or without CiTO intent annotations, whatever comes first. Oh, and I cannot wait to see
the citations who up in [Altmetric.com](https://www.altmetric.com/) :)

Let's see where this is going.
