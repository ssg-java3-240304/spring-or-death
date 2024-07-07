# root계정으로 실행하세요.
create database springdb;
grant all privileges on springdb.* to 'sh'@'%';

select user, host from mysql.user;
show grants for 'sh'@'%'