#!/bin/bash
docker build -f Dockerfile -t jenpy/webapp1
docker run jenpy/webapp1
