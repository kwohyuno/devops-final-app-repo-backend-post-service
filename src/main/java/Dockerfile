FROM maven:3-amazoncorretto-17 AS build
WORKDIR /app

COPY pom.xml .

COPY src/main/java ./src/main/java

RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]