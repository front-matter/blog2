---
layout: post
title:  "MetWare screenshot: spectrum support"
date:   2008-08-20
blogger-link: https://chem-bla-ics.blogspot.com/2008/08/metware-screenshot-spectrum-support.html
doi: 10.59350/9m75g-4rh11
tags: metware xml java
image: /assets/images/msTable.png
modified_date: 2025-10-11
---

Not visually attractive, but that will be solved when Steffen gets his hands on it. For now, I'm happy with a table formatting.
Reason: it uses XML Schema to define a dataType, which is recognized by our code generators in [MetWare](http://www.metware.org/)
(see also [this presentation <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2008/05/16/metware-status-report.html)), and used to create a easy to use Java API, which, in turn, can be used in this JSF snippet:

```xml
<h:dataTable value="#{metobservCharacterizationMassspectrum.spectralPoints.points}" var="specpoint">
  <h:column>
    <f:facet name="header"><h:outputText value="m/z's"/></f:facet>
    <h:outputText value="#{specpoint.mz}"/>
  </h:column>
  <h:column>
    <f:facet name="header"><h:outputText value="Intensities"/></f:facet>
    <h:outputText value="#{specpoint.intensity}"/>
  </h:column>
</h:dataTable>
```

The `<dataTable> @value` points (via the `faces-config.xml`) to the `MetobservCharacterizationMassspectrumBean`, which has a
`getSpectralPoints()` method (autocreated from the `<skos:Concept>` `SpectralPoints`, which has a convenience method
`List<SpectralPoint> getPoints()`.

`SpectralPoint` in turn has the methods `getIntensity()` and `getMz()` also used in the above JSF snippet. For convenience,
`SpectralPointArray` also has two other methods: `double[] getIntensities()` and `double[] getMzs()` (which I'll have to
rename to reuse the code for NMR support :).

So, here's the outcome:

![](/assets/images/msTable.png)

Final note, given the dataType, the MetWare bean also has the logic to convert the data back and forth into a SQL serialization,
which may eventually use base64 encoding, but currently looks like *61.0,100.0;62.0,1.1*, as defined by the regular expression of
the XSD dataType for spectralPointArray.
