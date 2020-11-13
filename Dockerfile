FROM openjdk:11.0.9-jdk-slim
COPY build/libs/app-0.0.1-SNAPSHOT.jar .
CMD java -classpath . -jar app-0.0.1-SNAPSHOT.jar
