---
layout: post
title:  "Next generation asynchronous webservices"
date:   2008-10-31
modified_date: 2025-09-10
blogger-link: https://chem-bla-ics.blogspot.com/2008/10/next-generation-asynchronous.html
doi: 10.59350/7gx9j-dn554
tags: bioclipse xmpp soap http inchikey:VPPJLAIAVCUEMN-GFCCVEGCSA-N
image: /blog/assets/images/cdkxwsPsi.png
---

Johannes joined a [Bioclipse Workshop](http://wiki.bioclipse.net/index.php?title=Outcome_of_the_Bioclipse_autumn_workshop_2006) a long time
ago, and introduced the participants to the idea of using [XMPP](http://xmpp.org/) (aka Jabber) for asynchronous web services.
[SOAP](http://en.wikipedia.org/wiki/SOAP_(protocol)) is commonly user to run webservices over [HTTP](http://en.wikipedia.org/wiki/HTTP),
but via (SMTP) email and XMPP is possible too (see [SOAP over XMPP](http://xmpp.org/extensions/xep-0072.html)). Using HTTP as transport
layer has problems. The biggest problem, is possibly that HTTP connections are timed out, e.g. by intermediate router. This makes it
rather unsuited for long running jobs. Workarounds are easy to come up with, and *polling* is a common solution.

Johannes ideas solve this limitation by using the general XMPP protocol for chatting:

<dl>
<dt><span style="color:red; font-weight: bold">client</span></dt>
  <dd>he, can you do something for me?</dd>
<dt><span style="color:darkgreen; font-weight: bold">service</span></dt>
  <dd>sure, I can do <b>generate3Dcoordinates</b> and <b>generateSMILES</b>.</dd>
<dt><span style="color:red; font-weight: bold">client</span></dt>
  <dd>ah, nice! what input does <b>generate<a href="http://www.opensmiles.org/">SMILES</a></b> take? and the output?</dd>
<dt><span style="color:darkgreen; font-weight: bold">service</span></dt>
  <dd>input: <a href="http://en.wikipedia.org/wiki/Chemical_Markup_Language">CML</a>, output a simple string.</dd>
<dt><span style="color:red; font-weight: bold">client</span></dt>
  <dd>ok, here's the CML</dd>
<dt><span style="color:darkgreen; font-weight: bold">service</span></dt>
  <dd>I'm done now. sorry that it took 10 minutes, but I'm running Vista...</dd>
<dt><span style="color:red; font-weight: bold">client</span></dt>
  <dd>excellent, please send me the results</dd>
<dt><span style="color:darkgreen; font-weight: bold">service</span></dt>
  <dd>ok, here is the SMILES for <a href="http://en.wikipedia.org/wiki/Lacosamide">lacosamide</a>: <span class="chem:smiles">CC(=O)N[C@H](COC)C(=O)NCC1=CC=CC=C1</span></dd>
</dl>

Well, the important bit is in the last line. A job may take lone, even on clusters. The client might have to reboot meanwhile (possibly
because of critical security updates)... the *service* will just continue, and send you a message when done. If you just happen to be
offline, it will send a message when you are back online.

Johannes ideas led to the [IO-DATA proposal](http://xmpp.org/extensions/xep-0244.html) (XEP-0244), which is currently marked experimental
and being discussed on the [ws-xmpp](http://mail.jabber.org/mailman/listinfo/ws-xmpp) mailing list. He gathered a few people around
him to get it going, resulting in working stuff! Yeah!

## Chemistry Development Kit XWS

Besides contributing to the proposal, I am also involved in this project by writing XMPP-webservices, for the
[CDK](https://cdk.github.io/). This brings me to [cdk-xws](https://cdk.svn.sourceforge.net/svnroot/cdk/cdk-xws/trunk@12888), which is
the project to bring CDK functionality online as webservices using IO-DATA.

![](/blog/assets/images/cdkxwsPsi.png)

This shows three nodes, the first being the CDK service, with two functions, of which I only implemented one yet.

For the curious, this is what the XMPP messages look like:

```xml
<iq from="egonw@ws1.bmc.uu.se/home"
    id="JSO-0.12.5-6"
    to="cdk.ws1.bmc.uu.se"
    type="set">
  <command xmlns="http://jabber.org/protocol/commands"
           action="execute"
           node="calculateMass">
    <iodata xmlns="urn:xmpp:tmp:io-data"
            type="input">
      <in>
        <smiles xmlns="urn:xws:cdk:input">CCC</smiles>
      </in>
    </iodata>
  </command>
</iq>
<iq from="cdk.ws1.bmc.uu.se"
    id="JSO-0.12.5-6"
    to="egonw@ws1.bmc.uu.se/home"
    type="result"
    xml:lang="en">
  <command xmlns="http://jabber.org/protocol/commands"
           node="calculateMass"
           sessionid="XWS-1"
           status="completed">
    <iodata xmlns="urn:xmpp:tmp:io-data"
            type="output">
      <out>
        <mass>36.032207690364004</mass>
      </out>
    </iodata>
    <note type="info">Done</note>
  </command>
</iq>
```
