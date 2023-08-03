FROM azul/zulu-openjdk-alpine:11-latest

EXPOSE 9092

ARG JAR_FILE=target/rba-producer-1.0.0.jar
ADD ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
