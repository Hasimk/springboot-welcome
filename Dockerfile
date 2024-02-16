FROM openjdk:8

ADD target/springboot-app-test-0.0.1-SNAPSHOT.jar springboot-app-test-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","springboot-app-test-0.0.1-SNAPSHOT.jar"]