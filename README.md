eclipse-tycho-archetype
=======================
__An archetype to initialize an eclipse project__

Status
----------------------
[![License](https://img.shields.io/badge/license-EPL2-blue.svg)](https://www.eclipse.org/org/documents/epl-2.0/EPL-2.0.html)
[![Build Status](https://travis-ci.org/bmaggi/eclipse-tycho-archetype.svg?branch=master)](https://travis-ci.org/bmaggi/eclipse-tycho-archetype)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.bmaggi/eclipse-tycho-archetype/badge.svg?style=plastic)](https://maven-badges.herokuapp.com/maven-central/com.github.bmaggi/eclipse-tycho-archetype)

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
---
|Parameter|Default Value|Description|
|---------|-------------|-----------|
|groupId|groupId|Maven 'groupId'|
|artifactId|artifactId|Maven 'artifactId'|
|version|1.0.0-SNAPSHOT|Maven 'version'|
|tychoVersion|3.0.1|Tycho 'version'|
|javaVersion|17|Java 'version'|
|eclipsePlatform|latest|Eclipse target platform|

Create project with Maven command line
------------------------------------------

```
mvn archetype:generate -DarchetypeGroupId=com.github.bmaggi -DarchetypeArtifactId=eclipse-tycho-archetype -DarchetypeVersion=1.0.3 -DgroupId=com -DartifactId=acme
```

- go in ${artifactId} directory
- (optional) change version with ```mvn org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=6.4.0-SNAPSHOT```
- run ```mvn clean install ```
- get the created product in ${artifactId}\\${artifactId}.product\target\products
- get the product related to your platform
- unzip it
- run your product

Create project in Eclipse (using Maven Central Archetype Catalog)
-------------------------------------------------------

- New Project > Maven > Maven Project
- Next > Catalog : Configure
- Add Remote Catalog : 'eclipse-tycho-archetype' https://bmaggi.github.io/eclipse-tycho-archetype/
- Apply and Close
- Type 'com.github.bmaggi' in Filter
- Select eclipse-tycho-archetype
- Next > Set version to 1.0.0-SNAPSHOT (m2e will override whatever you provide)
- Set parameters > Finish

