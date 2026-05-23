---
layout: post
title:  "Cleaner CDK Code #1: List<IAtom> and the for-each loop"
date:   2010-03-07
blogger-link: https://chem-bla-ics.blogspot.com/2010/03/cleaner-cdk-code-1-list-and-for-each.html
doi: 10.59350/jx0j3-s9893
tags: cdk java
---

In a desperate attempt to force me to write on my [CDK](http://cdk.sf.net/) code snippet book, I'm going to write
some code tips to create clear code. Hopefully, this is useful for people writing patches and reviewers alike, too.

## Use List instead of the untyped List

Quite some time ago, the Java language introduced typed lists. These lists can contain only objects of a particular
type, which is a very common use case. Indeed, the CDK has quite a few lists that are strongly typed. Typing the
list prevents you from accidentally adding something of the wrong type, but also reduced the amount of casting, so
that your code becomes cleaner.

Instead of:

```java
List atoms = atomContainer.atoms();
for (int i=0; i<atoms.size(); i++) {
  IAtom atom = (IAtom)atoms.get(i);
  // .. do something
}
```

you can do:

```java
List<IAtom> atoms = atomContainer.atoms();
for (int i=0; i<atoms.size(); i++) {
  IAtom atom = atoms.get(i);
  // .. do something
}
```

## If you do not need the index, use a for-each loop

When iterating over atoms in a list, you sometimes need to know the index, for example, to compare the IAtom with
that at the same position in another list. However, when this is not needed, you can use the Java
[for-each loop](http://java.sun.com/j2se/1.5.0/docs/guide/language/foreach.html) instead. This will further
simplify the above code to:

```java
for (IAtom atom : atomContainer.atoms()) {
  // .. do something
}
```
