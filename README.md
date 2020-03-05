# spring-boot-java-rest-api-archetype

## How to use?

This archetype is published to Maven central. 
You can generate project using this archetype using `mvn archetype:generate` and select the archetype number.

### Install archetype locally

```bash
git clone https://github.com/XLILT/spring-boot-java-rest-api-archetype.git
cd spring-boot-java-rest-api-archetype
mvn clean install
```

### Generate application from archetype

```
mvn archetype:generate \
    -B -DarchetypeGroupId=xl.maven.archetypes \
    -DarchetypeArtifactId=spring-boot-java-rest-api-archetype \
    -DarchetypeVersion=0.0.1 \
    -DgroupId=com.mycompany \
    -DartifactId=myapp \
    -Dversion=1.0-SNAPSHOT \
    -Dpackage=com.mycompany.myapp
```

Generates basic SpringBoot REST API application with the following features:

* Database support (H2/Postgres)

