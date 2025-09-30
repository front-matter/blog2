---
layout: post
title:  "Short variables and lack of comments..."
date:   2008-12-04
blogger-link: https://chem-bla-ics.blogspot.com/2008/12/short-variables-and-lack-of-comments.html
doi: 10.59350/56vn2-zgc48
tags:
---

... a source code reviewer nightmare. The must-read [lwn.net](http://www.lwn.net/) ran a [nice open letter](http://lwn.net/Articles/308566/)
to a Linux kernel developer. I'd like to cite this bit about code review (see also [Re: Open Source != peer review](http://chem-bla-ics.blogspot.com/2008/11/re-open-source-peer-review.html)):

> [Andrew Morton] had a number of concrete requests - such as documenting the user-space ABI and the network protocol - which have not been
> satisfied. He also asked for better code documentation in general:
>
> <ul>
>   So please. Go through all the code and make it tell a story. Ask yourself "how would I explain all this to a kernel developer who is sitting next to me".
>   It's important, and it's an important skill.
> </ul>

This is important indeed! This is also why CDK quality assurance tends to complain about short variables. While an for-next index `i` is clear enough, `ac` for an
`IAtomContainer` is quite useless, as it does not explain what the purpose of the container is. BTW, a longer name like `atomContainer`
does not really help here. Maybe I will wrote a unit test for that...
