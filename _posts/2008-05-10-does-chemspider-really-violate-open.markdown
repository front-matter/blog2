---
layout: post
title:  "Does ChemSpider really violate Open Data with CC SA?"
date:   2008-05-10
blogger-link: https://chem-bla-ics.blogspot.com/2008/05/does-chemspider-really-violate-open.html
doi: 10.59350/zebnk-k6z97
tags: chemspider copyright nmrshiftdb
---

[ChemSpider](http://www.chemspider.com/) [is afraid](http://www.chemspider.com/blog/it-appears-chemspider-does-bad-by-using-creative-commons-licenses.html)
they are doing something bad because they release their data as [CC-BY-SA](http://creativecommons.org/licenses/by-sa/3.0/).
Because, John Wilbanks says in Peter's blog:

> I would add to it that I'd like to see a meaningful discussion of the
> risks of Share Alike and Attribution on **data integration**. Chemspider's
> move to CC-BY-SA fits into this discussion nicely - it's a total
> violation of the open data protocol we laid out at SC, which says "Don't
> Use CC Licenses on Data" - **but it does conform inside the broader OKD.**

Now, let's take this into pieces.

1. John notes that ChemSpider is in compliance with the [OKD](http://www.opendefinition.org/1.0/). This means, that ChemSpider thinks
   about Open Data just like the [Open Knowledge Foundation](http://en.wikipedia.org/wiki/Open_Knowledge_Foundation) does. I've scanned
   through the OKD, and it indeed seems to support the BY and SA clauses of the CC. So, Chemspider did not do a bad thing.
2. Data integration is tricky: you have to keep track of license information on an entry-by-entry level. For each fact, you keep to track the
   source, and associate the source with it's original license. For example, the [NMRShiftDB](http://www.nmrshiftdb.org/)
   information in ChemSpider should be [GNU FDL](http://www.gnu.org/copyleft/fdl.html).
3. OpenX licenses may be viral. This holds for the [GNU GPL](http://www.gnu.org/licenses/gpl.html) as well as for the CC-BY-SA.
   Nothing new there. It just requires that when you would like to incorporate the ChemSpider data into a larger database, that database
   has to be CC-BY-SA too, or likely at least CC-SA.

Summarizing, I think ChemSpider did a good thing, and that ChemSpider does **not** violate the OpenData idea, but instead, that the CC-BY-SA and
the OKD violates John's requirements for integrating data resources (apparently based on a two year legal study). That has nothing to do with ChemSpider.

Now, people will always have different opinions on Openness. The original BSD clause had a
[restrictive 'advertisement' clause](http://en.wikipedia.org/wiki/BSD_License#UC_Berkeley_advertising_clause), not Open enough for at least the
[Debian Free Software Guidelines](http://www.debian.org/social_contract#guidelines) (DFSG), while still open source. The clause was
later removed from the BSD license.

Another [Debian](http://www.debian.org/) example is Firebox, which is named [IceWeasel](http://packages.debian.org/iceweasel) in Debian,
because the 'license' on the Firefox name is not open enough.

Another problem with the definition of Openness, is the viral aspect of some licenses (see earlier). For some, the GPL is not open enough,
because it does not give people the freedom to license their software they like themselves, something the BSD and MIT licenses do allow.
There is ongoing debate (and that should be ongoing) on how much *freedom* a license must provide to be called Open. The whole OpenAccess
discussion is similar (see e.g. [Peter's story on this](http://www.google.com/search?q=strong+weak+open+access+site%3Awwmm.ch.cam.ac.uk&btnG=Search)),
where the discussion on the minimal amount of freedom is even worse.

Should we worry about ChemSpider being 'only' CC-BY-SA? Maybe. Data is not software, but I disagree that viral license would be OK for software, but NOT for data. That's just BSD-versus-GPL all over again. I am happy about OpenBabel being GPL, and I am happy about ChemSpider being CC-BY-SA too.

All that said, these discussion are important. And creating good definitions of what freedoms are required, are crucial in deciding whether something is Open. The Blue Obelisk does not have/use such definitions yet, and we should start discussing this, and define a Blue Obelisk ODOSOS Guidelines. Please no funny jokes about how we can boogy then :)

Now, looking forward to hearing what you think about these issues... Looking forward to the other blog items!
