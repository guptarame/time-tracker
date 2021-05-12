From tomcat:9.0

# Maintainer
MAINTAINER "satyaprasad"

# copy war file on to container
COPY ./webapp-0.5.0-SNAPSHOT.war /usr/local/tomcat/webapps
