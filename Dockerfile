FROM tomcat:jdk8-openjdk
LABEL maintainer = 'norwegianblackmetal'
COPY src/ /usr/local/tomcat/webapps/src/
RUN javac -cp /usr/local/tomcat/lib/servlet-api.jar /usr/local/tomcat/webapps/src/WEB-INF/classes/Calc.java
RUN javac -cp /usr/local/tomcat/lib/servlet-api.jar /usr/local/tomcat/webapps/src/WEB-INF/classes/src/Fun.java
