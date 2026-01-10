---
layout: post
title:  "All BioHackrXiv preprints and BioHackathon RSS feeds"
date:   2025-06-22
doi: 10.59350/18gr7-6mx88
tags: biohackrxiv europepmc
image: /assets/images/biohackrxiv_index.png
comments:
  host: social.edu.nl
  username: egonw
  id: 114727446486719671
---

One thing I was still missing in [BioHackrXiv](https://biohackrxiv.org) was a place with an overview
of: 1. all biohackathons, 2. all preprints linked to a biohackathon, 3. an RSS feed for new papers of a biohackathon.
Of course, there is the [BioHackrXiv discover](https://biohackrxiv.org/discover) service, but the biohackathon
is not a metadata field and I cannot filter based on it. And, of course, there is Scholia, but not all preprints
are notable (so far, a good number had CiTO annotation that at least made them somewhat notable). Thus,
they are not all listed in [this venue page](https://scholia.toolforge.org/venue/Q115450084) and neither
on [this overview of collections of preprints linked to BioHackathon Europe meetings](https://scholia.toolforge.org/event-series/Q109379759).

Additionally, it also does not have an RSS feed, and
[we should indeed be using RSS more](https://pluralistic.net/2024/10/16/keep-it-really-simple-stupid/read-receipts-are-you-kidding-me-seriously-fuck-that-noise).
So, I hacked something up and impressions were positive. Based on Jekyll and the experiences I had with this
blog, I modelled individual articles as blog posts and biohackathons as tags. That automatically gave me
the RSS feeds:

* [feed for new BioHackrXiv preprints](https://index.biohackrxiv.org/feed.xml) (or [this JSON Feed](https://index.biohackrxiv.org/feed.json))
* [feed for Europe BioHackathon 2021](https://index.biohackrxiv.org/feed/by_tag/BH21EU.xml) (based on [the BH21EU tag](https://index.biohackrxiv.org/tag/BH21EU))

It's still very much in progress, but it's now live at [index.biohackrxiv.org](https://index.biohackrxiv.org/):

![](/assets/images/biohackrxiv_index.png)

## Extras

Some extra goodies already there include:

* the [Altmetric.com donut](https://en.wikipedia.org/wiki/Altmetrics)
* links to [Scholia](https://scholia.toolforge.org/)
* links to [Europe PMC](https://europepmc.org/)

The [overview of biohackathons](https://index.biohackrxiv.org/tags/) looks like this (the tag size follows the number
of preprints for that biohackathon):

![](/assets/images/biohackrxiv_biohackathons.png)
