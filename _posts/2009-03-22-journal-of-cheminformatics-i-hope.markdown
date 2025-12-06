---
layout: post
title:  "Journal of Cheminformatics: I hope the Instructions to the Authors improve"
date:   2009-03-22
blogger-link: https://chem-bla-ics.blogspot.com/2009/03/journal-of-cheminformatics-i-hope.html
doi: 10.59350/kzzbq-02828
tags: cb cheminf cml userscript publishing rdf jcheminf justdoi:10.1186/1758-2946-1-2 justdoi:10.1186/1758-2946-1-3
  doi:10.1186/1471-2105-8-487
image: /blog/assets/images/cbStillWorks.png
---

Besides [Nature Chemistry](http://chem-bla-ics.blogspot.com/2009/03/nature-chemistry-improves-publishing.html), another journal was launched last week (see
[here](http://www.steinbeck-molecular.de/steinblog/index.php/2009/03/17/open-access-journal-of-cheminformatics-now-live/) and
[here](http://blogs.openaccesscentral.com/blogs/ccblog/entry/journal_of_cheminformatics_publishes_launch)): the
[Journal of Cheminformatics](http://www.jcheminf.com/). First of all, congratulations to [Chris](http://www.steinbeck-molecular.de/steinblog/)
and David for their efforts! While the journal only published one research paper yet, it already found
[its place](http://cb.openmolecules.net/journal_search.php?journal_id=Journal%20of%20Cheminformatics) on
[Chemical blogspace](http://cb.openmolecules.net/). I have two things I want to blog about: *data rich publishing*, and
*starting the scientific communication*.

## Data Rich Publishing

Peter had a [detailed blog](http://wwmm.ch.cam.ac.uk/blogs/murrayrust/?p=1326) about why he joined the editorial board:

> I take this position with some trepidation as I have grave reservations about the current practice of cheminformatics.
> It suffers from closed data, closed source and closed standards, and thereby generally poor experimental design, poor
> metrics and almost always irreproducible results and conclusions which are based on subjective opinions.

I strongly agree with this observation, and have discussed my view on this in
[my thesis](http://chem-bla-ics.blogspot.com/2008/03/todo-april-2nd-defend-my-phd-work.html) (send me an email if you
want a copy).

So, what has the journal to say about this (see [Instructions to the Author](http://www.jcheminf.com/info/instructions/),
emphasis mine):

> Journal of Cheminformatics recommends, **but does not require**, that the source code of the software should be made
> available under a suitable open-source license that will entitle other researchers to further develop and extend
> the software if they wish to do so.

Regarding data, they even less revolutionary; recommended figures formats (EPS, PDF, PNG) focus on nice graphics instead
of reuse of data. I also note that I cannot upload data in the [Open Document Format](http://en.wikipedia.org/wiki/OpenDocument),
or, hey, let's really push things, in [RDF](http://en.wikipedia.org/wiki/Resource_Description_Framework). Well, not according to
the Instructions. And surely, I can put the [O|R]DF in the supplementary information, anyway. It would also be nice if I could
use Jmol as an applet to enrich the graphics, and improve data reusability of the paper, like the
[RSC recently started to allow](http://chem-bla-ics.blogspot.com/2009/01/rsc-now-allows-jmol-in-main-text-of.html).

Regarding the supplementary information, there is a section on *additional files*, which, unconveniently are capped at
20MB size. No mention of chemical formats at all, neither any recommendation on semantic formats like
[CML](http://en.wikipedia.org/wiki/Chemical_Markup_Language) (I wonder when this was discussed with the Editorial Board,
and where Peter was at the time). How am I going to put online my 500 molecular structure CML file now? (Though it's good
to know it is virus scanned ;)

So, why do I vent my concerns about these limitations? I had not blogged about the launch of the journal earlier, because
I have not made up my mind about it. On one side, I am happy to see a journal that promotes (scientific) use of papers,
and a journal that allows me to keep copyright on the material. However, on the other side, what the current Instructions
suggest, the data I could use from the papers is available only in an old-fashion way. That's a lost opportunity and could
have killed competition for sure. Instead, the unique selling point is now restricted to using an
[open access license](http://www.biomedcentral.com/info/about/openaccess/). Nature Chemistry, on the other hand, chose
data rich publishing as a selling point (though in competition with things done at the RSC).

The other thing I want to mention about the journal is the following. [Rajarshi](http://blog.rguha.net/) blogged about
[Bachrach](http://hackberry.chem.trinity.edu/blog/)'s paper on *Chemistry publication - making the revolution*
(DOI:[10.1186/1758-2946-1-2](https://doi.org/10.1186/1758-2946-1-2)). Firstly, by adding a link like that for the
DOI I just gave, Chemical blogspace can pick it up; we need this later. Secondly, the paper actually suggests that
*"[b]y publishing lots of data, available for ready re-use by all scientists, we can radically change the way science
is communicated and ultimately performed"*; this is in strong contrast to what I have seen in the Instructions so far.

## Starting the Scientific Communication
[Rich](http://depth-first.com/) [replied](http://blog.rguha.net/?p=216#comment-342) to Rajarshi about the requirement
to log in before someone could make a comment, which he did not like. He suggested alternative ways to prevent SPAM
and sorts. The choice for this commenting approach may also originate from having an Open discussion, where everyone
takes responsibility for what he says. The use of OpenID, as Rich suggests would only partially address that; on the
other hand, setting up a fake email address is quite common in the blogosphere too.

If Rajarshi would have used the DOI to link to the Steven's paper, as said, Chemical blogspace would have recognized
it. Instead, he chose to link directly to the PDF. This is a typical case of hamburgers in action. However, others
did when they discussed the first research paper in the journal (DOI:[10.1186/1758-2946-1-3](https://doi.org/10.1186/1758-2946-1-3)).
These blogs were picked up by Cb and are listed on [this page](http://cb.openmolecules.net/paper.php?paper_id=1666).

Now, I only need to remind you of *Userscripts for the Life Sciences* (DOI:[10.1186/1471-2105-8-487](https://doi.org/10.1186/1471-2105-8-487))
that we have the methods to link these comments back to the journal website. The *Quotes from Chemical Blogspace and Postgenomic*
script in particular, does the hard work (needs GreaseMonkey, the script can be downloaded here; see also
[Noel's original post](http://baoilleach.blogspot.com/2007/04/add-quotes-from-postgenomic-and.html)). This way,
we can read the comments when we visit the [papers homepage](http://www.jcheminf.com/content/1/1/3):

![](/blog/assets/images/cbStillWorks.png)

Now, the script has not yet been updated for the new journal (Noel, can you please upload the revision?), so you need
to edit the source right now and add `http://*.jcheminf.com/*` to the list of website the script acts on:

![](/blog/assets/images/cbStillWorks1.png)

