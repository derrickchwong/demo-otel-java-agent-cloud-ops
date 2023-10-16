#!/usr/bin/env sh
ab -n 10000 -c 10 -T application/json  -p ab-postfile http://34.29.124.0:80/contacts
