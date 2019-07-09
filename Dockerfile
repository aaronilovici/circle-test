# Uncomment this to fail the Anchore image scan
# FROM openjdk:8-jdk-alpine
FROM openjdk:8u151-jre-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]