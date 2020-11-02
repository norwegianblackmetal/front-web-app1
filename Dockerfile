FROM python:3.9.0
LABEL maintainer = 'norwegianblackmetal'
COPY . .
RUN pip install flask
CMD python main.py
