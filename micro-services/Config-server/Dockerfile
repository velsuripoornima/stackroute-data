
FROM openjdk:11

COPY ./target/Config-server-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8888

RUN sh -c 'touch app.jar'

ENTRYPOINT ["java","-jar","app.jar"]