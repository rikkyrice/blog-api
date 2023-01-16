create table users (
	id varchar(36) not null,
	email varchar(100) unique not null,
	password varchar(30) not null,
	created_at timestamp not null,
	
	primary key (id)
	
);

create table blogs (
	id int not null auto_increment,
	title varchar(50) not null,
	body varchar(1000) not null,
	posted_at timestamp not null,
	posted_by varchar(36) not null,
	
	primary key (id)
);

insert into users values ('riku', 'rikkyrice@gmail.com', 'password', '2023-01-08 09:00:00');
insert into users values ('chaya', 'chaya@gmail.com', 'password', '2023-01-08 09:00:00');

insert into blogs values (0, 'グルメ1', 'これは本文です。', '2023-01-08 09:00:00', 'riku');
insert into blogs values (1, 'グルメ2', 'これは本文です。', '2023-01-09 09:00:00', 'riku');
insert into blogs values (2, 'グルメ3', 'これは本文です。', '2023-01-10 09:00:00', 'chaya');
insert into blogs values (3, '旅行1', 'これは本文です。', '2023-01-11 09:00:00', 'riku');
insert into blogs values (4, '旅行2', 'これは本文です。', '2023-01-12 09:00:00', 'riku');
insert into blogs values (5, '旅行3', 'これは本文です。', '2023-01-13 09:00:00', 'chaya');
