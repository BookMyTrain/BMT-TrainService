ARG JAVA_VERSION=11
FROM openjdk:${JAVA_VERSION}
EXPOSE 8080
COPY target/trainservice.jar train-service.jar
ENTRYPOINT ["java", "-jar","/train-service.jar"]