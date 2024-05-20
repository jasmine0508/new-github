FROM openjdk:17-jdk-alpine
MAINTAINER asim manzoor
ADD ./target/demo-app-*.jar demo-app.jar
ENTRYPOINT ["java","-jar","/demo-app.jar"]
