FROM java:8

# ADD ms-product-0.0.1-SNAPSHOT.jar app.jar
COPY ms-customer-0.0.1-SNAPSHOT.jar  app.jar

RUN bash -c 'touch /app.jar'

EXPOSE 8081

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
