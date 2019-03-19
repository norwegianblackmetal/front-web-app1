FROM Alpine
LABEL maintainer = 'norwegianblackmetal'
RUN yum install python
COPY Main.py /var/
COPY requirements.txt /var/
pip install -r /var/requirements.txt
RUN /var/Main.py
