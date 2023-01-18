drop table book;

create table book(
id serial,
name varchar(64),
tyosha varchar (64),
shuppan varchar(64),
isbn varchar(64),
loginID varchar(64),
salt varchar(512),
pw varchar(64),
hashedPW varchar(512),
primary key(loginID)
);