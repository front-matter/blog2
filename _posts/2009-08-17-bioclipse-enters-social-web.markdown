---
layout: post
title:  "Bioclipse enters the social web"
date:   2009-08-17
blogger-link: https://chem-bla-ics.blogspot.com/2009/08/bioclipse-enters-social-web.html
doi: 10.59350/9zgvr-hfk92
tags: bioclipse twitter friendfeed
image: /blog/assets/images/bioclipseTweet.png
---

The [Open Notebook Science](http://en.wikipedia.org/wiki/Open_Notebook_Science) [Solubility project](http://spreadsheets.google.com/ccc?key=plwwufp30hfq0udnEmRD1aQ)
in particular is keen on sharing results using the [Social Web](http://en.wikipedia.org/wiki/Social_web). Last week I reported about the plugin I wrote to access
the data on [FriendFeed](http://www.friendfeed.com/):

<iframe src="http://friendfeed.com/onssolubility/11b5037f/fwd-hacking-up-bioclipse-support-for?embed=1" frameborder="0" height="600" width="400" style="border:1px solid #aaa"></iframe>

When someone asked last week on [Taverna](http://taverna.sf.net/) mailing list about a Twitter [node](http://twitter.com/),
I was surely interested. Though this can hardly be called *core research*, I, *fortunately*, had to test
[the new Bioclipse SDK](http://chem-bla-ics.blogspot.com/2009/08/making-bioclipse-development-easier-new.html) :)

So, I hacked up a Twitter plugin for [Bioclipse](http://www.bioclipse.net/) in no time using [JTwitter](http://www.winterwell.com/software/jtwitter.php)
(license:LGPL), to allow sending tweets to [my Twitter account](http://twitter.com/egonwillighagen) (but not yet my
[Identi.ca account](http://identi.ca/chemblaics)):

![](/blog/assets/images/bioclipseTweet1.png)

Or, as copy/pastable script:

<script src="https://gist.github.com/169156.js"></script>

And you can see it really hit Twitter [here](http://search.twitter.com/search?q=bioclipse+social+feature) and in this screenshot of my
[Choqok](http://choqok.gnufolks.org/) client:

![](/assets/images/bioclipseTweet.png)


