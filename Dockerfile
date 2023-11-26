FROM openjdk:8-jre-slim
WORKDIR /ac2dq
COPY target/*.war /ac2dq/ac2dq-0.0.1-SNAPSHOT.war
EXPOSE 2375
CMD java -XX:+UseContainerSupport -Xmx512m -Dserver.port=2375 -jar ac2dq-0.0.1-SNAPSHOT.war 



