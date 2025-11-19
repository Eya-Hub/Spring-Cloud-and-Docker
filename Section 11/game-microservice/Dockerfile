# Start with a base image containing Java runtime
FROM eclipse-temurin:21-jre

# Information around who maintains the image
LABEL "org.opencontainers.image.authors"="eya.com"

# Add the application's jar to the image
COPY target/game-microservice-0.0.1-SNAPSHOT.jar game-microservice-0.0.1-SNAPSHOT.jar

# execute the application
ENTRYPOINT ["java", "-jar", "game-microservice-0.0.1-SNAPSHOT.jar"]