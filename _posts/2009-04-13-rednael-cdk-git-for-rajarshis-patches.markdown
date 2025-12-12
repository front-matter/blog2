---
layout: post
title:  "Rednael, CDK Git for Rajarshi's patches, PubChem SDF"
date:   2009-04-13
blogger-link: https://chem-bla-ics.blogspot.com/2009/04/rednael-cdk-git-for-rajarshis-patches.html
doi: 10.59350/rde9j-mn382
tags: cdk git pubchem
---

Short blog item about some [CDK Git](http://cdk.git.sourceforge.net/) updates. Could not get sleep, so might as well spend that time on
[CDK](http://cdk.sf.net/) hacking, not? Reason why I actually could not catch sleep was the news that [PubChem](http://pubchem.ncbi.nlm.nih.gov/)
SD files are not regular MDL SD files, but use custom extensions, for example, for dative bonds (see
[this PDF](ftp://ftp.ncbi.nlm.nih.gov/pubchem/specifications/pubchem_sdtags.pdf)). This *surely* explains the weird things I have seen,
but, unfortunately, the big SDF button on PubChem does not warn about that. Anyway, thanx for Wolfgang for informing about that
customization!

So, instead I hacked a bit on the CDK, which was about time. Last two weeks have been really busy with finding a new house (which we did),
and writing two big grant applications (about done). Finally time for cleaning up my TOREPLY list on Gmail. I picked the request of
[Rajarshi](http://blog.rguha.net/) to put online some of his patches, which are now available from
[pele.farmbio.uu.se/git/rajarshi.git](http://pele.farmbio.uu.se/git/rajarshi.git/), where you will
[find four of his patches ready for review](https://sourceforge.net/tracker/?func=browse&group_id=20024&atid=320024):
*fp2d*, *pcore*, *pubchemfp* and *cleanpt*. These are **really** interesting patches!

That brings me to the last thing for today: [Rednael](http://github.com/egonw/rednael/tree/master).
[Leander](http://en.wikipedia.org/wiki/Zarah_Leander) (a nickname already reserved, so reverse used) is an
[IRC](http://en.wikipedia.org/wiki/Internet_Relay_Chat) bot for the #cdk channel which reports us of commits to our main Git repository.
Back in the old SVN days (time goes so fast :), we had the [CIA](http://cia.vc/) (Langley?) use there equipment to monitor SVN commit,
and [report those online](http://cia.vc/stats/project/cdk) and on IRC, but Git is too advanced for them, apparently. So, I wrote
my own little bot to do it (see earlier link to GitHub). It can monitor multiple channels and report about multiple RSS feeds per
channel. Thus, it is actually not restricted to Git commits alone.
