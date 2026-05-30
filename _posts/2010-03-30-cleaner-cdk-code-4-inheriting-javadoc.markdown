---
layout: post
title:  "Cleaner CDK Code #4: inheriting JavaDoc from super classes and interfaces"
date:   2010-03-30
blogger-link: https://chem-bla-ics.blogspot.com/2010/03/cleaner-cdk-code-4-inheriting-javadoc.html
doi: 10.59350/27xt0-12j30
tags: cdk java javadoc
---

When you write a class implementing an interface or extending a super class, it is often the case that the API is
identical. It would be nice to inherit the JavaDoc documentation, which is possible.

## Inheriting JavaDoc
Java method that overwrite a superclass method or implement an interface method, can inherit JavaDoc by including this JavaDoc for that method:

```java
/** {@inheritDoc} */
@TestMethod("testGetMIMEType")
public String getMIMEType() {
  return null;
}
```

The JavaDoc documentation [notes](http://java.sun.com/j2se/1.4.2/docs/tooldocs/windows/javadoc.html#inheritingcomments) that
missing @param and @return values are inherited implicitly since JavaDoc 1.3, but I have never noticed this in Java6. The
above *explicit* markup is confirmed to work.
