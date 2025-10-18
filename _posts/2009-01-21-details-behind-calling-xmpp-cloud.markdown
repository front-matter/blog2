---
layout: post
title:  "Details behind the \"Calling XMPP cloud services from Taverna2\""
date:   2009-01-21
blogger-link: https://chem-bla-ics.blogspot.com/2009/01/details-behind-calling-xmpp-cloud.html
doi: 10.59350/1zmv1-tnn62
tags: xmpp taverna
---

On Monday I showed [two screenshot](http://chem-bla-ics.blogspot.com/2009/01/calling-xmpp-cloud-services-from.html) showing our
[new XMPP-based web/cloud services](http://chem-bla-ics.blogspot.com/2009/01/calling-xmpp-cloud-services-from.html) in action
inside [Taverna](http://taverna.sf.net/).

I promised details, but realize I have actually already posted a lot of them [in October](http://chem-bla-ics.blogspot.com/2008/10/next-generation-asynchronous.html):

> Johannes ideas led to the [IO-DATA proposal](http://xmpp.org/extensions/xep-0244.html) (XEP-0244), which is currently
> marked experimental and being discussed on the ws-xmpp mailing list. He gathered a few people around him to get it going,
> resulting in working stuff! Yeah!

[Joerg](http://miningdrugs.blogspot.com/) [asked](http://friendfeed.com/e/a15e79ac-92ce-4b16-81d9-8f7b6ec1ea24/chem-bla-ics-Calling-XMPP-cloud-services-from/)
*Could you post more results, what is it, why do we need it, e.g. why are you mentioning SOAP and cloud? Do not know enough to see the bonus right now.*

**What is it?** IO-DATA is a protocol on top of the XMPP protocol to allow machine-to-machine communication. Actually,
much like SOAP, RPC, and other platforms. How IO-DATA differs lies to some extend to the transport layer: instead of
using HTTP, it used the XMPP transport protocol, also used for Jabber chat clients. It basically allows clients like
Taverna to chat with services running elsewhere.

**Why do we need it?** Most services run over HTTP, making them web services. This is convenient, because there is
much infrastructure around, like web browsers. REST services also take advantage of this. However, for heavy
computing this sometimes leads to problems. For example, routers are known to have time outs on HTTP connections.
To solve this, SOAP services often introduce a polling mechanism. IO-DATA takes a different approach. Instead of
having to ask all the time how a calculation is doing, you can just wait for the service to send you a message
when it is done. Instead of working around the lack of asynchronous aspects, IO-DATA introduces these in the protocol.

Other interesting features include that the IO-DATA integrates the interface formats for services into the service
itself, SOAP needs WSDL for this, and that it features service discovery via DISCO. The latter is done with SOAP
too, for example with UDDI and BioMoby. The latter also adds strong data typing for input and output of services.

IO-DATA addresses the data typing by allowing asking the service what XML Schema it uses for input and output.
While XML Schema has alternative, and which may be prefered in some situations, it does allow strong data typing
and supports [a lot of formats in life sciences](http://friendfeed.com/e/2d322ac5-a5b9-4336-b421-fede0eb8e192/Hi-Guys-I-m-looking-for-an-exhaustive-resource-of/)
(which I'll summarise soon).

Moreover, if there just happens not to be a suitable schemata around, you can just define one yourself, which can
be as simple as a single element wrapper around some custom text-based format. You worry about supporting many
formats? Well, no need. Johannes' xws4j library, which I used for the Taverna plugin too, allows compiling a Java
binding code. Bioclipse's script environment allows you do to this on the fly: you find a service, ask for the
schema, compile bindings for input and output, set up the input with the input binding, send it of to the service,
and use the output binding for convenient access to the computation results. Without having to reboot Bioclipse.
Isn't that **cool**? Can your software do that? (See [this example Gist](http://gist.github.com/22185): the io
factory creates the binding).

**Why do I mention SOAP and the cloud?** It should be clear from the above why I mention SOAP: it offer the same
functionality, but more conveniently, we think. I mention cloud here, to refer to cloud computing which is doing
computation on the cloud, which is a synonym for the internet (see
[Cloud Computing @ Wikipedia](http://en.wikipedia.org/wiki/Cloud_computing)). Because it does
not use HTTP, we do not feel we can call it web service. Instead, cloud computing is a more general term, not
tied to any particular architecture. IO-DATA is just one possible architecture, one we think is promising for
life science applications.
