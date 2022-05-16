FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY target/user-service.jar user-service.jar
ENTRYPOINT ["java","-jar","/user-service.jar"]
EXPOSE 9002
