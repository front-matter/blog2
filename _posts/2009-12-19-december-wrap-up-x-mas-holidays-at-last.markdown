---
layout: post
title:  "December wrap up. X-mas holidays at last!"
date:   2009-12-19
blogger-link: https://chem-bla-ics.blogspot.com/2009/12/december-wrap-up-x-mas-holidays-at-last.html
doi: 10.59350/pxwbm-2wn02
tags: bioclipse bioinf cheminfo doi:10.1186/1471-2105-10-397 latex
---

Wow, I just saw it has been **17 days** since my last post already :( That's a new record, I think! A lot has happened
actually, but I have not had time to write up things. Actually, I have still have
[SWAT4LS coverage left to do](http://chem-bla-ics.blogspot.com/2009/11/swat4ls-wrapping-up-1.html) :(

### Latex

Anyway, one of the things our group has been up to in the last two weeks, is writing a book to support of the
[free, online Pharmaceutical Bioinformatics course](http://www.pharmbio.org/). The material includes a good deal of
cheminformatics (molecular representation: chemical graph theory, 3D geometries, file formats, line notations, InChI),
bioinformatics (sequence analysis), and statistics (PLS, PCA, proteochemometrics). All in light of drug discovery.
Of course, we're using LaTeX, and I asked around here and there about related things. For example, on
[StackOverflow on educational book styles](http://stackoverflow.com/questions/1901213/open-source-latex-environment-for-educational-books).
But also on [FriendFeed on tautomerism in relation to drug activity](http://friendfeed.com/the-life-scientists/5fd17e31/who-can-point-me-to-drug-where-tautomerism-is).

### Bioclipse

I also hacked up a [Bioclipse](http://www.bioclipse.net/) plugin that allows me to convert a Bioclipse matrix
resource into LaTeX source code, but that will not be part of the Bioclipse 2.2 release, as it requires quite
some updating of the statistics functionality. BTW, the LaTeX plugin is hosted at [Gitorious](http://gitorious.org/~egonw),
which is an GitHub alternative, but [does not seem to have post-commit hooks](http://stackoverflow.com/questions/1913726/has-gitorious-hooks-for-cia-commit-notification)
:(

Also, the Bioclipse2 paper "Bioclipse 2: A scriptable integration platform for the life sciences" has been
published now in BMC Bioinformatics (DOI:[10.1186/1471-2105-10-397](https://doi.org/10.1186/1471-2105-10-397))!

### New student

I am also happy to have a second student starting in January, who will work primarily on an RDF version of the
[ChEMBL](http://chembl.blogspot.com/) data. Her work will extend on the excellent work being done right now by
[Samuel on comparing Prolog with DL reasoning](http://saml.rilspace.com/).

### CDK Licensing

Another thing that required my attention was the problem brought up by Andew on licensing. There was considerable
out-of-date problems with the statements the [CDK](http://cdk.sf.net/) makes on the license and copyright informations
certain CDK modules use, and the implications that has on what the CDK project is required to do (e.g. link to source
code of third party libraries) and for downstream CDK distributors, like the [Debian](https://chem-bla-ics.blogspot.com/2009/12/packages.debian.org/libcdk-java)
and [Ubuntu](https://chem-bla-ics.blogspot.com/2009/12/packages.ubuntu.com/libcdk-java) projects. For example, it
became apparent that the Debian package cannot distribute the XML Schema of [CML](http://en.wikipedia.org/wiki/Chemical_Markup_Language),
which is [CC-BY-ND](http://creativecommons.org/licenses/by-nd/2.5/) which is not DSFG-compatible. A few bugs
have been reported, and work is ongoing to fix the issues.
