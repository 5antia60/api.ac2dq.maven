FROM openjdk:8-jre-slim
WORKDIR /ac2dq
COPY target/*.war /ac2dq/ac2dq-0.0.1-SNAPSHOT.war
EXPOSE 9090
CMD java -XX:+UseContainerSupport -Xmx512m -Dserver.port=9090 -jar ac2dq-0.0.1-SNAPSHOT.war 



