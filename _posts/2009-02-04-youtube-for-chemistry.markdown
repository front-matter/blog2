---
layout: post
title:  "YouTube for Chemistry"
date:   2009-02-04
modified_date: 2009-02-04
blogger-link: https://chem-bla-ics.blogspot.com/2009/02/youtube-for-chemistry.html
doi: 10.59350/qf4d9-79d36
tags: chemspider
---

[ChemSpider](http://www.chemspider.com/) has set up [embeddable chemistry widget](http://www.chemspider.com/blog/why-are-chemical-structures-like-youtube-videos.html)
(per [Cameron](http://blog.openwetware.org/scienceintheopen/)'s idea), much like [YouTube](http://youtube.com/). I just have to try that.
Unlike YouTube, you need to be registered and logged in to use the functionality (I hope the requirement will be dropped):

<script type="text/javascript" src="http://www.chemspider.com/csjsapi.ashx?op=img&amp;tk=3d178e75-a272-4d60-8ca9-5b1183a0e746&amp;id=171&amp;w=120&amp;p=1&amp;eid=%22azijnzuur%22"></script>

There is an option to have ChemSpider link back to blog, and I will have to figure out how to enable
[Chemical blogspace](http://cb.openmolecules.net/) to extract the InChI from the underlying JavaScripts.

**Update**: I noticed that the ChemSpider server was a bit sluggish this morning, and that loading my blog page halts at loading the
JavaScript... Tony, I suggest to use some Ajax magic here, with a really fast JavaScript download (using an almost static bit of
JavaScript), and then a Ajax to access to slower bits, which might involve image generation and database lookup.
