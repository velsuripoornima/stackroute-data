
FROM openjdk:11

COPY ./target/API-gateway-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8091

RUN sh -c 'touch app.jar'

ENTRYPOINT ["java","-jar","app.jar"]