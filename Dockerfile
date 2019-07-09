# Uncomment this to fail the Anchore image scan
# FROM openjdk:11-jdk-slim
FROM adoptopenjdk/openjdk-11:alpine-slim
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]