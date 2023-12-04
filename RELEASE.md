To release on maven central.
----------------------------

- Check that the default generated values are the ones recommended
  - Java from [Eclipse Installation](https://wiki.eclipse.org/Eclipse/Installation)
  - Tycho from [Maven Central](https://mvnrepository.com/artifact/org.eclipse.tycho/tycho-core)

----------------------------
- Repo should be cloned using ssh (scm plugin not working with https)
```  
mvn release:clean release:prepare 
```  
follow by
```  
mvn release:perform
```  

 - The automatic deploy seems broken for this archetype. Manual steps for deployment:
   - Log in [Nexus Sonatype](https://oss.sonatype.org/) 
   - Check eclipse-tycho-archetype in Staging repository
   - Close the repository (just after the refresh button)
   - Wait 2 to 6 hours
   - Log in [Nexus Sonatype](https://oss.sonatype.org/)    
   - Click on the release button   
   - Wait around 24 hours before checking
  - Add reference to the new version in the catalog shared in gh-pages branch 
  - More in the [Release Documentation](http://central.sonatype.org/pages/releasing-the-deployment.html) and in [Requirement for Maven Central](http://central.sonatype.org/pages/requirements.html)
 
The new version should be available at [Maven Central](https://search.maven.org/#search%7Cga%7C1%7Ca%3A%22eclipse-tycho-archetype%22)

⚠️ In case of use ``` gpg: can't connect to the agent: Invalid value passed to IPC ``` use ```gpg-connect-agent -v``` to _reboot_ gpg agent
