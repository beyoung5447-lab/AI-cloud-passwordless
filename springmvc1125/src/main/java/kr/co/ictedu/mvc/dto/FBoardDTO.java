package kr.co.ictedu.mvc.dto;

import lombok.Getter;
import lombok.Setter;

/*
 * CREATE TABLE fboard (
    num NUMBER PRIMARY KEY,
    subject VARCHAR2(100) NOT NULL, 
    content CLOB NOT NULL,
    writer VARCHAR2(50) NOT NULL,
    reip VARCHAR2(15) NOT NULL,
    hit NUMBER DEFAULT 0,
    pwd VARCHAR2(20),
    fdate DATE DEFAULT SYSDATE
);
CREATE SEQUENCE fboard_seq
INCREMENT BY 1 START WITH 1;
 * */
//Alias ����
//	kr.co.ictedu.mvc.dto.FBoardDTO
@Setter
@Getter
public class FBoardDTO {
	private int num;
	private String subject;
	private String writer;
	private String pwd;
	private String content;
	private int hit;
	private String reip;
	private String fdate;
}
