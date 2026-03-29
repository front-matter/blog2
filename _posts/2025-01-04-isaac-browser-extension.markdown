---
layout: post
title:  "ISAAC Chrome Extension"
date:   2025-01-04
modified_date: 2026-03-29
authors:
  - name: Egon Willighagen
    orcid: 0000-0001-7542-0286
  - name: Lars Willighagen
    orcid: 0000-0002-4751-4637
tags: javascript cito:usesMethodIn:10.7717/peerj-cs.214
  mycito:citesAsEvidence:10.5281/ZENODO.14562484
  mycito:citesAsEvidence:10.5281/ZENODO.14562504
image: /assets/images/isaac2025_1.png
doi: 10.59350/1cg8w-qth68
---

In 2022 I had my first experience with the [ISAAC database](https://isaac.nwo.nl/)
by the Dutch [NWO](https://www.nwo.nl/) research funding organization. ISAAC is
where you apply for funding and where grants get tracked. As such, research output
is recorded in this database.

The list of supported research output types in ISAAC is a bit dated, but includes
scientific articles, books and monographs, book chapters, PhD theses, conference
proceedings papers, professional publications, publications aimed at a broad audience,
patents, contracts, and other. With [Recognition & Rewards](https://recognitionrewards.nl/)
in mind, this list should
be more diverse. And clearly missing are software and data, because these are
already supported by global unique identifiers and dedicated efforts for
software citations and data citations. FAIR has progressed a lot for these two
types.

When entering new research output to a project in ISAAC, you get asked to fill
out various HTML forms. For articles, each author is a separate HTML form. All
in all, quite a bit of work. But with unique identifiers and open APIs, it is a
waste of research funding to have to enter this all by hand. Some time earlier
I heard of browser plugins in the USA that automagically filled out those forms,
and realized I wanted that too.

Fortunately, Lars Willighagen had done much of the work already with
[citation.js](https://citation.js.org/) (doi:[10.7717/peerj-cs.214](https://doi.org/10.7717/peerj-cs.214)),
a JavaScript library that can convert formats like BibTeX into formatted references
(with [Citation Style Language](https://citationstyles.org/) and
[citeproc-js](https://citeproc-js.readthedocs.io/)), but also can support various
identifiers to fetch bibliographic metadata. All we needed is to integrate that.
And so the [ISAAC Chrome extension](https://chromewebstore.google.com/detail/ISAAC%20Chrome%20extension/kiljfbiapahlahhilgcgfkfjnkgggode?hl=en-GB&authuser=0)
was born. But the history, technology, and use has not been written up, while we
have a solid base of some 50 users who regularly use it. And one user [wrote](https://chromewebstore.google.com/detail/isaac-chrome-extension/kiljfbiapahlahhilgcgfkfjnkgggode/reviews):

> Werkt geweldig. \[..\] dit de enige manier waarop publicaties redelijk ingevoerd kunnen worden.

Actually, maybe we should rename the extension to *ISAAC Browser Extenaion*,
because it also works in Brave and Edge.

## 2025 updates

The last update had been a while, and we got reports of some changes on the ISAAC
database side, and we could confirm at least one of the HTML form identifiers had
changed, so we fixed filling out the Open Access status of output. This is released
as [version 1.5.0](https://github.com/citation-js/isaac-chrome-extension/releases/tag/v1.5.0)
(doi:[10.5281/zenodo.14562484](https://doi.org/10.5281/zenodo.14562484)).

Another change is that the ISAAC database now supports listing the [ORCID](https://orcid.org/)
identifier of authors, and this metadata is increasingly available from research
output metadata, and [a single line change](https://github.com/citation-js/isaac-chrome-extension/commit/8306809803ef93f448645fc4ca8c55d4c9bb7c6b) was enough for Lars to update the extension
to automatically fill that out too. This is FAIR in action. This version is released
as [version 1.6.0](https://github.com/citation-js/isaac-chrome-extension/releases/tag/v1.6.0)
(doi:[10.5281/zenodo.14562504](https://doi.org/10.5281/zenodo.14562504)) and should
be available from the webstore soon.

## How it works

While the ISAAC database does not have an API, at least we found sufficient hooks
in the HTML to get a reproducible workflow. The foundation of the browser extension
is global unique identifiers, and it supports DOIs, ISBNs, and PubMed identifiers
for research output. For authors, it supports the ORCID. To fetch the metadata,
it uses online resources Crossref, DataCite, and mEDRA, Google Books and OpenLibrary,
PubMed and Unpaywall. The first three to fetch metadata for DOIs, the next two for
ISBN numbers, and PubMed for, well, PubMed identifiers. Based on the retrieved
metadata it determines which type of research output it should fill out the HTML
for.

[Unpaywall](https://unpaywall.org/) is used to see if the output is, for example,
published in a purely open access venue (like a CC-BY-only journal like [eLife](https://elifesciences.org/)
or Nature’s [Scientific Data](https://www.nature.com/sdata/)), or published in a
hybrid journal. The ISAAC database does not have the option to drop a URL (which
could be automated with Unpaywall too), but does allow uploading documents into
their database. This last is left to the user.

## How to use it

Users would install the browser extension and this would add an add-on icon to
the toolbar. The <img src="/assets/images/icon.svg" width="16" alt="Icon: Black serif font 'I' on a background of four colored squares: brown, gold, green and platinum" /> icon shows the various colors of Open Access with an `I`, for
identifier. The user would then login on the ISAAC database, open their project
grant page, and navigate to the Product tab:

![](/assets/images/isaac2025_1.png)

To use the extension, the user would take the following steps.
First, click the “Toevoegen” button, green-blue with white letters in the above
screenshot. This would give a page like this:

![](/assets/images/isaac2025_2.png)

Second, and optionally, click one of the types. The metadata retrieved by the extension
contains sufficient information to make the right guess, so that this step is optional.
If you find that the metadata is wrong and the wrong guess was made, in this step
you can first manually indicate the research output type.

Third, one the page with the above screenshot (or, optionally, after indicating
the output type), click the ISAAC Chrome Extension icon in the browser toolbar
to give a popup dialog:

![](/assets/images/isaac2025_3.png)

Fourth, select the identifier type (DOI, ISBN, or PubMed) and give the identifier
itself, and then click Search. For example, for a DOI, it would look like this: 

![](/assets/images/isaac2025_4.png)

Fifth, the plugin will then guide you through the ISAAC HTML forms, just like you
would do manually, but with the important difference that some forms show in different
order. But rest assured, it will not submit anything before your final approval.
For example, for a journal article I would immediate fo to the HTML form for the
first author, which, for a random article, could look like this:

![](/assets/images/isaac2025_5.png)

By clicking "Verder", the browser extension allows you to add missing metadata
(for example, the ORCID is not listed for this author in the CrossRef metadata
and the gender is not shared by the publisher), and sometimes you may find yourself
needing to correct metadata.

Sixth, after going through all author pages, you will return to the main product
form, which will look something like this (for a random paper):

![](/assets/images/isaac2025_6.png)

Here you can add the final missing information and upload additional files, like
a PDF of the article. In the above screenshot we find some required (red asterix)
missing. In this case, the DOI referred to an article published as “as soon as
publishable” and the page numbers and issue is simply not known yet. You can also
see the Unpaywall metadat in action here.

Seven, like before, the final submission of this new output is done manually.
The ISAAC Chrome Extension requires that manual step; on purpose: you are in control.
