#!/bin/bash
docker build -t jippy:1 .
docker run -p 5000:5000 jippy:1 --name jips python main.py
