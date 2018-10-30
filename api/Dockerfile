FROM openjdk:11-jdk as builder
RUN apt-get update && apt-get install --no-install-recommends -y maven
WORKDIR /opt/
ADD pom.xml ./
RUN mvn -B dependency:resolve-plugins dependency:resolve
ADD ./ ./
RUN mvn clean && mvn package

FROM openjdk:11-jre as runner
WORKDIR /opt/
COPY --from=builder /opt/target/api-0.1.0.jar ./
CMD ["java", "-jar", "api-0.1.0.jar" ]
