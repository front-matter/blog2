---
layout: post
title:  "Bioclipse enters the social web"
date:   2009-08-17
modified_date: 2026-02-21
blogger-link: https://chem-bla-ics.blogspot.com/2009/08/bioclipse-enters-social-web.html
doi: 10.59350/9zgvr-hfk92
tags: bioclipse twitter friendfeed
image: /blog/assets/images/bioclipseTweet.png
---

The [Open Notebook Science](https://en.wikipedia.org/wiki/Open_Notebook_Science) [Solubility project](http://spreadsheets.google.com/ccc?key=plwwufp30hfq0udnEmRD1aQ)
in particular is keen on sharing results using the [Social Web](https://en.wikipedia.org/wiki/Social_web). Last week I reported about the plugin I wrote to access
the data on [FriendFeed](https://www.friendfeed.com/).

When someone asked last week on the [Taverna](https://taverna.sf.net/) mailing list about a Twitter [node](http://twitter.com/),
I was surely interested. Though this can hardly be called *core research*, I, *fortunately*, had to test
[the new Bioclipse SDK](http://chem-bla-ics.blogspot.com/2009/08/making-bioclipse-development-easier-new.html) :)

So, I hacked up a Twitter plugin for [Bioclipse](https://www.bioclipse.net/) in no time using [JTwitter](https://www.winterwell.com/software/jtwitter.php)
(license:LGPL), to allow sending tweets to [my Twitter account <i class="fa-solid fa-link-slash fa-xs"></i>](https://twitter.com/egonwillighagen) (but not yet my
[Identi.ca account](https://identi.ca/chemblaics)):

![](/blog/assets/images/bioclipseTweet1.png)

Or, as copy/pastable script:

<script src="https://gist.github.com/169156.js"></script>

And you can see it really hit Twitter [here](http://search.twitter.com/search?q=bioclipse+social+feature) and in this screenshot of my
[Choqok](http://choqok.gnufolks.org/) client:

![](/blog/assets/images/bioclipseTweet.png)
