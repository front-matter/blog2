---
layout: post
title:  "\"LAST CALL: XEP-0244 (IO Data)\""
date:   2009-08-13
blogger-link: https://chem-bla-ics.blogspot.com/2009/08/last-call-xep-0244-io-data.html
doi: 10.59350/y1ka2-ad976
tags: xmpp bioinfo cheminf
---

Today I received this email, which is a milestone for the [XMPP](http://en.wikipedia.org/wiki/Extensible_Messaging_and_Presence_Protocol)
(aka Jabber) work Johannes, Ola and I have been working on as SOAP alternative using the intrinsically asynchronous XMPP as transport
protocol instead of HTTP as SOAP commonly does (see
[Next generation asynchronous webservices](http://chem-bla-ics.blogspot.com/2008/10/next-generation-asynchronous.html)):

> This message constitutes notice of a Last Call for comments on XEP-0244 (IO Data).
>
> Abstract: This specification defines an XMPP protocol extension for handling the input to and output from a remote entity.
>
> URL: [http://www.xmpp.org/extensions/xep-0244.html](https://www.xmpp.org/extensions/xep-0244.html)
>
> This Last Call begins today and shall end at the close of business on 2009-09-01.
>
> Please consider the following questions during this Last Call and send your feedback to the standards @ xmpp.org discussion list:
>
> 1. Is this specification needed to fill gaps in the XMPP protocol stack or to clarify an existing protocol?
> 2. Does the specification solve the problem stated in the introduction and requirements?
> 3. Do you plan to implement this specification in your code? If not, why not?
> 4. Do you have any security concerns related to this specification?
> 5. Is the specification accurate and clearly written?
>
> Your feedback is appreciated!

There remains quite a lot to do, and you are more than welcome to join in the project. There is a Java library and we've
integrated the specs into [Bioclipse](http://www.bioclipse.net/) and [Taverna](http://taverna.sf.net/) (see
[Details behind the "Calling XMPP cloud services from Taverna2"](http://chem-bla-ics.blogspot.com/2009/01/details-behind-calling-xmpp-cloud.html)),
but there is no support for BioCatalogue yet, and no libraries for other programming language yet.
