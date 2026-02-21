---
layout: post
title:  "The TDCC NES Col-Lab Retreat"
date:   2026-02-21
doi: 10.59350/pm3c5-89k94
tags: fair doi:10.1162/DINT_A_00035 chemistry metabolomics fair4chemnl fairify
  cito:citesAsEvidence:10.5281/ZENODO.15050550 nanopub crate pubchem
grants:
  - grant:
    title: "FAIRify your metabolomics data: achieving convergence on standards for reuse-ready data and workflows"
    acronym: "FAIRify"
    id: doi:10.61686/CSGIP04334
    funder:
      name: "Dutch Research Council"
      ror: 04jsz6e67
  - grant:
    title: "FAIR4ChemNL: Accelerating the adoption of universal data standards in chemistry"
    acronym: "FAIR4ChemNL"
    id: doi:10.61686/XVYQV45374
    funder:
      name: "Dutch Research Council"
      ror: 04jsz6e67
#comments:
#  host: social.edu.nl
#  username: egonw
#  id: ...
---

Last autumn two TDCC projects started, *FAIR4ChemNL* ([with the PeerTube channel](https://chem-bla-ics.linkedchemistry.info/2026/02/08/open-infrastructures.html)
and doi:[10.61686/XVYQV45374](https://doi.org/10.61686/XVYQV45374)) and *FAIRify for metabolomics data*
(doi:[10.61686/CSGIP04334](https://doi.org/10.61686/CSGIP04334)). But I haven't written much on either yet and what the role is our research group in these projects.

Let's start with what the TDCC actually are: they are [Thematic Digital Competence Centres](https://tdcc.nl/):

> The Thematic Digital Competence Centres (TDCCs) are network-based initiatives set up by NWO and the Dutch academic
> community to broker investments into research data management projects. The three TDCCs are national and discipline
> based, with one pillar each for the Social Sciences & Humanities (SSH), Natural and Engineering Sciences (NES) and
> Life Sciences & Health (LSH). The networks will help formulate and facilitate projects designed to promote the adoption
> of open data, software and research practices, alongside the development of the necessary expertise.

So, where initiatives like [GO FAIR](https://www.go-fair.org/) had centers of competencies (the implementation networks),
they did not have funding for them. This was a main reason why the *Chemistry Implementation Network* (ChIN,
doi:[10.1162/dint_a_00035](https://doi.org/10.1162/dint_a_00035)) did not take off.
The TDCCs do not provide a lot of money, but enough to support disseminating expertise and promote some key ideas.

The idea is that combined with other efforts, it strengthens the level of FAIR in the Dutch research community.
I have to say, this is much needed, as the level of FAIR data in journal publications is so much to wish for,
and still mostly absent.

The FAIR4ChemNL project already had a networking activity during the writing of the proposal, the workshop already
back in 2024 that I [blogged about earlier](https://chem-bla-ics.linkedchemistry.info/2024/06/10/two-meetings.html)
(see also [this report](https://doi.org/10.5281/zenodo.15050550)).
The FAIRify project is coordinated by the group that was key in the *Netherlands Metabolomics Center* (NMC), now the
[BeneLux Metabolomics Center](https://metabolomicscentre.nl/). During a postdoc at the NMC during my Wageningen
days, we already did a lot of FAIR competency building with [the MetWare project](https://chem-bla-ics.linkedchemistry.info/tag/metware).

## The Col-Lab Retreat

The [TDCC-NES](https://tdcc.nl/about-tddc/nes/) organized a networking event in August last year,
the 2025 [TDCC-NES Col-Lab Retreat](https://nescollab.nl/). I am late with
reporting on it, but there simply was too much project management that took priority. The meeting was in the
wonderful Dutch town Schoorl, and the location is great for collaborative meetings. I had been there a year
earlier for an Open Science Retreat and was happy to go back.

During the unconference-style meeting [various topics were discussed](https://tdcc.nl/creating-space-for-our-community-the-story-of-our-nes-col-lab-retreat/)
in breakout groups, and because of the two TDCC projects, I was particularly interested in the *Metadata and interoperability*
topic. Partly because this is how we can make eletronic lab notebooks automatically push metadata to
registries (and [Rory Macneil](https://www.linkedin.com/in/rory-macneil-68a80011/) was also in Schoorl,
of [RSpace/ResearchSpace](https://www.researchspace.com/) which already integrated with various open
platforms), and partly because I wanted to continue explore [nanopublications](https://chem-bla-ics.linkedchemistry.info/tag/nanopub)
with [Christian Meesters](https://fediscience.org/@rupdecat), which could be the envelope to distribute
the metadata. For the last, I was looking at the Java library for nanopublications
(see [this PR](https://github.com/Nanopublication/nanopub-java/pull/52).

The idea that ELNs automatically share metadata about experiments is something that is attractive.
It would require no involvement from the researcher, would be fully automatic, and drive interest
(users, peer reviewers) to experiments and experimental data. Something that is still absurdly hard
is to do a search for experiments that measured the melting point of some chemical. How
awesome would it be if ELNs would automatically register chemicals from the experiment in,
for example, [PubChem](https://pubchem.ncbi.nlm.nih.gov/).

We had the idea of applying for a Lorentz Workshop, but the earliest deadline was too early, but
maybe it is time to pick up that idea again. Interoperability standards already exist, like
the aforementioned nanopubs, but also [RO-Crates](https://www.researchobject.org/ro-crate/) that are also studied by Jente Houweling
in the VHP4Safety project (see [this Data tab](https://platform.vhp4safety.nl/data) for a preview).
