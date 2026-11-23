CREATE SEQUENCE seq_Memo;
CREATE TABLE Memo (
  "num nun" number(10) NOT NULL, 
  mtitle    varchar2(100) NOT NULL, 
  mcontent  varchar2(255) NOT NULL, 
  mwriter   varchar2(45) NOT NULL, 
  mbdate    date NOT NULL, 
  PRIMARY KEY ("num nun"));