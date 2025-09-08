---
layout: post
title:  "Bioclipse2 Scripting #1: from SMILES to a UFF optimized structure in Jmol"
date:   2008-10-25
blogger-link: https://chem-bla-ics.blogspot.com/2008/10/bioclipse2-scripting-1-from-smiles-to.html
doi: 10.59350/5azgt-k8a94
tags: bioclipse cml cdk jmol eclipse github cheminf
image: /blog/assets/images/mashupCmldomJmolCDK.png
---

After some difficulties this week with making an export of [CDK](http://cdk.sf.net/) plugins in the
[Bioclipse2](http://www.bioclipse.net/) *Cheminformatics feature* of with the [cdk-eclipse](http://cdk.svn.sourceforge.net/viewvc/cdk/cdk-eclipse/trunk/)
software, I got the following cute Bioclipse2 script up and running:

```javascript
dimethylether = cdk.fromSMILES( "COC" );
cdk.addExplicitHydrogens( dimethylether );
cdk.generate3dCoordinates( dimethylether );

// save as CML
cdk.saveCML( dimethylether, "/Virtual/dimethylether.cml" );
ui.open( "/Virtual/dimethylether.cml" ); // this should open a JmolEditor

jmol.minimize();
```

You can see four of my favorite cheminformatics tools integrated: CDK is used to convert a SMILES into connection table with add explicit
hydrogens, and to create initial 3D coordinates (with the code from Christian Hoppe, and thanx to Stefan for fixing that code in the
CDK 1.1.x branch!). Then, [CMLDOM](http://cml.sourceforge.net/) is used to create and save a CML document, which is then opened into a
[Jmol](http://www.jmol.org/) editor in Bioclipse.

A variation of this script is visible in the following screenshot:

![](/blog/assets/images/mashupCmldomJmolCDK.png)

This and other Bioclipse2 scripts I will post in [Gist](http://gist.github.com/), a sort of [pastebin](http://en.wikipedia.org/wiki/Pastebin)
supporting version history, and I'll tag them with *bioclipse gist* on [delicious](http://delicious.com/egonw/), so that you can always
browse them, comment on them, or add your own gists at
[http://delicious.com/tag/bioclipse+gist](http://delicious.com/tag/bioclipse+gist).
