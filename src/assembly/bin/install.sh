#!/usr/bin/env bash

rm -rf /opt/bard/apps/crud-sample/*
mkdir -p /opt/bard/apps/crud-sample/

#copy bard-crud-sample-x.x.x.tar.gx to /opt/bard/apps/crud-sample/

cd /opt/bard/apps/crud-sample/ || exit

tar -xvf *.tar.gz
mkdir -p /opt/bard/logs/crud-sample
sed -i 's/\r//' bin/*.sh

cp -f bin/bard-crud-sample.service /etc/systemd/system/
systemctl daemon-reload
systemctl enable bard-crud-sample.service
systemctl restart bard-crud-sample.service
