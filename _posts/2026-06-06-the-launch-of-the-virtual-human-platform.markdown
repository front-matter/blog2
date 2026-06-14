---
layout: post
title:  "The launch of the Virtual Human Platform"
date:   2026-06-06
doi: 10.59350/s784p-s1y68
tags: vhp4safety bioschemas openscience elixir doi:10.14573/ALTEX.2407211
  justdoi:10.1016/j.toxlet.2018.06.617
image: /assets/images/vhp_platform.png
grants:
  - grant:
    title: "The Virtual Human Platform for Safety Assessment"
    acronym: "VHP4Safety"
    id: drc.filenumber:nwa129219272
    funder:
      name: "Dutch Research Council"
      ror: 04jsz6e67
comments:
  host: social.edu.nl
  username: egonw
  id: 116704857674698375
---

<img src="/assets/images/vhp_platform.png" style="width: 30%; display: block; margin-left: auto; margin-right: auto; float: right"
     alt="Screenshot of the Virtual Human Platform website, showing a logo, three section panels (Case Studies, Tools, Methods, Data), and a short description. The page is just the top part and includes several menus at the top." />
Nine days ago, the [VHP4Safety](https://vhp4safety.nl/) project
(see [these posts](https://chem-bla-ics.linkedchemistry.info/tag/vhp4safety))
held a launch event in Utrecht for the
[Virtual Human Platform](https://platform.vhp4safety.nl/) (VHP), a key result of the
[Dutch Research Agenda](https://www.nwo.nl/en/researchprogrammes/dutch-research-agenda-nwa) (NWA,
from the Dutch *Nationale Wetenschapsagenda*). Despite the name, the NWA is just one part
of the NWO funding mechanisms, but like the [NWO Open Science programme](https://www.openscience.nl/en/about-us)
it is funding with a specific purpose. And the purpose of the NWA is to answer
research and societal questions that the Dutch people together defined and a public
consultation (many years ago). VHP4Safety is answering to one of those questions.

## Co-creation

The project is still running another few months, but the [launch last week](https://www.sciencrew.com/c/9347/a/335652577?title=Launch_of_the_Virtual_Human_Platform)
gives us the opportunity to include feedback from the stakeholders from the Dutch
society, many of which have been involved in the project via designathons and
hackathons (see doi:[10.14573/altex.2407211](https://doi.org/10.14573/altex.2407211)).

The VHP4Safety platform is a co-creation created by most of the people working
on the VHP4Safety grant. Some people focused on innovation and education (RL3),
others on the regulatory questions (RL2), and some on the development of the
platform (RL1). The research line 1 (RL1) included a work package on the
technological development, work package 1.1, and that was led by Maastricht
University (Ozan and me) and the Applied University of Utrecht (Dr. Marc Teunis).
This project would not be together without the leadership by
Prof. dr. ir. Juliette Legler, Dr. Cyrille Krul, and Prof. dr. Anne Kienhuis
 (see [this video](https://video.edu.nl/w/rvUKc7J4E4HEt2TEbJEQt9)).

## Not just technology

I have to give a huge shout out to Ozan whom had the daunting task
to set up something like OpenRiskNet (doi:[10.1016/j.toxlet.2018.06.617](https://doi.org/10.1016/j.toxlet.2018.06.617)),
a project with at least twice as much
funding for operating and documenting just the technical platform, but also
help other partners getting their work on the platform. Also shout outs to 
Luc who in our group first explored how to translate the OpenRiskNet platform
to VHP4Safety with [kubernetes](https://en.wikipedia.org/wiki/Kubernetes) from
which we concluded that that was not an option for us. And to Sean in our group
who introduced us to [Docker Swarm](https://www.geeksforgeeks.org/devops/introduction-to-docker-swarm-mode/).

But that is just one aspect of the technological layers. The design outlined
in the original proposal is based on earlier projects, including OpenRiskNet,
eNanoMapper, OpenRiskNet, Open PHACTS, NanoCommons, SbD4Nano and many others.
It is based on open standards developed and/or adopted by
[ELIXIR Europe](https://elixir-europe.org/) projects and many other organisations.

And then we have not even covered the content on the platform.

## A virtual human

Building full virtual human is an ambition. Many [digital twins](https://en.wikipedia.org/wiki/Digital_twin)
capture just one part of human biology. For safety assessment we need many models,
data from experiments, and knowledge bases. And we need a clear narrative that
describes how those isolated solutions are integrated so that regulatory questions
can be answered. That co-created combination is the launched *virtual human platform*.

Underlying the VHP is a good bit of open science, though it also integrated 
proprietary solutions, currently needed to be able to replace animal testing.
And our modular co-creation resulted in [many separate git repositories](https://github.com/VHP4Safety).
This allows distributed development models and all contributors to take ownership
of the development of their contributions. Marc and Frank introduced a agile computing
approach that we adopted to guide the development of the full platform.

There is so much to write up about the platform (and we will), but for now I want
to highlight a few essential git repositories underlying the 1.0 version of the
platform we launched last week (along with the number of contributors in the past two years):

* [virtual-human-platform](https://github.com/VHP4Safety/virtual-human-platform) ([10 contributors](https://github.com/VHP4Safety/virtual-human-platform/graphs/contributors?from=6%2F1%2F2024)): software that provide the platform UX
* [cloud](https://github.com/VHP4Safety/cloud) ([11 contributors](https://github.com/VHP4Safety/cloud/graphs/contributors?from=6%2F1%2F2024)): collects the meta data about (computational) services
* [ui-casestudy-config](https://github.com/VHP4Safety/ui-casestudy-config) ([7 contributors](https://github.com/VHP4Safety/ui-casestudy-config/graphs/contributors?from=5%2F31%2F2025)): collects the details of the narratives of the case studies

This includes [Aniek](https://github.com/aniekdewinter), [Fabian](https://github.com/FW94),
[Isaac](https://github.com/iaortega), [Ivo](https://github.com/senseibelbi),
[Javier](https://github.com/jmillanacosta), [Jente](https://github.com/johannehouweling),
[Linde](https://github.com/LindeSchoenmaker), [Marvin](https://github.com/marvinm2),
[Myrthe](https://github.com/mirthhe), [Saad](https://github.com/saadlodhi0916),
[Shakira](https://github.com/ShakiraPortfolio), and [Youp](https://github.com/youphendriks),
in addition to the earlier named [Ozan](https://github.com/ozancinar) and
[Marc](https://github.com/Maddocent).

This excludes the many contributions via the designathons and hackathons that are
behind many of the commits to these repositories. And this also excludes the
many [other source code repositories](https://github.com/VHP4Safety/) for tools
and services developed and made available on this VHP, with even more researchers.

Very much aware of all the work that is still ahead of us, I am happy with the
important milestone of this release. Thank you to
[everyone who contributed to this co-creation](https://github.com/orgs/VHP4Safety/people),
all the [involved institutes](https://www.sciencrew.com/c/9319/a/329042452?title=VHP4Safety_Partners),
NWO for [the funding](https://www.nwo.nl/en/projects/nwa129219272), and the Dutch
public for the important NWA question.

The project delivered!
