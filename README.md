# springboot-cloud-sample
A very minimalistic spring boot sample web application, which can run on a PaaS like Heroku or Flynn.

To run this web 2 steps are performed:

1. Build `./gradlew stage`
2. Run see [Procfile](https://github.com/ElderByte-/springboot-cloud-sample/blob/master/Procfile)

Basic configuration is done over environment variables. For example, the cloud platform defines the port on which the webservice should run in a $PORT, so the spring cloud config is configured to pick up these variables.
