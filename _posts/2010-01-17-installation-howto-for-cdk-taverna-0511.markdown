---
layout: post
title:  "Installation HOWTO for CDK-Taverna 0.5.1.1 in Taverna 1.7.2"
date:   2010-01-17
blogger-link: https://chem-bla-ics.blogspot.com/2010/01/installation-howto-for-cdk-taverna-0511.html
doi: 10.59350/jmd0y-ghc30
tags: cdk taverna
---

[Thomas](http://cdktaverna.wordpress.com/) made a [new release of CDK-Taverna](http://cdktaverna.wordpress.com/2010/01/17/cdk-taverna-version-0-5-1-1-released/)
for the [Taverna](http://www.taverna.org.uk/) 1.7.2 release, which is great news as the previous release was for Taverna 1.7.1.

He asked me to test it, and I installed a fresh Taverna install and the new plugin. After that, I used the [MyExperiment](http://myexperiment.org/)
plugin to download one of the [CDK-Taverna workflows Thomas has on MyExperiment](http://www.myexperiment.org/search?query=cdk-taverna&type=workflows),
and tuned it a bit to use some local input instead of the database. I took some screenshots while at it, and will use those now to talk you through the
installation of Taverna and the [CDK-Taverna](http://cdk-taverna.de/) plugin.

### Download Taverna

Taverna 1.7.2 can be downloaded from [this download page](http://www.mygrid.org.uk/tools/taverna/taverna-1/taverna-download/), but I took the
Linux version from the [SourceForge download site](http://sourceforge.net/projects/taverna/files/taverna/1.7.2/). I cannot detail the OS/X or
Windows installation, but on Linux you simply unzip the downloaded file, and you're ready to go:

```shell
$ cd taverna-1.7.2/
$ sh runme.sh
```

### Plugin Installation

Plugins can be installed using with the *Plugin manager* which can be accessed via the *Tools* menu:

![](/assets/images/cdktav4.png)

Clicking the *Find New Plugins* takes you to a second dialog listing known plugin sites, and the default download has several already:

![](/assets/images/cdktav1.png)

The CDK-Taverna update site is available at *http://cdk-taverna.de/plugin/*, and we can make Taverna aware of this update site by clicking the
*Add Plugin Site* button:

![](/assets/images/cdktav.png)

After filling out these values and approving it with the *OK* button, it will show up on the dialog showing all available plugins,
where you need the check the check box in front of the CDK-Taverna plugin name, as done in this screenshot:

![](/assets/images/cdktav2.png)

You can then hit the *Install* button after which the plugin will be downloaded:

![](/assets/images/cdktav3.png)

After it is done downloading the plugin, you can close the *Plugin Sites* and *Plugin Manager* dialogs. I shutdown and restarted Taverna with
`sh runme.se`, but not entirely sure this is needed. After that, the CDK nodes showed up in the list of Taverna processors:

![](/assets/images/cdktav5.png)

### MyExperiment Plugin

Using the same Taverna *Plugin Manager* you can also install the MyExperiment plugin that allows you to search, browse, preview and download
Taverna workflows from the MyExperiment website from within Taverna itself. I installed the plugin, and then used it to search for CDK workflows
(and downloaded a QSAR workflow):

![](/assets/images/cdktav6.png)

This about everything to get you going. It's not particularly rocket science, but I guess this howto is useful as you get to see what
you should expect when setting up a CDK-Taverna environment. If you have further questions, please leave those in the comments section,
and I'll try to merge in answers where possible, or otherwise in the reactions too.
