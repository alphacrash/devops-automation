FROM openjdk:11
EXPOSE 8080
ADD target/dockerized-alpha.jar dockerized-alpha.jar
ENTRYPOINT ["java", "-jar", "dockerized-alpha.jar"]