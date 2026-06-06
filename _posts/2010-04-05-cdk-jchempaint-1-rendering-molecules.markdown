---
layout: post
title:  "CDK-JChemPaint #1: rendering molecules"
date:   2010-04-05
blogger-link: https://chem-bla-ics.blogspot.com/2010/04/cdk-jchempaint-1-rendering-molecules.html
doi: 10.59350/zp98c-wkb92
tags: cdk jchempaint inchikey:QWENRTYMTSOGBR-UHFFFAOYSA-N
image: /assets/images/triazole.png
---

I [reported earlier](http://chem-bla-ics.blogspot.com/search?q=jchempaint) that the CDK-JChemPaint patch is now a clean add-on from the CDK releases.
This means that you download [cdk-1.3.4.jar](https://sourceforge.net/projects/cdk/files/cdk%20%28development%29/1.3.4/) and
[cdk-jchempaint-8.jar](https://sourceforge.net/projects/cdk/files/CDK-JChemPaint/8/) separately, put them in your class path, and get started
with, for example, Groovy:

```shell
$ export CLASSPATH=cdk-1.3.4.jar:cdk-jchempaint-8.jar
$ groovy renderMol.groovy
```

![](/assets/images/triazole.png)

I have tuned to code in [this tutorial](https://sourceforge.net/apps/mediawiki/cdk/index.php?title=Renderer_Tutorial-Single_Molecules)
by [Gilleain](https://gilleain.blogspot.com/) a bit, resulting in this code:

```groovy
import java.util.List;

import java.awt.*;
import java.awt.image.*;

import javax.imageio.*;

import org.openscience.cdk.*;
import org.openscience.cdk.interfaces.*;
import org.openscience.cdk.layout.*;
import org.openscience.cdk.renderer.*;
import org.openscience.cdk.renderer.font.*;
import org.openscience.cdk.renderer.generators.*;
import org.openscience.cdk.renderer.visitor.*;
import org.openscience.cdk.templates.*;

int WIDTH = 600;
int HEIGHT = 600;

// the draw area and the image should be the same size
Rectangle drawArea = new Rectangle(WIDTH, HEIGHT);
Image image = new BufferedImage(
  WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB
);

IMolecule triazole = MoleculeFactory.make123Triazole();
StructureDiagramGenerator sdg = new StructureDiagramGenerator();
sdg.setMolecule(triazole);
sdg.generateCoordinates();
triazole = sdg.getMolecule();

// generators make the image elements
List generators = new ArrayList();
generators.add(new BasicSceneGenerator());
generators.add(new BasicBondGenerator());
generators.add(new BasicAtomGenerator());

// the renderer needs to have a toolkit-specific font manager
AtomContainerRenderer renderer =
  new AtomContainerRenderer(generators, new AWTFontManager());

// the call to 'setup' only needs to be done on the first paint
renderer.setup(triazole, drawArea);

// paint the background
Graphics2D g2 = (Graphics2D)image.getGraphics();
g2.setColor(Color.WHITE);
g2.fillRect(0, 0, WIDTH, HEIGHT);

// the paint method also needs a toolkit-specific renderer
renderer.paint(triazole, new AWTDrawVisitor(g2));

ImageIO.write((RenderedImage)image, "PNG", new File("triazole.png"));
```
