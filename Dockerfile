FROM openjdk:17-jdk-alpine
MAINTAINER baeldung.com
COPY target/demo-app-0.0.1.jar demo-app.jar
ENTRYPOINT ["java","-jar","/demo-app.jar"]