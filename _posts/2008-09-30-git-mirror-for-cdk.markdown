---
layout: post
title:  "Git mirror for the CDK"
date:   2008-09-30
blogger-link: https://chem-bla-ics.blogspot.com/2008/09/git-mirror-for-cdk.html
doi: 10.59350/assax-tmx60
tags: git cdk
image: /assets/images/punchCard.png
modified_date: 2025-10-11
---

While slowly [merging with Sweden <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2008/09/24/moved-to-sweden-post-doc-in-bioclipse.html), and ADSL which should
reach my house in some two weeks, I am enjoying my new office space and [Git](http://git.or.cz/) to upload patches to the CDK. Christoph
[wondered](http://www.steinbeck-molecular.de/steinblog/index.php/2008/08/26/linus-on-git-on-google-techtalks/) if we should switch CDK
from SVN to Git. A few developers objected, for various reasons: no native Windows clients (though [msysgit](http://code.google.com/p/msysgit/)
might be the solution), no (stable) plugins for Eclipse, IDEA(?), etc.

I [made the switch <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2008/09/07/cdk-development-with-branches-using-git.html), and really happy about it.

Anyway, one issue for me not to switch the full CDK project would be to have a central place where we could host our Git repository. Now,
GitHub does just that, and after inquiring with them about the 100MB limit, [Tom](http://github.com/mojombo) emailed me:

> Hi Egon,
>
> We'd love to have your open source project on GitHub. The 100MB is currently a soft limit, so you won't have any problems uploading
> a larger repo. We hope you enjoy GitHub!
>
> Tom Preston-Werner <br />
> github.com/mojombo

So, I created an [account](http://github.com/egonw) (I'm happy there are so few *Egon*'s in the world :), and
[uploaded the CDK 1.2 branch](http://github.com/egonw/cdk/tree/master), which, for now at least, will serve as mirror only, while
SVN will be the primary repository.

You can easily check it out with:

```shell
$ git clone git://github.com/egonw/cdk.git
```

I am not sure how you can email me your patches, but I know it is possible and report on this later. This mirror is important to those who want to play with Git, as one no longer requires git-svn, dropping one dependency.

Now, it does provide some extra payload on my side, as I need to keep cdk SVN repository (or, better, my git-svn copy of it) synchronized with the git repository, but this turned out to be fairly easy:

```shell
$ cd GitHub/cdk
$ git pull ../../SourceForge/git-svn/cdk my-local-1.2
$ git push
```

So, does this mean no goodies for people who stick to SVN? No, there are some, like this
[PunchCard](http://github.com/egonw/cdk/graphs/punch_card):

![](/assets/images/punchCard.png)
