FROM openjdk:19-ea-jdk-slim

LABEL maintainer="AFP"

COPY target/afp-0.0.1-SNAPSHOT afp-app.jar

ENTRYPOINT ["java","-jar","/afp-app.jar"]