
#! /bin/shell


appName='AMPServer'
pid=$(ps -ef | grep ${appName} | grep java | grep -v grep | awk  '{print $2}')
echo -e $pid

kill -9 ${pid}
sleep 2
if [ $? -eq 0 ];then
    echo "kill ${appName} success..."
else
    echo "kill ${appName} fail"
fi