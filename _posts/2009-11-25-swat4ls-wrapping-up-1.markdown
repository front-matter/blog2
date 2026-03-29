---
layout: post
title:  "SWAT4LS: wrapping up #1"
date:   2009-11-25
blogger-link: https://chem-bla-ics.blogspot.com/2009/11/swat4ls-wrapping-up-1.html
doi: 10.59350/78fbd-y6h76
tags: swat4ls blue-obelisk jmol sparql
---

It's already been five days since the [SWAT4LS](http://www.swat4ls.org/2009/index.php) meeting ([matching blog](http://swat4ls.blogspot.com/)),
and finally got around to writing up my personal summary. I very much enjoyed the [Blue Obelisk dinner](http://blueobelisk.stackexchange.com/questions/16/who-will-go-to-swat4ls-and-wants-to-join-a-blue-obelisk-dinner)
on Thursday evening with [Nico](http://semanticscience.wordpress.com/), [Duncan](http://duncan.hull.name/), and
[Miguel](http://blog.chemdom.com/) (the [CDK](http://cdk.sf.net/) one).

The SWAT4LS was fun, interesting, perhaps to short, but very much appreciated! Thanx to all organizers! During the day various people tweeted the
meeting, using the [#swat4ls2009](http://search.twitter.com/search?q=%23swat4ls2009) hashtag (forwarded to [a FriendFeed room](http://friendfeed.com/swat4ls2009)),
while Nico covered things in various blog posts which I'll link to below where appropriate. Summaries I have seen so far are from
[Nico](http://semanticscience.wordpress.com/2009/11/24/semantic-web-tools-and-applications-for-life-sciences-2009-a-personal-summary/)
and [Duncan](http://duncan.hull.name/2009/11/24/swat4ls/) (again :), and [the organizers](http://swat4ls.blogspot.com/2009/11/swat4ls-aftermath.html).

The day kicked off with a presentation by Alan Ruttenberg ([Nico's coverage](http://semanticscience.wordpress.com/2009/11/20/swat4ls2009-keynote-alan-ruttenberg-semantic-web-technology-to-support-studying-the-relation-of-hla-structure-variation-to-disease/)).
It nicely demonstrated where the semantic web for life sciences is going too. Particularly interesting was the integration of SPARQL with Jmol in
[ImmPort/JmolViz](http://http//neurocommons.org/page/ImmPort/JmolViz): it uses Jmol to visualize a PDB entry, while using SPARQL to retrieve atomic
and residue annotation, using Jmol script (we have to thank another Miguel (the [Jmol](http://www.jmol.org/) one) for taking the scripting
and visualization capabilities [to the next level in 2002](http://sourceforge.net/mailarchive/forum.php?thread_name=64707.217.127.90.82.1035878883.squirrel@www.howards.org&forum_name=jmol-developers)).
It always makes me proud to see one of the projects I have worked on to hit a prominent place in keynote talks at conferences :)

Alan also clarified that [CC0](http://creativecommons.org/choose/zero) is not a license, but a statement about the *public domain* nature
of data; there is nothing to accept, nothing to live up to. The important is, and I am sure most of my readers are well aware of that, is
that it formalized the public domain concept by wrapping it in a full CC0 statement. My recommendation to all who want to make (chemical data)
available as *public domain*, use the CC0; just because the CC0 works in any country, and it will make a lot of your users very happy.
**If you cannot claim CC0 because you are not really owner (as I have seen done), do not claim the data to be public domain either
then (which was done)!**

There was also note of the [Amino Acid Ontology](http://www.co-ode.org/ontologies/amino-acid/2009/02/16/), which comes closer to our groups
proteochemometrics work, but I have yet to look if this can be used for or linked protein descriptors. Also interesting is the idea behind
[RDFHerd](http://neurocommons.org/page/RDF_installer), a project aiming to distribute RDF data sets as installable packages. If I understood
correctly, only [Virtuoso](http://virtuoso.openlinksw.com/dataspace/dav/wiki/Main/) is yet supported, but this thing can fly, particularly,
if these packages are easily converted into [Debian packages](http://www.debian.org/doc/FAQ/ch-pkg_basics.en.html).

More wrapping up will follow, but got other business to do first now.
