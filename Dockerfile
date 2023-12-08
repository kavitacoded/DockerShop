FROM openjdk:16
EXPOSE 8089
ADD target/shop.jar shop.jar
ENTRYPOINT ["java","-jar","shop.jar"]
