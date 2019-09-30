FROM adoptopenjdk/openjdk11
ADD build/libs/user-profile-service-0.0.1-SNAPSHOT.jar user-profile-service-0.0.1-SNAPSHOT.jar
EXPOSE 7083
ENTRYPOINT ["java","-jar","user-profile-service-0.0.1-SNAPSHOT.jar"]
