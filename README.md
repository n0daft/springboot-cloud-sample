# springboot-cloud-sample
A very minimalistic spring boot sample web application, which can run on a PaaS like Heroku or Flynn.

Git Deployment:

A PaaS which supports deploying by direct git integration checks out the source and then performs 2 steps:

1. Build `./gradlew stage`
2. Run _see_ [Procfile](https://github.com/ElderByte-/springboot-cloud-sample/blob/master/Procfile)

Basic configuration is done over environment variables. For example, the cloud platform defines the port on which the webservice should run in a $PORT, so the spring cloud config is configured to pick up these variables.

## Service Discovery

This sample registers itself with an Eureka Service Discovery server, under the application name defined in [bootstrap.yml]
(https://github.com/ElderByte-/springboot-cloud-sample/blob/master/sample-server/src/main/resources/config/bootstrap.yml) - in this case the applicaiton name is `springboot-cloud-sample`



## Consume this web service

The service is made available using Eureka with the applicaiton name `springboot-cloud-sample`.
This sample provides a simple REST API `/api/counter` which returns a number which is always incremented by 1 after a call.
