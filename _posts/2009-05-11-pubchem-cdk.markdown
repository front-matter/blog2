---
layout: post
title:  "PubChem-CDK"
date:   2009-05-11
blogger-link: https://chem-bla-ics.blogspot.com/2009/05/pubchem-cdk.html
doi: 10.59350/8bpsk-rb857
tags: cdk pubchem inchikey:QBHDGWNWWIEZOM-UHFFFAOYSA-N
image: /blog/assets/images/CID3612285.png
---

[PubChem-CDK](http://pele.farmbio.uu.se/pubchem/) is a project that runs [CDK](http://cdk.sf.net/) code on the [PubChem](http://pubchem.ncbi.nlm.nih.gov/) data.
As we speak, a groovy script reads about 100 PubChem Compounds XML entries per second into the database. Mind you, not the SDF they distribute which uses a
custom extension to overcome the limits of the real MDL SDF format.

Right now, it has run the atom type perception algorithm on about 1M compounds, and has a pretty good coverage of the *organic chemistry* domain. I will
analyze the [results](http://pele.farmbio.uu.se/pubchem/atomtyping/) statistically soon, but will likely use this data first to add some missing atom types
to CDK 1.2.x. BTW, did you know only ***three*** [carbon atoms failed](http://pele.farmbio.uu.se/pubchem/atomtyping/?element=C)?
A C<sup>4-</sup> (CID:[156031](http://pele.farmbio.uu.se/pubchem/?cid=156031)), a C<sup>3+</sup> (CID:[161072](http://pele.farmbio.uu.se/pubchem/?cid=161072)),
and a C<sup>2+</sup> (CID:[161073](http://pele.farmbio.uu.se/pubchem/?cid=161073)). Would your cheminformatics library know what their properties are?

It is really nice way of browsing PubChem, BTW. For example, did you know there are several boron compounds which have a substructure [N+]-[B+]-[N+]? Yes,
three positive charges, *next* to each other? For example (CID:[3612285](http://pele.farmbio.uu.se/pubchem/?cid=3612285)):

![](/blog/assets/images/CID3612285.png)

Well, neither did I. How was it synthesised? What are the spectral properties? How do they stabilise it? What magic counter ion? PubChem, unfortunately,
does not have links to primary literature, and there is no free source for that available. A failure in chemistry. The source points to
[ChemDB](http://cdb.ics.uci.edu/index.htm), but the [entry in that database](http://cdb.ics.uci.edu/cgibin/ChemicalDetailWeb.psp?chemical_id=5257702) does
not shed light on this either.

Anyway, more on this later. Much more, as I plan to run many CDK algorithms on this code.
