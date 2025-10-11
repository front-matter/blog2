---
layout: post
title:  "The CDK/Metabolomics/Chemometrics Unconference results"
date:   2008-04-07 00:10
blogger-link: https://chem-bla-ics.blogspot.com/2008/04/cdkmetabolomicschemometrics.html
doi: 10.59350/f2ajz-tmr63
tags: cdk defense phd metabolomics cheminf chemometrics justdoi:10.18637/jss.v018.i02
image: /assets/images/riPred.png
modified_date: 2025-10-11
---

As [announced earlier <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2008/04/03/t-plus-18-hours-dr-and-preparing-for.html), Miguel, Velitchka,
[Christoph](http://www.steinbeck-molecular.de/steinblog/) and I held a small [CDK](http://cdk.sf.net/)/Metabolomics/Chemometrics
unconference. We started late, and did not have an evening program, resulting in not overly much results. However, we did do
*[molecular chemometrics](http://chem-bla-ics.blogspot.com/search?q=molecular+chemometrics)*. <!-- keep link -->

We used the [R statistics software](http://www.r-project.org/) together with Rajarshi's [rcdk](http://cran.r-project.org/web/packages/rcdk/index.html)
package (an R wrapper around the CDK library) and Ron's (my PhD supervisor) [PLS](http://cran.r-project.org/web/packages/pls/index.html)
package (see [this paper](http://www.jstatsoft.org/v18/i02/)), to predict retention indices for a number of metabolites.

We ended up with this R script:

```R
library("rJava")
library("rcdk")
library("pls")
mols = load.molecules("data_cdk.sdf")
selection = get.desc.names()
selection = selection[-which(selection=="org.openscience.cdk.qsar.descriptors.molecular.AminoAcidCountDescriptor")]
x = eval.desc(mols, selection, verbose=TRUE)
x2 = x[,apply(x, 2, function(a) {all(!is.na(a))})]
y = read.table("data_cdk_RI")
input = data.frame(x2, y)
pls.model = plsr(V1 ~ ., 50, data=input, validation="CV")
summary(pls.model)
plot(RMSEP(pls.model))
plot(pls.model, ncomp=20)
abline(0,1, col="red")
plot(pls.model, "loadings", comps=1:2)
savehistory("finalHistory.R")
```

The `AminoAcidCountDescriptor` threw us a `NullPointerException` and there were a few NAs in the resulting matrix. The CV results were
not so good as Velitchka's best models, but still a good start:

![](/assets/images/riPred.png)

No variable selection; 200 objects, 190 variables.

Questions:

* Can we do this in [Bioclipse2](http://www.bioclipse.net/) too?
* Can we improve the default CDK descriptor parameters to maximize the column count?
* Rajarshi, what would be involved to write some wrapper code for atomic descriptors for rcdk?
