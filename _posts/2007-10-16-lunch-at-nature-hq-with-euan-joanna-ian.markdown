---
layout: post
title:  "Lunch at Nature HQ (with Euan, Joanna, Ian and Ålf)"
date:   2007-10-16 00:10
modified_date: 2025-03-30
blogger-link: https://chem-bla-ics.blogspot.com/2007/10/lunch-at-nature-hq-with-euan-joanna-ian.html
doi: 10.59350/j6dh2-02n14
tags: connotea chemistry inchi doi nmrshiftdb
image: /assets/images/doiTagDelicious.png
---

On my way back from the [Taverna workshop](http://chem-bla-ics.blogspot.com/search/label/Taverna0710) I visited Nature HQ, as
[Ian reported about on Nascent](http://blogs.nature.com/wp/nascent/2007/10/lunch_with_egon_willighagen.html). It was a (too) short
meeting, but very nice to meet [Euan](http://network.nature.com/blogs/user/euan) (finally; he wrote the
[postgenomic.com](http://postgenomic.com/) software which I use for [Chemical blogspace](http://cb.openmolecules.net/)),
[Joanna](http://network.nature.com/blogs/user/joannascott) (whom I met in Chicago already, where she had
[two <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/03/26/acs-chicago-day-1.html)
[presentations <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/03/29/acs-chicago-day-3.html),
and is responsible for [Second Nature](http://blogs.nature.com/wp/nascent/2007/08/events_on_second_nature.html)),
[Ian](http://network.nature.com/blogs/user/U3DF456C6) (who works on [Connotea](http://connotea.org/),
and [commented](http://network.nature.com/blogs/user/U3DF456C6/2007/10/08/molecule-tagging-with-connotea) on
[my tagging molecule blog <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/09/19/tagging-molecules-mashup-of-connotea.html))
and [Ålf](http://network.nature.com/profile/alf) (who works on [Scintilla](http://scintilla.nature.com/)) and
briefly [Timo](http://network.nature.com/profile/timo) (who rules them all). BTW, I had a simple but delicious pasta.

First, let me note that if I would have to name a favorite molecule, and it was [acetic acid](http://en.wikipedia.org/wiki/Acetic_acid),
not [ascorbic acid](http://en.wikipedia.org/wiki/Ascorbic_acid). Reason why it would be my favorite is acetic acid was the first
organic molecule I put in the [Woordenboek Organische Chemie](http://www.woc.science.ru.nl/) in 1995.

We discussed a number of things, regarding the things we do. One of these was tagging molecules. Ian used
*http://rdf.openmolecules.net/?info:inchi/InChI=1/CH4/h1H4* instead of *http://rdf.openmolecules.net/?InChI=1/CH4/h1H4*.
The first was not yet picked up by [rdf.openmolecules.net](http://rdf.openmolecules.net/) but I fixed that.

We also discussed linking molecular structures with scientific literature. The discussions in blogspace of this week
show that doing that by using computer programs is not appreciated by publishers (see
[here](http://www.chemspider.com/blog/?p=204),
[here <i class="fa-solid fa-recycle fa-xs"></i>](https://blogs.ch.cam.ac.uk/pmr/2007/10/13/outrage-repurposing-open-access-material-is-allowed-without-explicit-permission/),
[here <i class="fa-solid fa-recycle fa-xs"></i>](https://blogs.ch.cam.ac.uk/pmr/2007/10/16/why-green-open-access-does-not-support-text-and-data-mining/),
[here <i class="fa-solid fa-recycle fa-xs"></i>](https://blogs.ch.cam.ac.uk/pmr/2007/10/15/indexing-open-access-and-free-access-articles/),
[here](http://www.chemspider.com/open-chemistry-web/?p=4), and
[here <i class="fa-solid fa-recycle fa-xs"></i>](https://blogs.ch.cam.ac.uk/pmr/2007/10/14/opsinoscar-you-us-we-please-help/))
(The publishers seem to prefer to like to send of a PDF to India or China.)

I proposed that the InChI would be part of the publication, for all molecules mentioned in the article. If a
journal can require exact bibliography and experimental section formats, they can certainly require InChIs too.
There are few programs left which cannot autogenerate an InChI, and the chemists draws the structures anyway.
However, the software used in the editorial process does not support linking InChIs with a PDF (if that software
would have been opensource ...).

So, the best current option seems to be social tagging mechanisms, and this is what we talked about. Just use
Connotea (or any other service) and tag your molecule with a DOI:

![](/assets/images/doiTagDelicious.png)

and

![](/assets/images/connoteaTagDelicious1.png)

This tagging is done manually. No machines involved in that. Nothing the publishers can do about this. No ChemRefer needed.
But this will allow us to start building a database with links between papers and molecules, which we badly need. BTW, we will
not have to start from scratch. The [NMRShiftDB](http://www.nmrshiftdb.org/) already contains many links, which is open data!

Now, you might notice the informal semantics of the `doi:` prefix. That's something I hereby propose, as it allow
services to pick up the content more easily. You might also note the *incorrect* DOI in Connotea. The reason for
that is that Connotea does not yet support a '/' in a tag. I
[reported that problem](http://sourceforge.net/tracker/index.php?func=detail&aid=1814491&group_id=133040&atid=726030).
