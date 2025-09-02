---
layout: post
title:  "GitToDo support for Freemind: graphical mapping of important things on my schedule"
date:   2008-10-20
blogger-link: https://chem-bla-ics.blogspot.com/2008/10/gittodo-support-for-freemind-graphical.html
doi: 10.59350/zdj58-w3989
tags:
image: /blog/assets/images/GitToDoFreemind.png
---

About a week ago, I hooked up my [GitToDo](http://github.com/egonw/gtd/tree/master) software with
[Freemind](http://freemind.sourceforge.net/wiki/index.php/Main_Page). This allows me to organize the projects
I am working on, without having to code this in GitToDo directly. I also immediately take advantage of visualization,
for example, adding an icon for projects with one or more TODO items marked TODAY or URGENT:

![](/blog/assets/images/GitToDoFreemind.png)

Keeping my GitToDo repository synchronized is as easy as typing:

```shell
gtd-freemind-update
gtd-freemind-show
```
