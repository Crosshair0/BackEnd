FROM amazoncorreto:17-alpine-jdk
MAINTAINER AFP
COPY target/afp-0.0.1-SNAPSHOT.jar  afp-app.jar
ENTRYPOINT ["java","-jar","/afp-app.jar"]
