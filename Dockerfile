FROM openjdk:17
EXPOSE 8080
ADD target/springboot-data-demo.jar springboot-data-demo.jar
ENTRYPOINT ["java","-jar","/springboot-data-demo.jar"]