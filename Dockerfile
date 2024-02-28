FROM openjdk:17-jdk-alpine
MAINTAINER asim manzoor
ADD ./target/demo-app-0.0.1.jar demo-app.jar
ENTRYPOINT ["java","-jar","/demo-app.jar"]
