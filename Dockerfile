From openjdk:8
copy ./target/DockerProject-0.0.1-SNAPSHOT.jar DockerProject-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","DockerProject-0.0.1-SNAPSHOT.jar"]