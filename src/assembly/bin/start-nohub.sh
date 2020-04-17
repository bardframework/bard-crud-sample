#!/usr/bin/env bash
nohup java -cp lib/*:../../conf/api/ -Dspring.profiles.active=prod ${start-class} &
