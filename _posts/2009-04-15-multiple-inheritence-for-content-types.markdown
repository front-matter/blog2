---
layout: post
title:  "Multiple inheritence for content types?"
date:   2009-04-15
blogger-link: https://chem-bla-ics.blogspot.com/2009/04/multiple-inheritence-for-content-types.html
doi: 10.59350/p57j8-4wd14
tags: cdk bioclipse
---

[Bioclipse](http://www.bioclipse.net/) is an environment for handling and processing life sciences data. This data is present
in files with a wide variety of formats, each of which can contain a particular data type. For example, a we can have a single
molecule in *MDL molfile* and in *[CML](http://en.wikipedia.org/wiki/Chemical_Markup_Language)*.

The latter is particularly interesting, as I do not know how to work that out... Firstly, I want the *CML (Single Molecule)*
content type extend the CML content type, so that a [validating CML editor](http://chemicalrcp.blogspot.com/2009/01/editing-and-validation-of-cml-documents.html)
can open it with the proper schema, but at the same time I would like to extend it a content type representation a
*Single Molecule*. Hence, the multiple inheritance.

This is what the [plugin.xml](http://bioclipse.svn.sourceforge.net/viewvc/bioclipse/bioclipse2/trunk/plugins/net.bioclipse.cml/plugin.xml) currently looks like:

```xml
<extension
  point="org.eclipse.core.runtime.contentTypes">

  <content-type
    base-type="net.bioclipse.contenttypes.cml"
    id="net.bioclipse.contenttypes.cml.singleMolecule2d"
    name="CML (Single 2D Molecule)"
    priority="high">
    <describer class="net.bioclipse.cml.contenttypes.CmlFileDescriber">
      <parameter
        name="dimension"
        value="2D"/>
      <parameter
        name="cardinality"
        value="single"/>
    </describer>
  </content-type>

</extension>
```

Very clearly, a single base-type. Is there any option of multiple inheritance?
