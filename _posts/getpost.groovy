// Copyright (c) 2023-2025  Egon Willighagen <egon.willighagen@gmail.com>
//
// GPL v3

@Grab(group='io.github.egonw.bacting', module='managers-ui', version='1.0.7')
@Grab(group='io.github.egonw.bacting', module='net.bioclipse.managers.jsoup', version='1.0.7')

bioclipse = new net.bioclipse.managers.BioclipseManager("..");
ui = new net.bioclipse.managers.UIManager("..");
jsoup = new net.bioclipse.managers.JSoupManager("..");

blogpost = args[0]
day = args[1]

def sout = new StringBuilder(), serr = new StringBuilder()
def proc = 'commonmeta encode 10.59350'.execute()
proc.consumeProcessOutput(sout, serr)
proc.waitForOrKill(5000)
println "out> $sout\nerr> $serr"
doi = serr.toString().replace("https://doi.org/10.", "10.").replace("\n","").replace("\r","")
if (doi == null || doi.isEmpty()) {
  doi = sout.toString().replace("https://doi.org/10.", "10.").replace("\n","").replace("\r","")
}

htmlContent = bioclipse.download(blogpost)
htmlDom = jsoup.parseString(htmlContent)
// print htmlDom

title = jsoup.select(htmlDom, "meta[property='og:title']");
parts = blogpost.split("/")
year = parts[3]; if (year.length() == 1) year = "0" + year
month = parts[4]; if (month.length() == 1) month = "0" + month
if (day.length() == 1) day = "0" + day
key = parts[5].replace(".html","")

content = """---
layout: post
title:  "${title.first().attr("content")}"
date:   ${year}-${month}-${day}
blogger-link: ${blogpost}
doi: ${doi}
tags:
---
"""

ui.newFile("/_posts/${year}-${month}-${day}-${key}.markdown", content)
