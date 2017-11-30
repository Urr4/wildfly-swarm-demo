# wildfly-swarm-demo
Test Implementation of a wildfly swarm application to see how fast I can obtain the basic functionalities.
 - It took about 5 minutes
 
This Project should hold the minimum requirements for working in a productiv environment.
There is a User-Entity that can be persisted and loaded from/to a Neo4j Database
There is a REST-Entpoint to work with User-Entities via REST
There is an CDI managed Service

In the future I want to add Health, Metrics and other MicroProfile modules, just to see how easy it is.

If you want to use it, you'll need a Neo4j running on bolt.
Adjust the myapp.neo4j.user and myapp.neo4j.password in the resources/project-default.yaml to your own Neo4j credentials and your ready to go.
