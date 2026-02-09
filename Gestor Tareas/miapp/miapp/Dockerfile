FROM eclipse-temurin:17-jdk-alpine

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app_gestortareas.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app_gestortareas.jar"]
