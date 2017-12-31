#!/bin/bash

IP=`ip add show eth0|grep -w inet|awk '{print $2}'|awk -F"/" '{print $1}'`
java -Djava.security.egd=file:/dev/./urandom -jar app.jar --req.ip=${IP}