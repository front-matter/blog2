---
layout: post
title:  "CDK 1.2 Release Candidate"
date:   2009-02-10
modified_date: 2025-10-20
blogger-link: https://chem-bla-ics.blogspot.com/2009/02/cdk-12-release-candidate.html
doi: 10.59350/9k5sa-fgb67
tags: cdk java sourceforge
---

I released [CDK](http://cdk.sf.net/) 1.1.5 today. Below is the email I sent to the
[cdk-user mailing list](http://sourceforge.net/mailarchive/forum.php?forum_name=cdk-user):

> Hi all,
>
> I am happy to be able to announce the first Release Candidate for CDK 1.2.
>
> Everyone using using CDK 1.0 is suggest to upgrade to this release,
> which has fewer bugs, is much better tested, and is faster too. It
> also comes with API changes, and a full changelog is not available
> (yet). However, the CDK developers are available on this mailing list
> and on IRC to help you port CDK 1.0 applications to CDK 1.2. Two
> differences in particular I would like to point out at this moment:
>
> #### 1. explicit atom typing
>
> CDK 1.0 did atom typing at various places to perform its function,
> leading to inconsistencies and bugs. CDK 1.2 introduces a new atom
> typing module which isolates atom typing from other algorithms.
> Consequently, the CDK will be more critical on your code and your
> data: where the old code might have silently eaten incorrect input,
> the new implementation complains: expect exceptions! The actual atom
> type list used in CDK 1.2 is more complete than the ones used in CDK
> 1.0; however, it is not unlikely that you will find no atom type
> perceived for a clearly valid atom type. Please report such cases.
>
> And I really want to stress this: in every instance where CDK 1.2, CDK
> 1.0 would have failed too, though it might have not complained about
> it.
>
> #### 2. no rendering functionality
>
> The new rendered under development (see the [cdk-jchempaint mailing
> list](http://sourceforge.net/mailarchive/forum.php?forum_name=cdk-jchempaint))
> has not made the CDK 1.2.0 release. However, it is expected to
> be available in a later CDK 1.2.x release. If you really need the
> graphics functionality, please contact me. Bioclipse2 is an example
> project which combines CDK 1.2 with the new rendering code.
>
> ## Contributions
>
> This release features contributions from a larger developer group than
> ever before. In particular, I would like to welcome those who have
> picked up JuniorJobs, and provided other smaller patches! A full list
> of authors is available from:
>
>  [http://cdk.svn.sourceforge.net/viewvc/cdk/cdk/tags/cdk-1.1.5/AUTHORS](http://cdk.svn.sourceforge.net/viewvc/cdk/cdk/tags/cdk-1.1.5/AUTHORS)
>
> (If you see your name missing (sorry!), please just email me)
>
> If you like to contribute too, there are many ways. The JuniorJobs is
> just an example and are available from:
>
>  [http://sourceforge.net/tracker/?group_id=20024&atid=997721](http://sourceforge.net/tracker/?group_id=20024&atid=997721)
>
> ## Download
>
> CDK 1.2 RC1 is available from SourceForge as CDK 1.1.5:
>
>  [http://sourceforge.net/project/showfiles.php?group_id=20024&package_id=57806](http://sourceforge.net/project/showfiles.php?group_id=20024&package_id=57806)
>
> Alternatively, you can download the release from SVN:
>
>  [http://cdk.svn.sourceforge.net/viewvc/cdk/cdk/tags/cdk-1.1.5/](http://cdk.svn.sourceforge.net/viewvc/cdk/cdk/tags/cdk-1.1.5/)
>
> ## Bugs
>
> As said, this CDK release is the most tested CDK release ever, with
> more than 10 thousand unit tests! However, there are open (minor)
> issues, which you can see reported at Nightly:
>
>  [http://pele.farmbio.uu.se/nightly-1.2.x/](http://pele.farmbio.uu.se/nightly-1.2.x/)
>
> The number of failing unit tests is below 1%, and in the same range as
> the number of failing tests for CDK 1.0. Importantly, these are
> typically fails of unit tests which are not available in the CDK 1.0
> unit test suite; that is, many of the failing unit tests in CDK 1.0
> are *not* failing in CDK 1.2 (it really is rewarding to upgrade!)
>
> However, if you find additional bugs (or just have wishlists), you can
> report these with our SourceForge bug tracker at:
>
>  [http://sourceforge.net/tracker/?group_id=20024&atid=120024](http://sourceforge.net/tracker/?group_id=20024&atid=120024)
>
> ## Documentation
>
> Over the next weeks I hope to compose a somewhat useful list of
> changes. I have not made up my mind yet how that will take shape,
> maybe as a list of blogs, which I'll aggregate later. Dunno yet.
> Suggestions and contributions welcome :)
>
> JavaDoc for the release is not yet available on SF for download
> (working on that), but available for the cdk1.2.x / branch at:
>
>  [http://pele.farmbio.uu.se/nightly-1.2.x/api/](http://pele.farmbio.uu.se/nightly-1.2.x/api/)
>
> OK, that wraps it up for now. Just reply if you have questions.
>
> Egon
