# spring-cloud-demo

## spring-cloud-config-server

## spring-cloud-config-client
bootstrap.yml is loaded earlier than application.yml

## spring-cloud-netflix
### spring-cloud-netflix-eureka-server
- singleton closed "eureka.client.registerWithEureka" and 
"eureka.client.fetchRegistry" should be re-opened
- this demo "eureka.client.serviceUrl.defaultZone" url peer1 and peer2 
is to modify the host file