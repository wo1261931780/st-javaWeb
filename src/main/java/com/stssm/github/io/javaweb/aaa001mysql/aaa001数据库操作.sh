#以下这些脚本都是在Linux中执行的

exit #退出命令

quit #退出

mysql -u用户名 -p密码 -h要连接的mysql服务器地址 -p端口号

# 登录参数：
#mysq1-u用户名 -p密码 -h要连接的mysq1服务器的ip地址(默认127.0.0.1) -P端口号(默认3306)
# 比如我本地的数据库地址：localhost
mysql -u root -p LIU18959297292 -H 127.0.0.1 -p 3306

net stop mysql #卸载MySQL服务

net stop mysql # 停止mysql服务

mysql -remove mysql # 删除mysql服务

show database #展示所有的数据库名称

services.msc # 看到当前计算机的所有服务

net start MySQL; # 直接启动SQL的服务

MySQL -install;  # 直接注入mysql服务
