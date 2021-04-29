ARG BASE_IMAGE
FROM ${BASE_IMAGE}

ARG APP_VERSION
MAINTAINER Vahid Zafari <va.zafari@gmail.com>

ENTRYPOINT ["java", "-cp", "/opt/bard/app/bard-crud-sample.jar:/opt/bard/app/conf", "-Dspring.profiles.active=prod", "org.springframework.boot.loader.JarLauncher"]

ADD target/bard-crud-sample-${APP_VERSION}.jar   /opt/bard/app/bard-crud-sample.jar
