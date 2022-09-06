CREATE TABLE 'users' (
id int not null auto_increment,
username varchar(50) not null,
password varchar(30) not null,
role varchar(50) not null,
enabled boolean not null,

PRIMARY KEY (user_id)


);