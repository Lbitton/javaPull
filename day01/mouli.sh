#!/bin/bash

tree -FQ task05 > tmp
diff tmp normal

if [ $? == 0 ]
then
    echo passed
else
    echo errored
fi

rm tmp
