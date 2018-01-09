# ElasticSearch Interfaces

ElasticSearch interfaces to implement a Repository. 

Enforces implementing support for paginated results and also faceting.


## Installation

Add in your `pom.xml` file the jitpack.io repositories:

```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
```
  
Now add the package as a dependency: 

```xml
<dependencies>		
  <dependency>
	  <groupId>com.nilportugues</groupId>
	  <artifactId>elasticsearch</artifactId>
    <version>${nilportugues_elasticsearch.version}</version>
  </dependency>
</dependencies>  
```
