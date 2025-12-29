---
layout: post
title:  "Open Infrastructures #1: Research Software Directory"
date:   2025-12-29
doi: 10.59350/g30ef-gxm10
tags: justdoi:10.1109/eScience.2018.00016 justdoi:10.1109/eScience.2018.00013 cdk openscience
image: /assets/images/rsd.png
#comments:
#  host: social.edu.nl
#  username: egonw
#  id: ...
---

> Research software is an integral part of scientific investigations.

This is what Struck wrote in 2018 in a contribution to the 2018 IEEE 14th International Conference on e-Science (e-Science)
(doi:[10.1109/eScience.2018.00016](https://doi.org/10.1109/eScience.2018.00016)). I very much agree with this,
and the notion is gaining ground in the academic community. Their paper *"identifies challenges, risks and new opportunities
in research software publication and discovery"*.

At the same conference, Spaaks *et al.* presented a lightning talk about the
[Research Software Directory](https://research-software-directory.org/software/rsd-ng) (RSD),
*"a content management system for research software, which promotes the visibility, reuse, and impact of research software"*
(doi:[10.1109/eScience.2018.00013](https://doi.org/10.1109/eScience.2018.00013)).

I wonder who spoke first at the meeting.

Anyway, I learned about RSD a while ago already and have been using it for some of our
group's research software. We don't have a collection for our group, but you will find them
under the [Maastricht University organisatino page](https://research-software-directory.org/organisations/maastricht-university).

And as sketched by Struck and implemented by Spaaks *et al.*, RSD gives rich context
to the research software. It can track the activity on the project (for GitHub, GitLab,
[Codeberg](https://github.com/research-software-directory/RSD-as-a-service/issues/1605) etc),
track citations to key literature, and can have links to distributions where the software is published
(like Debian, CRAN, [Bioconductor](https://github.com/research-software-directory/RSD-as-a-service/issues/1606), etc).

This is what it looks like for the [Chemistry Development Kit](https://research-software-directory.org/software/cdk):

![](/assets/images/rsd.png)

I like initiatives like this, as they help the community work out open standards to exchange
metadata, and encourage other projects by reusing their APIs.
