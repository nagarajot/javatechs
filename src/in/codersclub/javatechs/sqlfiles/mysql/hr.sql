drop table candidate_skills;
drop table skills;
drop table candidates;
drop table qualifications;

create table qualifications(
qualification_code varchar(5),
qualification_desc varchar(25),
primary key (qualification_code)) engine = innodb;

create table skills(
skill_code varchar(5),
skill_desc varchar(30),
primary key (skill_code)) engine = innodb;

create table candidates(
id int(4),
name varchar(20),
gender varchar(1),
qualification_code varchar(5),
experience int(2),
mobile varchar(10),
email varchar(25),
primary key (id),
foreign key (qualification_code) references qualifications(qualification_code)) engine = innodb;

create table candidate_skills(
id int(4),
skill_code varchar(5),
primary key (id,skill_code),
foreign key (id) references candidates(id),
foreign key (skill_code) references skills(skill_code)) engine = innodb;

insert into qualifications values("BE-CS", "BE - Computer Science");
insert into qualifications values("BE-EC", "BE - Electronics");
insert into qualifications values("BE-ME", "BE - Mehanical");
insert into qualifications values("BCom", "Bachelor of Commrce");
insert into qualifications values("BE-ML", "BE - Machine Learning");

insert into skills values("C","C");
insert into skills values("C++","C++");
insert into skills values("JV","Java");
insert into skills values("CB","COBOL");
insert into skills values("C#","C#");
insert into skills values("PH","PHP");
insert into skills values("PY","Python");
insert into skills values("KT","Kotlin");

insert into candidates values(101,"Bob","M","BE-EC",3,"9876545356","john@gmail.com");
insert into candidates values(102,"John","M","BE-CS",3,"9876545356","john@gmail.com");
insert into candidates values(103,"Minica","F","BE-CS",2,"9875125356","monica@gmail.com");
insert into candidates values(104,"Ann","F","BE-CS",3,"9876987356","ann@gmail.com");
insert into candidates values(105,"Rita","F","BE-CS",2,"9298545356","rita@gmail.com");
insert into candidates values(106,"Joseph","M","BE-CS",3,"9876587656","joseph@gmail.com");

insert into candidates values(202,"Xavier","M","BE-CS",3,"9876545356","xavier@gmail.com");

insert into candidate_skills values(101,"C");
insert into candidate_skills values(101,"JV");
insert into candidate_skills values(101,"PY");

insert into candidate_skills values(102,"C");
insert into candidate_skills values(102,"JV");
insert into candidate_skills values(102,"PY");

insert into candidate_skills values(103,"C");
insert into candidate_skills values(103,"JV");
insert into candidate_skills values(103,"PY");

insert into candidate_skills values(104,"C");
insert into candidate_skills values(104,"JV");
insert into candidate_skills values(104,"PY");

insert into candidate_skills values(202,"C");
insert into candidate_skills values(202,"JV");
insert into candidate_skills values(202,"PY");

