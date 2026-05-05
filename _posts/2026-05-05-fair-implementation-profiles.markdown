---
layout: post
title:  "FAIR Implementation Profiles: Chemistry"
date:   2026-05-05
doi: 10.59350/x115q-m5f95
tags: fair doi:10.1162/dint_a_00035 doi:10.1016/J.IMPACT.2024.100513 cito:citesAsPotentialSolution:10.1186/s13321-021-00520-4
  cito:citesAsPotentialSolution:10.1021/acsenvironau.5c00314 doi:10.37044/OSF.IO/UN2RW cito:citesForInformation:10.1007/978-3-030-65847-2_13
  justdoi:10.5281/zenodo.7378109
grants:
  - grant:
    title: "FAIR4ChemNL: Accelerating the adoption of universal data standards in chemistry"
    acronym: "FAIR4ChemNL"
    id: doi:10.61686/XVYQV45374
    funder:
      name: "Dutch Research Council"
      ror: 04jsz6e67
comments:
  host: social.edu.nl
  username: egonw
  id: 116523648978401165
---

I have had this on my todo list for way too long: writing about [FAIR Implementation Profiles](https://www.go-fair.org/how-to-go-fair/fair-implementation-profile/),
or FIPs for short (see also doi:[10.1007/978-3-030-65847-2_13](https://doi.org/10.1007/978-3-030-65847-2_13)):

> The FIP is a collection of FAIR implementation choices made by a community of practice for each of the FAIR Principles.

In the early GO FAIR days, people referred to the *challenges and choices*. FIPs are a formal approach to report the choices.
The days of the *implementation networks*, like the Chemistry Implementation Network (doi:[10.1162/dint_a_00035](https://doi.org/10.1162/dint_a_00035)),
or the AdvancedNano network (doi:[10.1016/j.impact.2024.100513](https://doi.org/10.1016/j.impact.2024.100513)). For the first,
we absolutely agreed on the InChI, for example, but we never wrote that down as a FIP. But even without FIPs, the
idea was that communities could learn from each other, could converge. This is where the term
[FAIR Convergence Matrix](https://www.go-fair.org/today/fair-matrix/) comes from. (I had forgotten I was actually
part of the matching Working Group. If only I had dedicated funding for it at the time.)

Now, I had on my wishlist to write up a list over FIPs around chemistry. This is relevant for the
[FAIR4ChemNL](https://video.edu.nl/w/pjf5vFFU287AGfYA2SXpE5) project, but obviously beyond that. And while we did
a lot of FAIRification work in, particularly, the nanosafety cluster projects (eNanoMapper, NanoCommons, NanoSolveIT,
RiskGONE, and SbD4Nano), a lot of this never was formalized as FIPs. Second, various relevant standards have been
proposed in chemistry, for [chemical compounds](https://doi.org/10.1186/s13321-021-00520-4) and
[transformation products](https://doi.org/10.1021/acsenvironau.5c00314), among plenty of other things.
But during the first [ELIXIR Toxicology Community](https://elixir-europe.org/communities/toxicology)
workshop in Utrecht, we had FIPs on the agenda too (see [this report](https://doi.org/10.37044/osf.io/un2rw)).

## FIPs in Chemistry

But while I had already several browser tabs open for months, I never could find the courage to start making the list. Silly.
Therefore, this list should be considered a start. I don't think it is exhaustive. I know there is an index somewhere,
but I cannot find back that browser tab. Additions are most welcome: I will update this post (thanks to git and Rogue Scholar).
In brackets I list (a selection of) the FAIR enabling resources mentioned in that FIP.

* [Adverse Outcome Pathways FIP](https://fip-wizard.ds-wizard.org/wizard/projects/2f1c0e80-3c9d-4967-9dc6-fd05fac96269/metrics) (DOI, AOP Wiki ID)
* [Toxicogenomics](https://docs.google.com/spreadsheets/d/1yNEYzJRbx10RkuqJmLcO7RPOq-nrimUKQLQW6uWzfho/edit?gid=127295437#gid=127295437) (ISA-Tab, BioStudies, ArrayExpress)
* [WorldFAIR WP04 NANOMATERIALS FIP01](https://fip-wizard.ds-wizard.org/wizard/projects/b0d84171-4556-46ed-9ace-c1c58db38092) (DOI, ORCID, UUID, ROR, InChI, DataCite, QMRF, RDF/JSON-LD, OWL; doi[10.5281/zenodo.7378109](https://doi.org/10.5281/zenodo.7378109))

Is that all? No, I do not think so, but this is all I can easily find (ironically). Well, I guess you now see why I have had a so much trouble starting to write down this post...
Someone will surely give me some pointers...

## Ackknowledgments

I also like to thank all the people involved in these FIPs. I strongly encourage you to look up all the people who
wrote them down. I also like to thank the INTOXICOM workshop FIP experts Iseult Lynch and Gerhard Burger for
sharing their knowledge.

Finally, I recommend checking out the [FIP Wizard](https://fip.fair-wizard.com/).
