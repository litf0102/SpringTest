FROM java:8
MAINTAINER litf
ADD target/SpringTest-0.0.1-SNAPSHOT.jar SpringTest.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/SpringTest.jar"]
