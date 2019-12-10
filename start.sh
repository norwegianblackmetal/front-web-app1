#!/bin/bash
docker stop webc
docker rm webc

docker run -d -p 8000:8080 --name webc webi:0.1 
