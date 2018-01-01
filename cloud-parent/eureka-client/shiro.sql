#用户实体包括：编号(id)、用户名(username)、密码(password)、盐(salt)、是否锁定(locked)；是否锁定用于封禁用户使用，其实最好使用Enum字段存储，可以实现更复杂的用户状态实现。
#角色实体包括：、编号(id)、角色标识符（role）、描述（description）、是否可用（available）；其中角色标识符用于在程序中进行隐式角色判断的，描述用于以后再前台界面显示的、是否可用表示角色当前是否激活。
#权限实体包括：编号（id）、权限标识符（permission）、描述（description）、是否可用（available）；含义和角色实体类似不再阐述。
#另外还有两个关系实体：用户-角色实体（用户编号、角色编号，且组合为复合主键）；角色-权限实体（角色编号、权限编号，且组合为复合主键）。

create table permissions_roles(
   Id int primary key auto_increment,#部门编号 整形 主键 自增长
   permissions_id int not null,
   role_id int not null
 );

create table users_roles(
   Id int primary key auto_increment,#部门编号 整形 主键 自增长
   user_id int not null,
   role_id int not null
 );

create table users(
   Id int primary key auto_increment,#部门编号 整形 主键 自增长
   username varchar(18) NOT NULL,
   PASSWORD VARCHAR(100) NOT NULL,
   salt VARCHAR(20) ,
   locked int DEFAULT 0,
   description varchar(100)#描述
 );

create table roles(
   Id int primary key auto_increment,#部门编号 整形 主键 自增长
   role varchar(18) NOT NULL,
   available int DEFAULT 0,
   description varchar(100)#描述
 );

create table permissions(
   Id int primary key auto_increment,#部门编号 整形 主键 自增长
   permission varchar(18) NOT NULL,
   available int DEFAULT 0,
   description varchar(100)#描述
 );