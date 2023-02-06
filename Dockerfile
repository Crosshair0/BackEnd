FROM amazoncorretto:17-alpine-jdk
COPY target/afp-0.0.1-SNAPSHOT.jar  afp-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/afp-app.jar"]
