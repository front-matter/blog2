---
layout: post
title:  "Chemical Editing..."
date:   2008-10-20
blogger-link: https://chem-bla-ics.blogspot.com/2008/10/chemical-editing.html
doi: 10.59350/dvb9w-vg635
image: /blog/assets/images/jcpRenderingRequirements.png
tags: jchempaint cdk
---

As you might have seen, we, [Uppala](http://www.bioclipse.net/) and the [EBI](http://www.ebi.ac.uk/steinbeck/), are working on the next generation
[JChemPaint](https://apps.sourceforge.net/mediawiki/cdk/index.php?title=JChemPaint). JChemPaint is an editor, and therefore, consists of a model
(`IChemModel`), a view (`IRenderer`) and a controller (`IController`). See the many posts in [Gilleain's blog](http://gilleain.blogspot.com/).

For the renderer I have set up a [wiki page](https://apps.sourceforge.net/mediawiki/cdk/index.php?title=JChemPaint_Rendering_Modules)
which I'll be hacking in the next days, which shows how a `IChemObject` content should be rendered in JChemPaint. It looks like:

![](/blog/assets/images/jcpRenderingRequirements.png)

The `IController` is a rather important part too, and like the `IRenderer` bit of JChemPaint, needs a major overhaul. The new design,
discussed by Gilleain [here](http://gilleain.blogspot.com/2008/09/interface-relays-and-controller-modules.html) and
[here](http://gilleain.blogspot.com/2008/09/current-controller-architecture.html), should, IMHO, look like:

![](/blog/assets/images/Jcp_editing.png)

In this diagram, the gestures can come from any input device, mouse, tracking ball, Wiimote, and will result in events in some
widget library (SWT, AWT shown). The old JChemPaint, converted the Swing `MouseEvent`'s directly into `IChemObject` modifications,
making the code incompatible with SWT. This is why the *Chemical Editing Events* layer must be added.

Events in this layer look like `addAtom(attachementAtom, coordinates)` and `setFormalCharge(atom, newCharge)`.
The link to scripting should be clear now, and will help use write unit tests for this layer.
