# Start with Linux server
FROM maven:3-eclipse-temurin-21
FROM node:20
FROM openjdk:21-bookworm AS builder

#Build application
WORKDIR /app

# Everything in this app
# Need ./mvn, pom.xml
COPY mvnw .
COPY mvnw.cmd .
COPY pom.xml .
COPY .mvn .mvn
COPY src src

# Install the dependencies
RUN mvn clean package -Dmaven.test.skip=true
RUN npm ci

# Define environment variables
# set environment variable, export is a Linux command
# export SERVER_PORT = 8080
ENV SPRING_REDIS_HOST=localhost
ENV SPRING_REDIS_PORT=6379
# NOT_SET = "not set"
ENV SPRING REDIS_USERNAME=NOT_SET
ENV SPRING REDIS_PASSWORD=NOT_SET

## Run the application
# Define environment variable 
ENV PORT=8080

#Expose the port
EXPOSE ${PORT}

# Run the program
ENTRYPOINT SERVER_PORT=${PORT} java -jar target/day15-0.0.1-SNAPSHOT.jar
ENTRYPOINT SERVER_PORT=${PORT} node main.js