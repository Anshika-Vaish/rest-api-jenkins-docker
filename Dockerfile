FROM openjdk:17
EXPOSE 9988
ADD target/sApp.jar sApp.jar
ENTRYPOINT ["java","-jar","sApp.jar"]

