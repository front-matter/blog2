---
layout: post
title:  "Molecular QSAR descriptors in the CDK"
date:   2008-07-23
blogger-link: https://chem-bla-ics.blogspot.com/2008/07/molecular-qsar-descriptors-in-cdk.html
doi: 10.59350/4a21q-zaj66
tags: cdk qsar
image: /assets/images/descNames.png
modified_date: 2025-10-11
---

Rajarshi has patched trunk last night with his work to address a few practical issues in the molecular descriptor
module of the [CDK](http://cdk.sf.net/) (and I [peer reviewed this work yesterday <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2008/07/23/commercial-qsar-modeling-sorry-already.html)).
One major change is that the [IMolecularDescriptor](http://cheminfo.informatics.indiana.edu/~rguha/code/java/nightly/api/org/openscience/cdk/qsar/IMolecularDescriptor.html)
`calculate()` method no longer throws an `Exception`, but returns `Double.NaN` instead. The Exception is stored in the `DescriptorValue` for convenience.
This simplifies the QSAR descriptor calculation considerably, and, importantly, makes it more robust to the input. Though only by propagating errors into
descriptor matrix. *Just make sure your molecular structures have explicit hydrogens and 3D coordinates, and you're fine.*

Anyway, Rajarshi also added a new page to [CDK Nightly](http://cheminfo.informatics.indiana.edu/~rguha/code/java/nightly/)
to [list the available descriptors](http://cheminfo.informatics.indiana.edu/~rguha/code/java/nightly/dnames.html):

![](/assets/images/descNames.png)
