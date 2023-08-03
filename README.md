# Rba Demo Project

## Operation

This application creates 2 Spring Boot services.

The `rba-producer` will produce random integers to the "rba-data" Kafka
topic.

The `rba-rest` will consume the integers from the "rba-data" topic
and convert the integer to either "R", "B", or "RBA", based whether
they are divisible by 3, 5, or both, respectively. 
The resulting String is then stored in a Redis InMemory DB.
Furthermore, this service exposes a Rest endpoint reachable under
`localhost:8080/api/rest/count` which does:

-  `localhost:8080/api/rest/count/r` returns how many "R" are stored
-  `localhost:8080/api/rest/count/b` returns how many "B" are stored
-  `localhost:8080/api/rest/count/rba` returns how many "RBA" are stored

The Rest endpoint is secured with basic authentication with 
`user/pw = user/pass`

## Setup

This project requires a Kafka, Zookeeper and Redis setup, 
which can be bootstrapped via the `docker-compose.yaml` file.

Before invoking `docker-compose up -d`, make sure that the project is 
built using `mvn clean package` from the root directory.

## Test

Use the following SwaggerUI endpoint for testing:

- http://localhost:8080/api/swagger-ui/index.html
