# Uncomment this to fail the Anchore image scan
# FROM openjdk:11-jdk-slim
FROM openjdk:11-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]