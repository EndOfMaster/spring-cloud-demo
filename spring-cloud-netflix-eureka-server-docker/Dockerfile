FROM java:8-jre-alpine
COPY ../spring-cloud-netflix-eureka-server/build/libs/spring-cloud-netflix-eureka-server.jar /app.jar
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
EXPOSE 1111 1112
ENTRYPOINT ["java","-jar","/app.jar"]