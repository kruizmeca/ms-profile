FROM openjdk:11
VOLUME /tmp
EXPOSE 8026
ADD ./target/ms-profile-0.0.1-SNAPSHOT.jar ms-profile.jar
ENTRYPOINT ["java","-jar","/ms-profile.jar"]
