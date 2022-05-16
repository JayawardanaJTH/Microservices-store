FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} user-service-0.0.1.jar
ENTRYPOINT ["java","-jar","/user-service-0.0.1.jar"]
EXPOSE 9002
