# oauth2 for springsecurity

有关springsecrity部分请查看项目案例:

https://github.com/dongtian3240/sys

https://github.com/dongtian3240/pro

https://github.com/dongtian3240/cas

springsecurity  oauth2认证部分->认证信息数据库存储
执行sql 脚本、部署项目

一、获取  access_token
 
 http://localhost:8080/spring-oauth2/oauth/token?grant_type=password&client_id=restapp&client_secret=restapp&username=dongtian&password=dongtian
 
 {"access_token":"4a5fc354-7110-45b0-bf45-c14b791e8a54","token_type":"bearer","refresh_token":"24235180-0e1a-49cb-8759-4730d37569cc","expires_in":119,"scope":"read trust write"}
 
二、获取受保护的资源

POST方式

http://localhost:8080/spring-oauth2/api/user/addUser?access_token=4a5fc354-7110-45b0-bf45-c14b791e8a54

三、刷新重新获取access_token
 
http://localhost:8080/spring-oauth2/oauth/token?grant_type=refresh_token&client_id=restapp&client_secret=restapp&refresh_token=7ac7940a-d29d-4a4c-9a47-25a2167c8c49



1、参照官网 spring.io 中springsecurity oauth2认证部分以及官方部分源代码以及参考例子，认证信息数据库存储。

具体使用部分请使用参考doc文件夹中的说明文档。

2、 本版本是个开发阶段，请勿用在生产中。出现问题自负！


3、其他相关项目:

一、未集成cas单点的权限管理系统

https://github.com/dongtian3240/sys

二、集成cas单点登录的企业系统管理

https://github.com/dongtian3240/pro

三、采用jasig耶鲁大学的cas server cas 单点登录项目

https://github.com/dongtian3240/cas

四、基于springsecurity oauth2认证方式的实现，token数据库存储，提供app后台服务端项目

https://github.com/dongtian3240/oauth2

五、网络应用框架Apache Mina 相关学习案例(综合案例-简单的纯文本发送消息和带文件的发送消息案例 以及多人在线聊天系统服务端)

https://github.com/dongtian3240/mina



如有疑问请联系 qq :466862016
