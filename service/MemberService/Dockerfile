FROM maven:3.6.0-jdk-8-alpine as step1
WORKDIR /work
COPY . .
RUN mvn package

FROM openjdk:8u201-jre-alpine
WORKDIR /deploy
RUN apk --no-cache add curl
COPY --from=step1  /work/target/member.jar member.jar
CMD ["java", "-jar", "member.jar"]
HEALTHCHECK --start-period=30s --interval=5s CMD curl http://localhost:8080/actuator/health || exit 1