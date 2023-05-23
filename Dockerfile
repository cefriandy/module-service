FROM openjdk:17

ADD target/module-service.jar module-service.jar

ENTRYPOINT ["java", "-jar", "/module-service.jar"]