---
layout: post
title:  "Autogenerating CML bindings for XMPP services with XMLBeans"
date:   2009-03-14
blogger-link: https://chem-bla-ics.blogspot.com/2009/03/autogenerating-cml-bindings-for-xmpp.html
doi: 10.59350/et43s-kc120
tags: cml java ubuntu xml xmpp
image: /blog/assets/images/ppa.png
---

I blogged earlier about our efforts to create a better [SOAP](http://en.wikipedia.org/wiki/SOAP)
service architecture, based on [XMPP](http://en.wikipedia.org/wiki/Jabber):

* [Details behind the "Calling XMPP cloud services from Taverna2"](http://chem-bla-ics.blogspot.com/2009/01/details-behind-calling-xmpp-cloud.html)
* [Calling XMPP cloud services from Taverna2](http://chem-bla-ics.blogspot.com/2009/01/calling-xmpp-cloud-services-from.html)
* [Next generation asynchronous webservices](http://chem-bla-ics.blogspot.com/2008/10/next-generation-asynchronous.html)

So, I set up XMPP services for QSAR descriptor calculation, 2D diagram and 3D geometry
calculations and a few more, using the [CDK](http://cdk.sf.net/).
[Chemical Markup Language](http://en.wikipedia.org/wiki/Chemical_Markup_Language) has been my
primary choice for some 10 years now (see [Peter's blog](http://wwmm.ch.cam.ac.uk/blogs/murrayrust/?p=1241))
as it allows me to do things I cannot do in other formats.

Now, our XMPP services publish themselves what data types the allow as input and what they output
in return. They do this by publishing XML Schema to describe the input and output types. My CDK
services use CML, so they return the CML schema. Johannes' [xws4j](http://xws4j.sourceforge.net/)
implementation of the [IO-DATA](http://xmpp.org/extensions/xep-0244.html)
specification has an add on that can build bindings to the schema on the fly. Now, CML comes with
a good [XOM](http://www.xom.nu/)-based binding (called [CMLXOM](http://wwmm.ch.cam.ac.uk/maven2/cml/cmlxom/))
so this is not strictly necessary, but for less common schemata it is worthwhile: you can always
create bindings for brand new schemata, for older versions, for whatever. Services can even
create their own local schemata, and people will still be able to easily use them. This is to me
a big plus for this architecture.

Anyway, while CMLXOM exists, we wanted to show that the on-the-fly creation of bindings works,
even for large schemata, such as CML. However, one of the older flavours had an small error in a
regular expression in a data type CML defines. Johannes therefore asked me to test building
bindings for the CML schema version used in my services. He adviced me to use scomp for this,
which is a command line utility around the [XMLBeans](http://xmlbeans.apache.org/)
library used for the binding generation.

As I am running [Ubuntu](http://www.ubuntu.com/), I preferred installing
[the packaged version](http://packages.ubuntu.com/jaunty/libxmlbeans-java) instead of installing
the binary provided by XMLBeans. Now, after I did this, I noticed that this .deb did not install
the scomp utility, so I filled a [wishlist bug report](https://bugs.launchpad.net/ubuntu/+source/xmlbeans/+bug/342349).
Earlier this week I already encountered another bug, but this package being Java, I had a good
idea on how to fix the bug.

And so I implemented my own wishlist. I'm sure there is room for improvement, as my .deb
packaging skills are a bit rusty (a very long time ago I have been in the Debian New Maintainers
queue, but by the time they solved the long queue delays, I was too occupied with other things.
Yes, this was a long time ago already :). Anyway, Ubuntu's [LaunchPad](http://launchpad.net/)
has a nice feature, called the [Personal Package Archives](http://launchpad.net/ubuntu/+ppas).
This service will, after I have finished hacking on the packaging specs in the famous *debian/*
folder and tested the *.debs* build from it, will rebuild it and put the resulting package up for
download.

Conclusion: a perfect opportunity to finally gives this a try. The learning curve was
surprisingly shallow, and the result can be seen in [my personal package archive](https://launchpad.net/~egonw/+archive/ppa):

![](/blog/assets/images/ppa.png)

Now, you can easily imagine that I will soon work on packaging stuff I did in the past too, such
as update [libcdk-java](http://packages.ubuntu.com/jaunty/libcdk-java) and now that OpenJDK in
main can run [Jmol](http://www.jmol.org/) reasonably, finally package Jmol for main. I just hope
I remember my [Alioth](http://alioth.debian.org/) account, so that I can properly contribute to
the [debichem](http://alioth.debian.org/projects/debichem/) project.

Getting back to running *scomp* on the CML scheme, it works with one minor problem:

```shell
$ scomp -src . -d .  cml.xsd
/home/egonw/tmp/cml/cml.xsd:10098:9: warning: p-props-correct.2.2: maxOccurs must be greater than or equal to 1.
Time to build schema type system: 1.792 seconds
Time to generate code: 3.297 seconds
Time to compile code: 9.658 seconds
```

The problem is reflected by line 10098 which goes like:

```xml
<xsd:sequence minOccurs="0" maxOccurs="0">
```

which can be traced down to line 23 in [schema2/trunk/elements/tableHeaderCell.xsd](http://cml.svn.sf.net/viewvc/cml/schema2/trunk/elements/tableHeaderCell.xsd?revision=161&view=markup).
I filled a [bug report about this](https://sourceforge.net/tracker2/?func=detail&aid=2686810&group_id=51361&atid=463005).
