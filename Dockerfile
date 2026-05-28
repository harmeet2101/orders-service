FROM --platform=linux/amd64 openjdk:17-ea-5-jdk-alpine
WORKDIR /app
LABEL Description=orders-service
COPY . .
EXPOSE 9003
RUN sh -c 'touch /orders-service-app.jar'
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app/orders-service-app.jar"]
