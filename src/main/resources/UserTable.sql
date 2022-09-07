CREATE TABLE 'users' (
id int not null auto_increment,
username varchar(50) not null,
password varchar(30) not null,
role varchar(50) not null,
enabled boolean not null,

PRIMARY KEY (user_id)


);

create table movie_user_data (
user_id int not null,
movie_id int not null,
favorite boolean not null DEFAULT false,
rating int,
notes varchar(255),
primary key (user_id, movie_id)
);