---
layout: post
title:  "Oscar4 Java API: chemical name dictionaries"
date:   2010-10-28
modified_date: 2026-05-05
doi: 10.59350/866tq-qv177
blogger-link: https://chem-bla-ics.blogspot.com/2010/10/oscar4-java-api-chemical-name.html
tags: oscar java chebi inchikey:XLYOFNOQVPJJNP-UHFFFAOYSA-N inchikey:QTBSBXVTEAMEQO-UHFFFAOYSA-N
---

Besides getting Oscar used by [ChEBI](http://www.ebi.ac.uk/chebi/) (hopefully [via Taverna <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/10/21/oscar-text-mining-in-taverna.html)),
my main task in [my three month Oscar project <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/10/15/working-on-oscar-for-three-months.html)
is to refactor things to make it more modular, and remove some features no longer needed (e.g. an automatically created workspace environment).
Clearly, I need to define a lot of [new unit tests <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/10/26/multiple-unit-test-inheritance-with.html)
to ensure my assumptions on how to code works are valid.

So, what are the API requirements set out? These include (but are not limited to):

* have reasonable defaults
* being able to add custom dictionaries
* easily change the chemical entity recogniser
* plugin text normalization (see [Peter's post on UNICODE <i class="fa-solid fa-recycle fa-xs"></i>](https://blogs.ch.cam.ac.uk/pmr/2010/10/24/the-absolute-minimum-every-scientist-with-data-absolutely-positively-must-know-about-unicode-and-character-sets-no-excuses/))

This week I worked on the dictionary refactoring, and talked with Lezan about the [ChemicalTagger](http://www-ucc.ch.cam.ac.uk/products/software/chemicaltagger)
and trying to get this based on the newer Oscar code (I think we'll be able to finish that today). So, I cleaned up
some code I did in the first week, and introduced [a Oscar class](https://bitbucket.org/wwmm/oscar4/src/bf79fd11045c/oscar4-api/src/main/java/uk/ac/cam/ch/wwmm/oscar/Oscar.java)
providing a Java API to the Oscar functionality.

So, to get started with Oscar in your application, you only need to do:

```java
Oscar oscar = new Oscar(
  this.getClass().getClassLoader()
);
oscar.loadDefaultDictionaries();
Map<NamedEntity,String> structures =
  oscar.getNamedEntities(
    "Ingredients: acetic acid, water."
  );
```

The ClassLoader is needed because the Oscar class will not generally know how to load custom classes.

You can add additional dictionaries, by implementing the [IChemNameDict](https://bitbucket.org/wwmm/oscar4/src/tip/oscar4-chemnamedict/src/main/java/uk/ac/cam/ch/wwmm/oscar/chemnamedict/IChemNameDict.java)
interface and one or more of [IInChIProvider](https://bitbucket.org/wwmm/oscar4/src/tip/oscar4-chemnamedict/src/main/java/uk/ac/cam/ch/wwmm/oscar/chemnamedict/IInChIProvider.java),
[ISMILESProvider](https://bitbucket.org/wwmm/oscar4/src/tip/oscar4-chemnamedict/src/main/java/uk/ac/cam/ch/wwmm/oscar/chemnamedict/ISMILESProvider.java),
and [ICMLProvider](https://bitbucket.org/wwmm/oscar4/src/tip/oscar4-chemnamedict/src/main/java/uk/ac/cam/ch/wwmm/oscar/chemnamedict/ICMLProvider.java).
For example, adding the OPSIN dictionary would extend the above code to:

```java
Oscar oscar = new Oscar(
  this.getClass().getClassLoader()
);
oscar.loadDefaultDictionaries();
oscar.getChemNameDict().register(
  new OpsinDictionary()
);
Map<NamedEntity,String> structures =
  oscar.getNamedEntities(
    "Ingredients: acetic acid, water."
  );
```

And, I think the `oscar.getChemNameDict()` method will be renamed to something like `oscar.getDictionaryRegistry()` really soon.
