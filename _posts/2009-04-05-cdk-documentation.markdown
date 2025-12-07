---
layout: post
title:  "CDK - The Documentation"
date:   2009-04-05
blogger-link: https://chem-bla-ics.blogspot.com/2009/04/cdk-documentation.html
doi: 10.59350/rzwcr-mq411
tags: cdk cdkbook
image: /blog/assets/images/cdkbook.png
---

In preparation for the [CDK workshop](http://www.steinbeck-molecular.de/steinblog/index.php/2009/02/17/cdk-workshop-at-ebi-on-april-2021/) later this
month, I am writing up my material for my kick-off presentation of the workshop. So, I better make it good. Using LaTeX at least overcomes my laziness
which always made Word documents look stupid. Even default LaTeX looks good:

![](/blog/assets/images/cdkbook.png)

Clearly, any such documentation becomes quickly outdated, in particular when source code fragments are involved. Yes,
[CDK 1.2](http://sourceforge.net/mailarchive/forum.php?thread_name=6aeb064b0903130006j2a71a94execd2f09209cd668%40mail.gmail.com&forum_name=cdk-user) is
API stable, but only for the core classes. Moreover, I hope that the documentation will survive CDK 1.4 or 2.0 or whatever the next stable version is.

Therefore, I need to source code fragments compilable. R has the magnificent [Sweave](http://www.stat.umn.edu/~charlie/Sweave/), and I wanted for a
long time something similar. While I do not have something that powerful yet, at least my current set up allows me have code that both compiles and
embeds in the LaTeX. The system allows me to write both Java application code as BeanShell scripts. No clue yet what I will use in the workshop,
maybe even both. Like Sweave, it even saves output, and I can include that in the LaTeX source too. The code fragments can either go in as a verbatim
section, or as a listing, depending on what I find more appropriate.
