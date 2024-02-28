FROM openjdk:17-jdk-alpine
MAINTAINER asim manzoor
echo $PWD
PWD
COPY ./target/*.jar demo-app.jar
ENTRYPOINT ["java","-jar","/demo-app.jar"]
