FROM openjdk:8-jdk
MAINTAINER noipd <noipd@fpt.com.vn>
ADD target/fpt-caching-redis-0.0.1-SNAPSHOT.jar fpt-caching-redis-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar", "/fpt-caching-redis-0.0.1-SNAPSHOT.jar"]
EXPOSE 2222