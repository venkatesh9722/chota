FROM openjdk:8
ADD target/spring-boot-k8s-crud-0.0.1-SNAPSHOT.jar spring-boot-k8s-crud-0.0.1-SNAPSHOT.jar
EXPOSE 8787
ENTRYPOINT ["java","-jar","/spring-boot-k8s-crud-0.0.1-SNAPSHOT.jar"]