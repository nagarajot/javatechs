use school;

create table teachers(
id int(3),
name varchar(20),
gender varchar(1),
qualification varchar(10),
date_of_birth date,
date_of_joining date,
aadhar_card_no varchar(14),
pan_card_no varchar(10),
mobile_no varchar(10),
email varchar(20),
primary key (id)
) engine = innodb;

insert into teachers values(101,"John","M","MSc","1990-08-16","2014-08-15","3454-8765-8123","AAHTB3456S","9986543234","john@gmail.com");
insert into teachers values(102,"Robert","M","MA","1992-08-18","2015-09-18","3454-8765-8123","HRHTB3456A","9945643234","robert@gmail.com");
insert into teachers values(103,"Wilson","M","MCom","1993-08-21","2017-12-22","3454-8765-8123","NAHTB3456C","9996543234","wilson@gmail.com");

insert into teachers values(301,"Monica","F","MSc","1992-09-21","2019-12-29","3454-8765-8123","NACDA3456C","9994367234","monica@gmail.com");
insert into teachers values(302,"Mary","F","MA","1991-08-15","2019-12-16","3454-8765-8123","NAJHE3456C","9909763234","mary@gmail.com");
insert into teachers values(303,"Albert","M","MCom","1994-08-24","2018-12-24","3454-8765-8123","NAUIO3456C","9987543234","albert@gmail.com");

insert into teachers values(104,"Rita","F","MCom","1992-08-25","2014-09-23","3454-8765-8123","BAHTB3456T","9912983234","rita@gmail.com");
insert into teachers values(105,"Ann","F","MSc","1988-08-29","2016-10-28","3454-8765-8123","ZTTRB3456N","9907633234","ann@gmail.com");

insert into teachers values(201,"Ian","M","MSc","1985-08-21","2016-09-29","3454-8765-8123","NACDA3456C","9994367234","ian@gmail.com");
insert into teachers values(202,"Bob","M","MA","1990-05-15","2017-10-16","3454-8765-8123","NAJHE3456C","9909763234","bob@gmail.com");
insert into teachers values(203,"Chris","F","MCom","1987-06-24","2017-02-24","3454-8765-8123","NAUIO3456C","9987543234","chris@gmail.com");

