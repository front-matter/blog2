---
layout: post
title:  "New Bioclipse Features: Kabsch Alignment, RMSD Distance and Tanimoto Simarlity Matrices"
date:   2009-11-04 01:00
blogger-link: https://chem-bla-ics.blogspot.com/2009/11/new-bioclipse-features-kabsch-alignment.html
doi: 10.59350/2ty9f-n0m97
tags: cheminf cdk bioclipse jmol
image: /assets/images/bioclipseKabsch1.png
modified_date: 2026-04-19
---

We recently submitted a second paper on [Bioclipse](http://www.bioclipse.net/), and have worked hard in the past two weeks on addressing the
reviewers' questions (and we love these feature requests! See also these [two](http://bioclipse.blogspot.com/2009/11/download-pdbs-with-bioclipse.html)
[blogs](http://bioclipse.blogspot.com/2009/11/align-sequences-with-kalign-web-service.html)). One reviewer seemed very interested in seeing
docking available in Bioclipse. While we do not have a full docking feature set up for Bioclipse, we do have functionality to deal with 3D
structures, though our researched urged us to focus on the 2D side of cheminformatics so far.

To strengthen our intentions towards the 3D cheminformatics world, we have implemented a few new features, using [CDK](http://cdk.sf.net/)
functionality. For example, we added Kabsch aligment and the related RMSD between molecular structures implemented as both popup menus
as well as manager methods. The manager method you can see in action in [MyExperiment workflow 937](http://www.myexperiment.org/workflows/937),
which you can download directly into Bioclipse with one simple command (see
[Bioclipse Manager for MyExperiment.org <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2009/11/04/bioclipse-manager-for-myexperimentorg.html)):

```javascript
var smileses = new Array("CC(C)C", "CCCN", "CCC=O");

var unaligned = cdk.createMoleculeList();
for (i=0; i<smileses.length; i++) {
  mol = cdk.fromSMILES(smileses[i]);
  mol = cdk.generate3dCoordinates(mol)
  unaligned.add(mol);
}

var aligned = cdk.kabsch(unaligned)

jmol.load(aligned.get(0));
for (i=1; i<aligned.size(); i++) {
  jmol.append(aligned.get(i));
}
```

Now, we do have to update the use of Jmol in Bioclipse, and a big overhaul is scheduled for the 2.4 released in February next year. But you
get the idea.

As said, there are two stories to adding this new functionality. Because we want all GUI interaction the user performs to be recordable
(Scientist 1: *What did you do to get those nice results?* Scientist 2: *I pushed that button in the that long menu*. Scientist 1:
*What button is that?* Scientist 2: *Wait, I send you the BSL script with a Google Wave.*)

The managers that allow this recording is Bioclipse specific, and also the reason why it would not be trivial to make a general Bioclipse
plugin for Eclipse... some Spring magic is used to inject the managers into the JavaScript language. Anyway, the second thing is to add
a GUI element, like popup menus. Now, this is a particular area where Eclipse excels. Now, I did have to ask for the details, as I am
not using this daily (I'm doing science, not IT), but Ola was kind enough to give me the pointers for it.

The below configuration snippet links the pop up action to Bioclipse Navigator content (you know, where your MDL SD, CML, script and other
files show up in Bioclipse). ***But*** only if I have selected 3 or more files! And, only if those files are actually some molecular
content with 3D coordinates! And Bioclipse inherits this functionality by using the Eclipse platform.

```xml
<menuContribution
  locationURI="popup:org.eclipse.ui.popup.any?after=additions">
  <command
    commandId="net.bioclipse.cdk.ui.handlers.kabschAlignment"
    label="Perform Kabsch Alignment"
    icon="icons/molecule2D.png">
    <visibleWhen>
      <with variable="selection">
        <count value="(2-"/>
        <iterate operator="and" ifEmpty="false">
          <adapt type="org.eclipse.core.resources.IResource">
            <or>
              <test property="org.eclipse.core.resources.contentTypeId"
                       value="net.bioclipse.contenttypes.cml.singleMolecule3d"/>
              <test property="org.eclipse.core.resources.contentTypeId"
                       value="net.bioclipse.contenttypes.cml.singleMolecule5d"/>
              <test property="org.eclipse.core.resources.contentTypeId"
                       value="net.bioclipse.contenttypes.mdlMolFile3D"/>
            </or>
          </adapt>
        </iterate>
      </with>
    </visibleWhen>
  </command>
</menuContribution>
```

When Bioclipse is run, this looks like:

![](/assets/images/kabsch.png)

And the alignment results will nicely show up in a Jmol viewer (while it is implemented as an Eclipse editor, it is not yet):

![](/assets/images/bioclipseKabsch1.png)

The first screenshot also shows the new pop-up menus for calculating two matrices for 3 or more molecules. One is based on the
[RMSD](http://en.wikipedia.org/wiki/Root_mean_square_deviation) of the 3D atomic coordinats of the atoms in the
[MCSS](http://blog.rguha.net/?p=113) (BTW, Asad's SMSD work is making its way into the CDK library, and will be available in a
later Bioclipse version too.) and will create a distance matrix. The second new pop-up menu used the Tanimoto similarity
measure based on CDK fingerprints on the selected chemical graphs. If the Bioclipse Statistics feature is installed, the
created [CSV](http://en.wikipedia.org/wiki/Comma-separated_values) files will open up in a matrix editor:

![](/assets/images/rmsdMatrix.png)

Kabsch alignment of protein backbones is planned for a later Bioclipse release, but an important feature for
[our groups proteochemometrics work](http://www.ncbi.nlm.nih.gov/sites/entrez?term=proteochemometrics%20wikberg).
