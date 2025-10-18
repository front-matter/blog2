// Copyright (c) 2025  Egon Willighagen <egon.willighagen@gmail.com>
//
// GPL v3

@Grab(group='io.github.egonw.bacting', module='managers-ui', version='1.0.7')

import java.text.SimpleDateFormat;
import java.util.Date;
import groovy.io.FileType

String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

ui = new net.bioclipse.managers.UIManager("..");

mappings = [
  "2021/06/conflict-of-interest-or-why-i-am.html": "2021/06/11/conflict-of-interest-or-why-i-am.html",
  "2009/08/bioclipse-and-sparql-end-points.html": "2009/08/16/bioclipse-and-sparql-end-points.html",
  "2009/01/calling-xmpp-cloud-services-from.html": "2009/01/19/calling-xmpp-cloud-services-from.html",
  "2008/12/editing-and-validation-of-cml-documents.html": "2008/12/30/editing-and-validation-of-cml-documents.html",
  "2008/12/who-says-java-is-not-fast.html": "2008/12/04/who-says-java-is-not-fast.html",
  "2008/11/re-open-source-peer-review.html": "2008/11/12/re-open-source-peer-review.html",
  "2008/11/opendatasourcestandards-is-not-enough.html": "2008/11/07/opendatasourcestandards-is-not-enough.html",
  "2008/11/next-generation-asynchronous.html": "2008/11/04/next-generation-asynchronous.html",
  "2008/11/embrace-workshop-in-uppsala.html": "2008/11/03/embrace-workshop-in-uppsala.html",
  "2008/10/bioclipse2-scripting-1-from-smiles-to.html": "2008/10/25/bioclipse2-scripting-1-from-smiles-to.html",
  "2008/10/gittodo-support-for-freemind-graphical.html": "2008/10/20/gittodo-support-for-freemind-graphical.html",
  "2008/10/jchempaint-history-cml-patches-in-1999.html": "2008/10/02/jchempaint-history-cml-patches-in-1999.html",
  "2008/09/git-mirror-for-cdk.html": "2008/09/30/git-mirror-for-cdk.html",
  "2008/09/moved-to-sweden-post-doc-in-bioclipse.html": "2008/09/24/moved-to-sweden-post-doc-in-bioclipse.html",
  "2008/09/cdk-development-with-branches-using-git.html": "2008/09/07/cdk-development-with-branches-using-git.html",
  "2008/08/metware-screenshot-spectrum-support.html": "2008/08/20/metware-screenshot-spectrum-support.html",
  "2008/07/commercial-qsar-modeling-sorry-already.html": "2008/07/23/commercial-qsar-modeling-sorry-already.html",
  "2008/07/peer-reviewed-chemoinformatics-why.html": "2008/07/22/peer-reviewed-chemoinformatics-why.html",
  "2008/06/recovering-full-mass-spectra-from-gc-ms.html": "2008/06/04/recovering-full-mass-spectra-from-gc-ms.html",
  "2008/06/finding-differences-between_03.html": "2008/06/03/finding-differences-between_03.html",
  "2008/06/finding-differences-between.html": "2008/06/01/finding-differences-between.html",
  "2008/05/development-of-new-jchempaint.html": "2008/05/19/development-of-new-jchempaint.html",
  "2008/05/metware-status-report.html": "2008/05/16/metware-status-report.html",
  "2008/04/quality-publishing-endnote-versus.html": "2008/04/22/quality-publishing-endnote-versus.html",
  "2008/04/t-plus-18-hours-dr-and-preparing-for.html": "2008/04/03/t-plus-18-hours-dr-and-preparing-for.html",
  "2008/04/t-minus-26-hours-defending-open-source.html": "2008/04/01/t-minus-26-hours-defending-open-source.html",
  "2008/03/cdk-module-dependencies-2.html": "2008/03/23/cdk-module-dependencies-2.html",
  "2008/03/chemical-object-identifier-or-freedom.html": "2008/03/09/chemical-object-identifier-or-freedom.html",
  "2008/03/todo-april-2nd-defend-my-phd-work.html": "2008/03/01/todo-april-2nd-defend-my-phd-work.html",
  "2008/01/be-in-my-advisory-board-2-jchempaint.html": "2008/01/15/be-in-my-advisory-board-2-jchempaint.html",
  "2007/12/christmas-presents.html": "2007/12/21/christmas-presents.html",
  "2007/11/be-in-my-advisory-board-1-being-good.html": "2007/11/27/be-in-my-advisory-board-1-being-good.html",
  "2007/11/metware-metabolomics-database-project.html": "2007/11/22/metware-metabolomics-database-project.html",
  "2007/11/molecules-in-wikipedia-without-inchis-3.html": "2007/11/16/molecules-in-wikipedia-without-inchis-3.html",
  "2007/07/osra-gpl-ed-molecule-drawing-to-smiles.html": "2007/07/20/osra-gpl-ed-molecule-drawing-to-smiles.html"
]

oldPref = "http://chem-bla-ics.blogspot.com/"
newPref = "https://chem-bla-ics.linkedchemistry.info/"

dir = new File(".")
dir.eachFileRecurse (FileType.FILES) { file ->
  if (file.extension == "markdown") {
    content = ""
    updated = false
    inHeader = false
    headerDone = false
    modifiedFound = false
    
    file.eachLine { line ->
      if (line.equals("---")) {
        if (inHeader) { // end of header
          inHeader = false
          headerDone = true
          if (!modifiedFound) line = "modified_date: ${date}\n" + line
        } else {
          inHeader = true
        }
      } else if (inHeader) {
        if (line.startsWith("modified_date: ")) {
          line = "modified_date: ${date}"
          modifiedFound = true
        }
      }
      mappings.each { entry ->
        oldContent = "](" + oldPref + entry.key
        newContent = " <i class=\"fa-solid fa-recycle fa-xs\"></i>](" + newPref + entry.value
        if (line.contains(oldContent) && !(line.contains("keep link"))) {
          line = line.replace(oldContent, newContent)
          updated = true
        }
        oldContent = "](" + oldPref.replace("http://","https://") + entry.key
        if (line.contains(oldContent) && !(line.contains("keep link"))) {
          line = line.replace(oldContent, newContent)
          updated = true
        }
      }
      content += line + "\n"
    }
    if (updated) {
      println "Processing ${file}"
      file.text = content
    }
  }
}
