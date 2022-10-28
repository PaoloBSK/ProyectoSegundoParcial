# ProyectoSegundoParcial

Este programa los hicimos con XAMPP, MY SQL Y APACHE  NETBEANS

eN MY SQL CONNECTIONS SE NECITA CORRER:
create database db_cuenta;
use db_cuenta;

create table users(
id_cuenta int(6)  primary key not null auto_increment,
money int(8)
);
insert into users (money) values (0);

create table collectibles(
id_collection int(6) primary key not null auto_increment,
collection_name varchar(100),
collection_price float(10) 
);
insert into collectibles (collection_name,collection_price) values ('Card1', 50);
insert into collectibles (collection_name,collection_price) values ('Card2', 80);
insert into collectibles (collection_name,collection_price) values ('Card3', 100);
insert into collectibles (collection_name,collection_price) values ('Card4', 150);

create table historial(
id_compra int(6) primary key not null auto_increment,
id_cuenta int(6),
collection_amount int(10) 
);



show tables  from db_cuenta;

SELECT * FROM users;
SELECT * FROM collectibles;
SELECT * FROM historial; 
