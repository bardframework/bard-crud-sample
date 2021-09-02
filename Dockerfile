ARG BASE_IMAGE
FROM ${BASE_IMAGE}

ARG APP_VERSION
MAINTAINER Vahid Zafari <va.zafari@gmail.com>

ENTRYPOINT ["java", "-cp", "/data/crud-sample/app/crud-sample.jar:/data/crud-sample/conf/", "-Dspring.profiles.active=prod", "org.springframework.boot.loader.JarLauncher"]

ADD target/bard-crud-sample-${APP_VERSION}.jar   /data/crud-sample/app/crud-sample.jar
