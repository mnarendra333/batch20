--------------------------------------------------------
--  File created - Monday-February-18-2019   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table PLAYERS
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."PLAYERS" 
   (	"PLY_ID" NUMBER(10,0), 
	"PLY_NAME" VARCHAR2(20 BYTE), 
	"AGE" NUMBER(10,0), 
	"NOW" NUMBER(10,0), 
	"SKILL" VARCHAR2(20 BYTE), 
	"RANK" NUMBER(10,0), 
	"TID" NUMBER(10,0)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into SYSTEM.PLAYERS
SET DEFINE OFF;
Insert into SYSTEM.PLAYERS (PLY_ID,PLY_NAME,AGE,NOW,SKILL,RANK,TID) values (1,'sachin',38,200,'batsmen',1,1);
Insert into SYSTEM.PLAYERS (PLY_ID,PLY_NAME,AGE,NOW,SKILL,RANK,TID) values (2,'dawan',30,100,'batsmen',100,1);
Insert into SYSTEM.PLAYERS (PLY_ID,PLY_NAME,AGE,NOW,SKILL,RANK,TID) values (3,'rohith',30,0,'batsmen',10,1);
Insert into SYSTEM.PLAYERS (PLY_ID,PLY_NAME,AGE,NOW,SKILL,RANK,TID) values (4,'ashwin',31,213,'bowler',20,1);
Insert into SYSTEM.PLAYERS (PLY_ID,PLY_NAME,AGE,NOW,SKILL,RANK,TID) values (5,'hardhik',28,50,'all-rounder',80,1);
Insert into SYSTEM.PLAYERS (PLY_ID,PLY_NAME,AGE,NOW,SKILL,RANK,TID) values (6,'bhuvaneswar',28,100,'bowler',81,1);
Insert into SYSTEM.PLAYERS (PLY_ID,PLY_NAME,AGE,NOW,SKILL,RANK,TID) values (7,'jadeja',28,140,'all-rouner',82,1);
Insert into SYSTEM.PLAYERS (PLY_ID,PLY_NAME,AGE,NOW,SKILL,RANK,TID) values (8,'rayudu',29,0,'batsmen',50,1);
Insert into SYSTEM.PLAYERS (PLY_ID,PLY_NAME,AGE,NOW,SKILL,RANK,TID) values (9,'dhoni',32,0,'batsmen',5,1);
Insert into SYSTEM.PLAYERS (PLY_ID,PLY_NAME,AGE,NOW,SKILL,RANK,TID) values (10,'bhumra',30,200,'bowler',15,1);
Insert into SYSTEM.PLAYERS (PLY_ID,PLY_NAME,AGE,NOW,SKILL,RANK,TID) values (11,'umesh',28,200,'bowler',115,1);
--------------------------------------------------------
--  DDL for Index SYS_C004027
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."SYS_C004027" ON "SYSTEM"."PLAYERS" ("PLY_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table PLAYERS
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."PLAYERS" ADD PRIMARY KEY ("PLY_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PLAYERS
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."PLAYERS" ADD FOREIGN KEY ("TID")
	  REFERENCES "SYSTEM"."TEAMS" ("TEAM_ID") ENABLE;
