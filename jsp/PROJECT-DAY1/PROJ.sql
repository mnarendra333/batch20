create table teams(team_id number(10) primary key,team_name varchar2(20),no_of_players number(10),country varchar2(20),rank number(10),flag varchar2(30));

Table created.

SQL> create table players(ply_id number(10) primary key,ply_name varchar2(20),age number(10),now number(10),skill varchar2(20),rank number(10),tid number(10),foreign key(tid) references teams(team_id));

Table created.

SQL> create table coach(coach_id number(10),coach_name varchar2(20),age number(10),tid number(10),foreign key(tid) references teams(team_id));

Table created.

SQL>
SQL>
SQL>
SQL>
SQL>
SQL> insert into teams values(1,'india',15,'IND',2,'testng');

1 row created.

SQL> insert into teams values(2,'australia',15,'AUS',3,'testng');

1 row created.