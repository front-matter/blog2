---
layout: post
title:  "Keeping my Bioclipse repositories in sync with upstream"
date:   2009-10-07
blogger-link: https://chem-bla-ics.blogspot.com/2009/10/keeping-my-bioclipse-repositories-in.html
doi: 10.59350/j7qvv-pnd49
tags: bioclipse git
---

[Bioclipse](http://www.bioclipse.net/) is now split up over several [Git](http://en.wikipedia.org/wiki/Git_(software)) repositories (and some
additional stuff in even more repositories). This has all to do with each repository now having one person acting as point-of-access. This
means that I have several repositories checked out, which I need to keep synchronized. Now, I am pretty sure there are many solutions (and
suggestions very welcome!), but this is the [Bash](http://en.wikipedia.org/wiki/Bash) script I have just written to give me an overview of
the state of my repositories, hoping it may be useful to others too:

```shell
#!/bin/bash

PLUGINS=`ls -1`

for PLUGIN in $PLUGINS
do
        echo "************************************************************* $PLUGIN"
        cd $PLUGIN; git fetch origin; git status; cd ..
done
```
