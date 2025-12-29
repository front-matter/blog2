---
layout: post
title:  "Microformats in chemistry..."
date:   2007-05-11 00:00
modified_date: 2025-12-29
doi: 10.59350/rt0kd-kdw56
blogger-link: https://chem-bla-ics.blogspot.com/2007/05/microformats-in-chemistry.html
tags: rdf microformat chemistry
---

[Peter](http://wwmm.ch.cam.ac.uk/blogs/murrayrust/) blogged some days ago about [microformats and how they could be used in chemistry <i class="fa-solid fa-recycle fa-xs"></i>](https://blogs.ch.cam.ac.uk/pmr/2007/05/08/microformats-in-the-chemical-blogosphere-the-chemical-sematic-web-has-arrived/).
Being late and a bit absent minded, I added a short comment that [Chemical blogspace](http://wiki.cubic.uni-koeln.de/cb/)
[supports](http://chemicalblogspace.blogspot.com/2006/12/hacking-inchi-support-into-cb.html)
[microformats for chemistry <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2006/12/10/including-smiles-cml-and-inchi-in.html), and that
[chemistry is harvested from that](http://chemicalblogspace.blogspot.com/2007/02/latest-blogged-molecules-on-front-page.html),
and actually [semantically distributed again using CMLRSS](http://chemicalblogspace.blogspot.com/2007/01/cb-gets-cmlrss-feed.html).

In reply to my comment, he wrote [a follow up <i class="fa-solid fa-recycle fa-xs"></i>](https://blogs.ch.cam.ac.uk/pmr/2007/05/09/chemical-microformats-have-arrived-some-time-ago/) highlighting one of blog items linked
above (thanx for that!). Accidentally, he also published my Gmail account and IP address, which was really just for the blog owner to
see who did the comment, and not for the world to harvest. This is a moment I am not so happy that Peter's blog is so popular ;) Peter,
maybe be a bit more careful with copy/pasting next time.

Peter and Henry (still not in blogspace?) have been [doing things along these lines for years now](http://wwmm.ch.cam.ac.uk/blogs/murrayrust/?p=301),
often in different contexts. But getting these things going is a bit trickier. Actually, the take up of the chemical microformats
has been limited, and at least one alternative mechanism is being used: put the InChI in the `@alt` attribute on the `<img>` element.
Other alternatives are possible too, such as recognizing molecules (or whatever else) based on a link to wikipedia; linking to
entries in [wikipedia](http://www.wikipedia.org/) is popular in Chemical blogspace.

One problem in getting microformats accepted, especially among chemists, is to have tools available. Tools meaning dedicated plugins
for blogging software to easy adding microformats to a blog item. You'd be suprised how uncommon raw HTML editing has become in the
last 10 years. [::: Structured Blogging :::](http://structuredblogging.org/) is a provider of such tools. On the using site,
there is [this nice Firefox plugin](https://addons.mozilla.org/en-US/firefox/addon/4106), that can extract information available in
microformats, though Firefox3 is supposed to support some microformats natively.

Just today, [Peter also blogged about a Berner-Lee's presentation](http://wwmm.ch.cam.ac.uk/blogs/murrayrust/?p=309) with the nice
circular phenomena in all these web technologies. The diagrams nicely visualize the complex social aspects of these new technologies.
(I'm sure the apply to chemoinformatics too... who makes a chemoinfo variant?) RDF is the way to go; it's the machine interpretable
(well, more accurate) *microformat*. All sorts of information is getting available as RDF. For example, check out
[bibtex2rdf](http://www.l3s.de/~siberski/bibtex2rdf/), [Wikipedia as RDF](http://dbpedia.org/docs/#intro),
[uniprotRDF](http://dev.isb-sib.ch/projects/uniprot-rdf/), and [BioGUID](http://bioguid.info/). Moreover,
[GRDDL](http://www.w3.org/TR/2007/CR-grddl-20070502/) might mave this even more common.
I have been maintaining a [bookmark list of RDF things happening](http://del.icio.us/egonw/rdf), check it out,
the list is *social* ***and*** *using microformats*.
