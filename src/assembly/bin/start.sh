#!/usr/bin/env bash
java -cp lib/*:../../conf/api/ -Dspring.profiles.active=prod ${start-class}
