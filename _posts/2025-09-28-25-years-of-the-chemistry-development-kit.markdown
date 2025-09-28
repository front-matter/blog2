---
layout: post
title:  "25 years of the Chemistry Development Kit"
date:   2025-09-28
doi: 10.59350/4ce2c-fxh02
tags: cdk jchempaint jmol openscience chemistry
grants:
  - grant:
    title: "The Chemistry Development Kit in 2024: improving cheminformatics research"
    acronym: "CDK2024"
    id: drc.filenumber:osf232097
    funder:
      name: "Dutch Research Council"
      ror: 04jsz6e67
#comments:
#  host: social.edu.nl
#  username: egonw
#  id: ...
---

Twenty five years ago the [Chemistry Development Kit](https://cdk.github.io/) (CDK) was founded. The Chemistry and Internet ([ChemInt2000](https://www.google.com/search?q=ChemInt2000))
had just ended (it ran from 23 to 26 September) and my friend and I had taken the Amtrak night train from Washington to South Bend. At that time there
were two leading Java applets for chemistry, [JChemPaint](https://jchempaint.github.io/) and [Jmol](http://jmol.org/). I had hacked Chemical Markup
Language support into both of them, and [Dan Gezelter](https://chemistry.nd.edu/people/dan-gezelter/) (Jmol and [openscience.org](https://openscience.org/)),
[Christoph Steinbeck](http://www.steinbeck-molecular.de/steinblog/) (JChemPaint), and me took the opportunity of being in North America
to discuss if we could use a common code base. Chris' *compchem* had done something similar. Peter Murray-Rust, who had also attended ChemInt2000
like me and Chris did not attend.

I do not remember exactly, but I guess we must have met on the 28th and 29th? Maybe already on Wednesday. During this meeting we discussed a common
data model (yes, Jmol used the CDK data model at some point) and somewhere during the meeting we wrote down a name for the project. There was the
Java Development Kit, so this could be the Chemistry Development Kit. The name stuck.

A quick post like this cannot do credit to the history of the CDK, nor of everyone involved in the past or still is. You can browse some of the history
of the CDK in [my blog](https://chem-bla-ics.linkedchemistry.info/tag/cdk) and in [Chris' blog](http://www.steinbeck-molecular.de/steinblog/index.php/category/chemistry-development-kit/).
It has been an amazing journey and with a small grant just behind us (with  Alyanne de Haan, René van der Ploeg, and Marc Teunis from Hogeschool Utrecht),
and all the awesome things ongoing (new JChemPaint, various extensions, upgraded downstream tools), the CDK is alive and kicking.

A huge congrats and thanks to everyone (and every company and organization) who contributed code to the CDK with this huge milestone. There are a few people
that I want to particularly thank (see the AUTHORS file for all names): Chris, who in the late nineties made a difference with open source in chemistry,
Dan, for Jmol and hosting this memorable meeting at Notre Dame University, Rajarshi Guha, who operated *CDK Nightly* for many years, well before Travis
and Google Actions, Stefan, Miguel, Gilleain, and Christian, for many years of contributions to the CDK, and John Mayfield, the current
CDK release manager.
