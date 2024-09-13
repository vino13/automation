FROM eclipse-temurin:17
COPY target/automation.jat automtion.jar
CMD [ "java","-jar","automation.jar" ]