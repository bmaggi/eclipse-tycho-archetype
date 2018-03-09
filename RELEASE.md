To release on maven central.
----------------------------
```  
mvn release:clean release:prepare 
```  
follow by
```  
mvn release:perform
```  

 - The automatic deploy seems broken for this archetype. Manual steps for deployment:
  - log in [Nexus Sonatype](https://oss.sonatype.org/) 
  - Check eclipse-tycho-archetype in Stagin repository
  - Close the repository
  - Wait around 2 hours before checking
  - More in the [Release Documentation](http://central.sonatype.org/pages/releasing-the-deployment.html) and in [Requirement for Maven Central](http://central.sonatype.org/pages/requirements.html)
 
 
the new version should be available at [Maven Central](https://search.maven.org/#search%7Cga%7C1%7Ca%3A%22eclipse-tycho-archetype%22)