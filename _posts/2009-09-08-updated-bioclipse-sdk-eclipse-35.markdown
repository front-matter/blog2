---
layout: post
title:  "Updated Bioclipse SDK: the Eclipse 3.5 version"
date:   2009-09-08
blogger-link: https://chem-bla-ics.blogspot.com/2009/09/updated-bioclipse-sdk-eclipse-35.html
doi: 10.59350/hx839-f4h59
tags: bioclipse eclipse java
image: /blog/assets/images/newBCProject2.png
---

Last Friday, the Bioclipse 2.1 development series moved to [Eclipse 3.5](http://update.eclipse.org/downloads/drops/R-3.5-200906111540/eclipse-news-all.html),
so I had to update the [Bioclipse SDK](http://wiki.bioclipse.net/index.php?title=Bioclipse_SDK) too, which
[we developed earlier](http://chem-bla-ics.blogspot.com/2009/08/making-bioclipse-development-easier-new.html).

With a new Eclipse version also comes new screenshots to talk you through the process of setting up a new
[Bioclipse manager](http://wiki.bioclipse.net/index.php?title=How_to_make_a_manager_2) plugin.

### Step 1

Right click in your workspace navigator, and choose *New -> Project*:

![](/blog/assets/images/newBCProject.png)

### Step 2

And select to create a new *Plug-in Project*:

![](/blog/assets/images/newBCProject1.png)

### Step 3

Give a project name, such as *net.bioclipse.xml*:

![](/blog/assets/images/newBCProject2.png)

### Step 4

Tune the `ID`, `Version`, `Name`, and `Provider` to your liking:

![](/blog/assets/images/newBCProject3.png)

### Step 5

Then select *Bioclipse Manager*:

![](/blog/assets/images/newBCProject4.png)

### Step 6

The next wizard page is specific the the Bioclipse manager, and asks a manager namespace, which will be used as prefix in the JavaScript Console.
For example, if I make the namespace `xml`, then I will type `xml.someMethod()` inside the JavaScript. The default manager name is typically
OK by default:

![](/blog/assets/images/newBCProject5.png)

Then click Finish and let Eclipse set up the new project.

### Step 7

Because I have not figured out yet how to add *Import-Package* to the `MANIFEST.MF` programmatically, you will have to do this manually. Add
the last line of the next screenshot to the MANIFEST.MF of your new plugin:

![](/blog/assets/images/newBCProject6.png)
