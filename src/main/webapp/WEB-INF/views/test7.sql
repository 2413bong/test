
/* Drop Triggers */

DROP TRIGGER TRI_test7_usernumber;



/* Drop Tables */

DROP TABLE test7 CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE SEQ_test7_usernumber;




/* Create Sequences */

CREATE SEQUENCE SEQ_test7_usernumber INCREMENT BY 1 START WITH 1;



/* Create Tables */

CREATE TABLE test7
(
	usernumber number(10,0) NOT NULL,
	id varchar2(100) NOT NULL,
	password varchar2(100) NOT NULL,
	name varchar2(30) NOT NULL,
	email varchar2(100) NOT NULL,
	PRIMARY KEY (usernumber)
);



/* Create Triggers */

CREATE OR REPLACE TRIGGER TRI_test7_usernumber BEFORE INSERT ON test7
FOR EACH ROW
BEGIN
	SELECT SEQ_test7_usernumber.nextval
	INTO :new.usernumber
	FROM dual;
END;

/




