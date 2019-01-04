#!/bin/bash

cut ../day02/passwd -d ':' -f 1 | grep ^$1 | wc -l


