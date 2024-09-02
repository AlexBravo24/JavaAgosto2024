FROM openjdk:8-jdk-alpine
COPY "./target/ms_clientes-1.0.0.jar" "app.jar"

EXPOSE 8095

ENTRYPOINT ["java", "-jar", "app.jar"]