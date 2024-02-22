From openjdk:11
RUN mkdir /app
WORKDIR /app
COPY target/devops-0.0.1-SNAPSHOT.jar /app
EXPOSE 8082
ENTRYPOINT ["java","-jar","devops-0.0.1-SNAPSHOT.jar"]