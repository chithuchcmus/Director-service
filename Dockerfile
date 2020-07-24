FROM openjdk:8
MAINTAINER Thuc. Nguyen Chi <thucnc@vng.com.vn>

ADD ./target/*.jar thesisdirector.jar
ADD ./src/main/resources/application.yml /src/main/resources/application.yml
ADD ./src/main/resources/logback-spring.xml /src/main/resources/logback-spring.xml
ADD ./src/main/resources/application-local.yml /src/main/resources/application-local.yml

ENTRYPOINT ["java","-Dapppath=.", "-Dspring.profiles.active=local", "-jar", "/thesisdirector.jar"]
