FROM openjdk:8-jdk
RUN apt-get update
RUN apt-get install -y maven
COPY ./pom.xml /usr/local/service/pom.xml
COPY ./src /usr/local/service/src
ADD ./target/users-rest-server-1.0-SNAPSHOT.jar app.jar
WORKDIR /usr/local/service
RUN mvn package
EXPOSE 8080
CMD ["java","-jar","/app.jar"]