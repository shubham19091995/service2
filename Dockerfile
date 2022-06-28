FROM openjdk:8
EXPOSE 8082
ADD target/service2.jar service2.jar
ENTRYPOINT ["java","-jar","/service2.jar"]