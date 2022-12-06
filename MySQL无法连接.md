# MySQL8无法连接

mysql8.0的默认密码验证不再是password。所以在创建用户时，create user 'username'@'%' identified by 'password'; 客户端是无法连接服务的。

登录MySQL后输入：

~~~MySQL
ALTER USER 'username'@'localhost' IDENTIFIED WITH mysql_native_password BY 'password';

FLUSH PRIVILEGES;
~~~
