
FROM openjdk:11

COPY ./target/Eureka-server-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8761

RUN sh -c 'touch app.jar'

ENTRYPOINT ["java","-jar","app.jar"]