#�û�ʵ����������(id)���û���(username)������(password)����(salt)���Ƿ�����(locked)���Ƿ��������ڷ���û�ʹ�ã���ʵ���ʹ��Enum�ֶδ洢������ʵ�ָ����ӵ��û�״̬ʵ�֡�
#��ɫʵ������������(id)����ɫ��ʶ����role����������description�����Ƿ���ã�available�������н�ɫ��ʶ�������ڳ����н�����ʽ��ɫ�жϵģ����������Ժ���ǰ̨������ʾ�ġ��Ƿ���ñ�ʾ��ɫ��ǰ�Ƿ񼤻
#Ȩ��ʵ���������ţ�id����Ȩ�ޱ�ʶ����permission����������description�����Ƿ���ã�available��������ͽ�ɫʵ�����Ʋ��ٲ�����
#���⻹��������ϵʵ�壺�û�-��ɫʵ�壨�û���š���ɫ��ţ������Ϊ��������������ɫ-Ȩ��ʵ�壨��ɫ��š�Ȩ�ޱ�ţ������Ϊ������������

create table permissions_roles(
   Id int primary key auto_increment,#���ű�� ���� ���� ������
   permissions_id int not null,
   role_id int not null
 );

create table users_roles(
   Id int primary key auto_increment,#���ű�� ���� ���� ������
   user_id int not null,
   role_id int not null
 );

create table users(
   Id int primary key auto_increment,#���ű�� ���� ���� ������
   username varchar(18) NOT NULL,
   PASSWORD VARCHAR(100) NOT NULL,
   salt VARCHAR(20) ,
   locked int DEFAULT 0,
   description varchar(100)#����
 );

create table roles(
   Id int primary key auto_increment,#���ű�� ���� ���� ������
   role varchar(18) NOT NULL,
   available int DEFAULT 0,
   description varchar(100)#����
 );

create table permissions(
   Id int primary key auto_increment,#���ű�� ���� ���� ������
   permission varchar(18) NOT NULL,
   available int DEFAULT 0,
   description varchar(100)#����
 );