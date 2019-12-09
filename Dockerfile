FROM tomcat:jdk8-openjdk
LABEL maintainer = 'norwegianblackmetal'
RUN mkdir -p /usr/local/tomcat/webapps/slayer/WEB-INF/classes
COPY Calc.java /usr/local/tomcat/webapps/slayer/WEB-INF/classes
RUN javac -cp /usr/local/tomcat/lib/servlet-api.jar /usr/local/tomcat/webapps/slayer/WEB-INF/classes/Calc.java
