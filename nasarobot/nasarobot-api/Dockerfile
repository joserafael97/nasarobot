FROM openjdk:12-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/nasarobot-api.jar
ARG MEMORY_USE
ENV MEMORY_USE=$MEMORY_USE
ARG SPRING_PROFILES_ACTIVE
ENV SPRING_PROFILES_ACTIVE=$SPRING_PROFILES_ACTIVE
COPY ${JAR_FILE} app.jar
# heroku deploy ENTRYPOINT
# ENTRYPOINT ["java","${MEMORY_USE}", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}", "-jar","/app.jar"]
ENTRYPOINT java ${MEMORY_USE} -Dspring.profiles.active=${SPRING_PROFILES_ACTIVE} -jar /app.jar
