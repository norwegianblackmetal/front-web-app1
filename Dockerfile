FROM centos:latest
LABEL maintainer = 'norwegianblackmetal'
RUN yum -y install python
COPY . /
#RUN pip install -r /var/requirements.txt
