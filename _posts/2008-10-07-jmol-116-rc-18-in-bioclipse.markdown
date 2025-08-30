---
layout: post
title:  "Jmol 11.6 RC 18 in Bioclipse"
date:   2008-10-07
blogger-link: https://chem-bla-ics.blogspot.com/2008/10/jmol-116-rc-18-in-bioclipse.html
doi: 10.59350/xahx7-yw817
tags: bioclipse jmol
image: /blog/assets/images/bcJmol1.6RC18.png
---

Just updated [Bioclipse2](http://www.bioclipse.net/) with [Jmol](http://www.jmol.org/) 11.6 RC 18:

![](/blog/assets/images/bcJmol1.6RC18.png)

Now [working in Uppsala](http://chem-bla-ics.blogspot.com/2008/09/moved-to-sweden-post-doc-in-bioclipse.html) makes Bioclipse
my default life sciences platform, and I'll be porting older Bioclipse1 plugins to Bioclipse2, which has a much better architecture.

Bioclipse2 does not have a native Jmol Console, but script commands can easily be run with `jmol.run()` (written by Jonathan).
I wonder if it would be hard to have a JmolScript view like this JavaScript Console... The outline on the right (written by Ola)
allows me to navigate the Jmol data model.
