# Simple WildFly Swarm Project

## Steps used to generate this project
- Visited http://wildfly-swarm.io/generator/
- Selected CDI, Swagger, JAX-RS, JPA dependencies
- Generated the project
- Added a class extending javax.ws.rs.core.Application to make the endpoint work
- Added the Swagger annotations in the endpoint class

## Steps to run the project
- Run `mvn wildfly-swarm:run`
- Go to http://localhost:8080/hello and you should see the following message: `Hello from WildFly Swarm!`
- Go to http://localhost:8080/swagger.json and you should see the swagger.json file generated

