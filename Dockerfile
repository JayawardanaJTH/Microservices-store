FROM openjdk:11
ARG JAR_FILE=user-service/target/*.jar
COPY ${JAR_FILE} user-service.jar
ENTRYPOINT ["java","-jar","/user-service.jar"]
EXPOSE 9002
