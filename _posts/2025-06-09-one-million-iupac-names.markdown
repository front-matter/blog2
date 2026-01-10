---
layout: post
title:  "One Million IUPAC names #3: the 200 thousand milestone and 1 million IUPAC names"
date:   2025-06-09
modified_date:   2025-08-16
doi: 10.59350/6f7he-kxt56
tags: iupac textmining inchikey:DKPKDPKJVDQUPD-XGBIXEJNSA-M cito:containsAssertionFrom:10.59350/rzepa.28802
  europepmc
image: /assets/images/iupac_626.png
comments:
  host: social.edu.nl
  username: egonw
  id: 114652819323591144
---

I could not find the time earlier to report ([reason](https://chem-bla-ics.linkedchemistry.info/2025/06/08/iccs2025-1-back-in-noordwijkerhout.html)),
but three weeks ago we passed the fourth milestone release of the CCZero IUPAC names found in literature collection. This release contains
200026 IUPAC names, 168702 unique names, reflecting 116207 unique InChIKeys. Time for an update of the
[One Million IUPAC names](https://chem-bla-ics.linkedchemistry.info/2025/03/08/iupac-names.html) project.

The current count actually is just above 230 thousand IUPAC names, but further growth may require new approaches,
such as the [four ideas](https://chem-bla-ics.linkedchemistry.info/2025/04/27/one-million-iupac-names-2-the-100-thousand-milestone.html)
I posted earlier. I have gone through all full-text Open Access articles provided by the [Europe PMC API](https://europepmc.org/RestfulWebService).
Now, this list is not static, but I wanted to start using their [bulk downloads](https://europepmc.org/downloads) anyway.

## The current results

I have been looking at the names coming in. Some are short, others long. The complexity is fascinating and I will
have to brush up my cheminformatics skills to make chemical space splots and visualize the structural diversity.
I also note the current workflow does a good job at unicode characters, and we have plenty of names
like `ε,ε-carotene-3,3’-dione`. There are also names that I do not expect to be really valid, like
`hydroxymethyl methacrylate-` that end with a hyphen (41 in total), but their overall count is low.
And OPSIN is happy with it, so the name fits the rules.

The ten longest names (so far) are these (with the lengths 322, 324, 332, 357, 371, 373, 376, 421, 429, and 626):

```
(5Z)-3-ethyl-5-[[4-[15-[7-[(Z)-(3-ethyl-4-oxo-2-sulfanylidene-1,3-thiazolidin-5-ylidene)methyl]-2,1,3-benzothiadiazol-4-yl]-9,9,18,18-tetra(nonyl)-5,14-dithiapentacyclo[10.6.0.03,10.04,8.013,17]octadeca-1(12),2,4(8),6,10,13(17),15-heptaen-6-yl]-2,1,3-benzothiadiazol-7-yl]methylidene]-2-sulfanylidene-1,3-thiazolidin-4-one
(Z)-[[4-[[(Z)-N’-carbamoyl-N-[2-[2-[2-[[3-[(4S)-6,8-dichloro-2-methyl-3,4-dihydro-1H-isoquinolin-4-yl]phenyl]sulfonylamino]ethoxy]ethoxy]ethyl]carbamimidoyl]amino]butylamino]-[2-[2-[2-[[3-[(4S)-6,8-dichloro-2-methyl-3,4-dihydro-1H-isoquinolin-4-yl]phenyl]sulfonylamino]ethoxy]ethoxy]ethylamino]methylene]urea dihydrochloride
2-((Z)-2-((6-(4-(6-((Z)-(1-(dicyanomethylene)-5,6-difluoro-3-oxo-1H-inden-2(3H)-ylidene)methyl)-4,4-bis(2-ethylhexyl)-4H-cyclopenta[1,2-b:5,4-b′]dithiophen-2-yl)-2,3-bis(hexyloxy)phenyl)-4-(5,7-diethylundecan-6-yl)-4H-cyclopenta[1,2-b:5,4-b′]dithiophen-2-yl)methylene)-5,6-difluoro-3-oxo-2,3-dihydro-1H-inden-1-ylidene)malononitrile
(2S,4S,5R,6R)‐5‐acetamido‐2‐[(2S,3R,4R,5S,6R)‐5‐[(2S,3R,4R,5R,6R)‐3‐acetamido‐4,5‐dihydroxy‐6‐(hydroxymethyl)oxan‐2‐yl]oxy‐2‐[(2R,3S,4R,5R,6R)‐4,5‐dihydroxy‐2‐(hydroxymethyl)‐6‐[(E,2S,3R)‐3‐hydroxy‐2‐(octadecanoylamino)octadec‐4‐enoxy]oxan‐3‐yl]oxy‐3‐hydroxy‐6‐(hydroxymethyl)oxan‐4‐yl]oxy‐4‐hydroxy‐6‐[(1R,2R)‐1,2,3‐trihydroxypropyl]oxane‐2‐carboxylic acid
(2R,3S,4R,5R,7S,9S,10S,11R,12S,13R)-7-[(benzylcarbamoyl)oxy]-2-(1-{[(2R,3R,4R,5R,6R)-5-hydroxy-3,4-dimethoxy-6-methyltetrahydro-2H-pyran-2-yl]oxy}propan-2-yl)-10-{[(2S,3R,6R)-3-hydroxy-4-(methoxyimino)-6-methyltetrahydro-2H-pyran-2-yl]oxy}-3,5,7,9,11,13-hexamethyl-6,14-dioxo-12-{[(2S,5R,7R)-2,4,5-trimethyl-1,4-oxazepan-7-yl]oxy}oxacyclotetradecan-4-yl 3-methylbutanoate
2-[4-[2-[[(2R)-1-[[(4R,7S,10S,13R,16S,19R)-10-(4-aminobutyl)-4-[[(2R,3R)-1,3 dihydroxybutan-2-yl]carbamoyl]-7-[(1R)-1-hydroxyethyl]-16-[(4-hydroxyphenyl)methyl]-13-(1H-indol3-ylmethyl)-6,9,12,15,18-pentaoxo-1,2-dithia-5,8,11,14,17-pentazacycloicos-19-yl]amino]-1-oxo-3 phenylpropan-2-yl]amino]-2-oxoethyl]-7,10-bis(carboxymethyl)-1,4,7,10-tetrazacyclododec-1-yl]acetic acid
(2R,3S,4R,5R,7S,9S,10S,11R,12S,13R)-12-{[(2R,4R,5S,6S)-4,5-dihydroxy-4,6-dimethyltetrahydro-2H-pyran-2-yl]oxy}-7-hydroxy-2-(1-{[(2R,3R,4R,5R,6R)-5-hydroxy-3,4-dimethoxy-6-methyltetrahydro-2H-pyran-2-yl]oxy}propan-2-yl)-10-{[(2S,3R,6R)-3-hydroxy-4-(methoxyimino)-6-methyltetrahydro-2H-pyran-2-yl]oxy}-3,5,7,9,11,13-hexamethyl-6,14-dioxooxacyclotetradecan-4-yl 3-methylbutanoate
(2S,4S,5R,6R)‐5‐acetamido‐2‐[(2S,3R,4R,5S,6R)‐5‐[(2S,3R,4R,5R,6R)‐3‐acetamido‐5‐hydroxy‐6‐(hydroxymethyl)‐4‐[(2R,3R,4S,5R,6R)‐3,4,5‐trihydroxy‐6‐(hydroxymethyl)oxan‐2‐yl]oxyoxan‐2‐yl]oxy‐2‐[(2R,3S,4R,5R,6R)‐4,5‐dihydroxy‐2‐(hydroxymethyl)‐6‐[(E,2S,3R)‐3‐hydroxy‐2‐(octadecanoylamino)octadec‐4‐enoxy]oxan‐3‐yl]oxy‐3‐hydroxy‐6‐(hydroxymethyl)oxan‐4‐yl]oxy‐4‐hydroxy‐6‐[(1R,2R)‐1,2,3‐trihydroxypropyl]oxane‐2‐carboxylic acid
(2R,3S,4R,5R,7S,9S,10S,11R,12S,13R)-12-{[(2R,4R,5S,6S)-4,5-dihydroxy-4,6-dimethyltetrahydro-2H-pyran-2-yl]oxy}-2-(1-{[(2R,3R,4R,5R,6R)-5-hydroxy-3,4-dimethoxy-6-methyltetrahydro-2H-pyran-2-yl]oxy}propan-2-yl)-10-{[(2S,3R,6R)-3-hydroxy-4-(methoxyimino)-6-methyltetrahydro-2H-pyran-2-yl]oxy}-3,5,7,9,11,13-hexamethyl-7-({[2-(2-methyl-5-nitro-1H-imidazol-1-yl)ethyl]carbamoyl}oxy)-6,14-dioxooxacyclotetradecan-4-yl 3-methylbutanoate
N-[(2S,3R,4R,5S,6R)-5-[(2S,3R,4R,5S,6R)-3-amino-5-[(2S,3R,4R,5S,6R)-3-amino-5-[(2S,3R,4R,5S,6R)-3-amino-5-[(2S,3R,4R,5S,6R)-3-amino-5-[(2S,3R,4R,5S,6R)-3-amino-5-[(2S,3R,4R,5S,6R)-3-amino-4,5-dihydroxy-6-(hydroxymethyl)oxan-2-yl]oxy-4-hydroxy-6-(hydroxymethyl)oxan-2-yl]oxy-4-hydroxy-6-(hydroxymethyl)oxan-2-yl]oxy-4-hydroxy-6-(hydroxymethyl)oxan-2-yl]oxy-4-hydroxy-6-(hydroxymethyl)oxan-2-yl]oxy-4-hydroxy-6-(hydroxymethyl)oxan-2-yl]oxy-2-[(2R,3S,4R,5R,6S)-5-amino-6-[(2R,3S,4R,5R,6R)-5-amino-4,6-dihydroxy-2-(hydroxymethyl)oxan-3-yl]oxy-4-hydroxy-2-(hydroxymethyl)oxan-3-yl]oxy-4-hydroxy-6-(hydroxymethyl)oxan-3-yl]carbamate
```

That last compound has the InChIKey `DKPKDPKJVDQUPD-XGBIXEJNSA-M` and cannot be found in Google nor in PubChem.
It looks like this:

![](/assets/images/iupac_626.png)

There are [some closely related compounds](https://pubchem.ncbi.nlm.nih.gov/#query=N-%5B(2S%2C3R%2C4R%2C5S%2C6R)-5-%5B(2S%2C3R%2C4R%2C5S%2C6R)-3-amino-5-%5B(2S%2C3R%2C4R%2C5S%2C6R)-3-amino-5-%5B(2S%2C3R%2C4R%2C5S%2C6R)-3-amino-5-%5B(2S%2C3R%2C4R%2C5S%2C6R)-3-amino-5-%5B(2S%2C3R%2C4R%2C5S%2C6R)-3-amino-5-%5B(2S%2C3R%2C4R%2C5S%2C6R)-3-amino-4%2C5-dihydroxy-6-(hydroxymethyl)oxan-2-yl%5Doxy-4-hydroxy-6-(hydroxymethyl)oxan-2-yl%5Doxy-4-hydroxy-6-(hydroxymethyl)oxan-2-yl%5Doxy-4-hydroxy-6-(hydroxymethyl)oxan-2-yl%5Doxy-4-hydroxy-6-(hydroxymethyl)oxan-2-yl%5Doxy-4-hydroxy-6-(hydroxymethyl)oxan-2-yl%5Doxy-2-%5B(2R%2C3S%2C4R%2C5R%2C6S)-5-amino-6-%5B(2R%2C3S%2C4R%2C5R%2C6R)-5-amino-4%2C6-dihydroxy-2-(hydroxymethyl)oxan-3-yl%5Doxy-4-hydroxy-2-(hydroxymethyl)oxan-3-yl%5Doxy-4-hydroxy-6-(hydroxymethyl)oxan-3-yl%5Dcarbamate),
though.

## Chemicals only published about once

Some [related data was blogged](https://doi.org/10.59350/rzepa.28802) by [Henry Rzepa](https://orcid.org/0000-0002-8635-8390) last week,
with this quote by Lee from CAS:

> 38.5% of the current substances have only 1 reference

Apparently, based on [CAS Registry](https://www.cas.org/support/documentation/chemical-substances) data,
about 1 in 3 chemical structures are only published about once. And two in three are published
about at least twice. I agree with Henry here, with organic chemistry literature in mind, I would have
expected that 38.5% to be higher.

Anyway, since this project is not tracking in which articles IUPAC names are found, I have nothing to study this.

## 1 million IUPAC names

So, the primary goal of this project is to reach one million IUPAC names. We are currently at around 23%.
Not bad, considering we started in Februari. And we have plenty of untouched literature left.

But I also applied [idea 1](https://chem-bla-ics.linkedchemistry.info/2025/04/27/one-million-iupac-names-2-the-100-thousand-milestone.html),
the varying names. The idea is that this was I can explode the number of compounds. In that compounds above,
just the number of variations by enumerating all `OH` replacements with `OMe` and `OEt` would help a lot.

Because I wanted to make sure I could answer positively at the ICCS if we made it to one million
CCZero IUPAC names, I implemented a very simple enumeration script. Really dumb approach. But the
results are interesting. I started with the 200026 names from the milestone. If I
[explode](https://github.com/BlueObelisk/iupac-names/blob/main/explode.groovy) these names,
I get 1,377,127 IUPAC names, well above the target. Even if I remove name variations due to unicode
variations for hyphens, I still have 1,162,107 IUPAC names.

Something interesting I cannot fully understand at this moment yet, however, is the following.
When I calculate the number of unique InChIKeys for the milestone, I get 117,726 keys, and when I do
this for the list of name variations, I get 203,979 keys. So, while the IUPAC name list is about five
times as long, the list of InChIKeys is not even twice as long. Well, I guess that is why this is called
research.
