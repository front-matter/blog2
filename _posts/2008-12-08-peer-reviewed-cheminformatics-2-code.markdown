---
layout: post
title:  "Peer reviewed Cheminformatics #2: Code review for the Chemistry Development Kit"
date:   2008-12-08
blogger-link: https://chem-bla-ics.blogspot.com/2008/12/peer-reviewed-cheminformatics-2-code.html
doi: 10.59350/dm9c0-tzs46
tags: cdk openscience
image: /blog/assets/images/cdkPatching.png
---

Peer review is an important component of open source development, and recently there was the discussion the other way around, if open source is
required for peer review. Depends on your definition of peer review: No, if you restrict peer review to what it is in publishing (see
[Re: Open Source != peer review](http://chem-bla-ics.blogspot.com/2008/11/re-open-source-peer-review.html)); Yes, if we really want to speed up
cheminformatics evolution and assume unrestricted, open peer review where reviewers can openly publish there review report with all the greasy
details (see [Peer reviewed Chemoinformatics: Why OpenSource Chemoinformatics should be the default](http://chem-bla-ics.blogspot.com/2008/07/peer-reviewed-chemoinformatics-why.html)).

The [CDK](http://www.chemistry-development-kit.org/) has a strong history of peer review. Patches have been available from
[SVN](http://cdk.svn.sf.net/) from the start, and later we instantiated a mailing list so that people could easily monitor code changes, and
I have actually being doing this since the start, scanning the code patches, knowing that a lot of code is backed up by unit tests to detect
regressions. Anyone can review CDK code in this manner, just by subscribing to the [cdk-commits](https://sourceforge.net/mailarchive/forum.php?forum_name=cdk-commits)
mailing list. If one has questions or comments on a patch, a reply to [cdk-devel](https://sourceforge.net/mailarchive/forum.php?forum_name=cdk-devel)
is all that is needed to get things going.

About a year ago, CDK development had become so extensive that code review in this manner was no longer the way forward (though still possible,
and still used). However, it turned out that it was all too easy to overlook a patch or just click it away in busy times. This was experienced
by some developers who previously monitored the cdk-commit messages sketched above. So, we moved to a more formal patching system where any
non-trivial patching is done in a SVN branch. Once the primary developer is happy about the branch, (s)he requests a review by other developers.
These can leave comments in the source code, reply to the mailing list, or leave comments in the [CDK patch tracker](https://sourceforge.net/tracker2/?group_id=20024&atid=320024).
This more formal work habit got into action about half a year ago already.

A [recent message](https://sourceforge.net/mailarchive/forum.php?thread_name=200812041823.25546.stefan.kuhn%40ebi.ac.uk&forum_name=cdk-devel)
from Stefan makes clear that this tracker has some room for improvements. For example, there is no automatic email to cdk-devel when a patch
has not been tended to for a longer period of time. And, I do not see a simple way of doing this with the SourceForge bug track system.

But, what I can do, is define a number of groups to represent the state of the patch. So, I defined:

* [Needs Review](https://sourceforge.net/tracker2/?func=browse&group_id=20024&atid=320024&status=1&artgroup=896890): this patch has not been reviewed (sufficiently) yet
* [Accepted](https://sourceforge.net/tracker2/?func=browse&group_id=20024&atid=320024&status=1&artgroup=896891): but not yet applied to SVN yet. When applied, the patch report is simply closed
* [Needs Revision](https://sourceforge.net/tracker2/?func=browse&group_id=20024&atid=320024&status=1&artgroup=896892): the reviewers like to see changes made to the patch

![](/blog/assets/images/cdkPatching.png)

Not perfect, but a step forward in tracking the state of patches.
