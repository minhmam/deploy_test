FROM openjdk:17-alpine
COPY target/aws_minhpt.jar aws_minhpt.jar
ENTRYPOINT ["java","-jar","/aws_minhpt.jar"]