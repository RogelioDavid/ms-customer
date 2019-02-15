FROM java:8

ENV LANG C.UTF-8
VOLUME /tmp
EXPOSE 8080
#ADD target/*.jar /app.jar
ADD target/ms-customer-0.0.1-SNAPSHOT.jar app.jar

RUN bash -c 'touch /app.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
