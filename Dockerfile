FROM eclipse-temurin:21-jre
WORKDIR /opt
COPY target/*.jar /opt/app.jar
ENTRYPOINT ["java","-jar","/opt/app.jar"]