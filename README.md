eclipse-tycho-archetype
=======================
__An archetype to initialize an eclipse project__

Continuous Integration   
----------------------
[![License](https://img.shields.io/badge/license-EPL2-blue.svg)](https://www.eclipse.org/org/documents/epl-2.0/EPL-2.0.html)
[![Build Status](https://travis-ci.org/bmaggi/eclipse-tycho-archetype.svg?branch=master)](https://travis-ci.org/bmaggi/eclipse-tycho-archetype)

Summary
-------


Generated structure
-------------------
```
>com.acme
|-- com.acme.plugin
|-- com.acme.test
|-- com.acme.feature
|-- com.acme.p2
|-- com.acme.product
|-- com.acme.targetplatform
```

Create project
--------------
```
mvn archetype:generate -DarchetypeGroupId=com.github.bmaggi \
  -DarchetypeArtifactId=eclipse-tycho-archetype \
  -DarchetypeVersion=0.1.0-SNAPSHOT \
  -DgroupId=test \
  -DartifactId=ab
```


|Parameter|Default Value|Description|
|---------|-------------|-----------|
|groupId|groupId|Maven 'groupId'|
|artifactId|artifactId|Maven 'artifactId'|
|version|0.1.0-SNAPSHOT|Maven 'version'|

Known issues
--------------
https://issues.apache.org/jira/browse/ARCHETYPE-505
temporary solution http://maven.40175.n5.nabble.com/hidden-and-ignore-files-in-an-archetype-td5808355.html
