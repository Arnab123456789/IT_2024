# Use an official Java runtime as a parent image
FROM openjdk:22-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the host machine to the container
COPY target/spring-docker.jar app.jar

# Expose the port on which the app will run
EXPOSE 9898

# Define the command to run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
