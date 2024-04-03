FROM openjdk:18
EXPOSE 8080
ADD target/DevopsAssignments-0.0.1-SNAPSHOT.jar DevopsAssignments-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/DevopsAssignments-0.0.1-SNAPSHOT.jar"] 