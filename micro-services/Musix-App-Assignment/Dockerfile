
FROM openjdk:11

COPY ./target/muzixapplication-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8090

RUN sh -c 'touch app.jar'

ENTRYPOINT ["java","-jar","app.jar"]
