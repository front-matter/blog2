---
layout: post
title:  "Recovering full mass spectra from GC-MS data #2"
date:   2008-06-05
blogger-link: https://chem-bla-ics.blogspot.com/2008/06/recovering-full-mass-spectra-from-gc-ms_05.html
doi: 10.59350/j9rb9-ns27
tags: metabolomics rstats
image: /assets/images/map6.png
modified_date: 2025-10-11
---

Steffen reminded me over email that the particular machine only has a 1 dalton accuracy, and that the 150ppm
parameter setting is somewhat inappropriate. As [seen yesterday <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2008/06/04/recovering-full-mass-spectra-from-gc-ms.html),
it works fine for larger peaks, but fails for low intensity peaks. So, I reran the `centWave` peak detection with 750, 1000 and 1250 ppm,
and that indeed make [XCMS](http://masspec.scripps.edu/xcms/xcms.php) recover many more metabolites, and, also important, with more
extracted ion chromatograms per metabolite, yielding a more accurate mass spectrum. At the same time, I notice that profiles are not
as clean as before, but that's where the peak fitting with (Modified) Gaussians come into play.

The original 150ppm results:

![](/assets/images/ionChromPlot4.png)

The 750ppm results:

![](/assets/images/map5.png)

And for 1000ppm (1250ppm did not further improve):

![](/assets/images/map6.png)
