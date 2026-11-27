package kr.co.ictedu.mvc.dto;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class upBoardDTO {

	private int num;
	private String title;
	private String writer;
	private String content;
	private String reip;
	private String bdate;
	private String imgn;
	private MultipartFile mfile;
	private int hit;
	private int cnt;
	/*
	 * CREATE SEQUENCE upboard_seq; CREATE TABLE upboard ( num number CONSTRAINT
	 * upboard_num_pk PRIMARY KEY, title varchar2(100), writer varchar2(40), contet
	 * clob, imgn varchar2(50), hit number(10), reip varchar2(30), bdate date);
	 * 
	 * 
	 * 
	 * SELECT num, title, writer, contet, imgn, hit, reip, bdate FROM upboard;
	 * INSERT INTO upboard(num, title, writer, contet, imgn, hit, reip, bdate)
	 * VALUES (?, ?, ?, ?, ?, ?, ?, ?); UPDATE upboard SET title = ?, writer = ?,
	 * contet = ?, imgn = ?, hit = ?, reip = ?, bdate = ? WHERE num = ?; DELETE FROM
	 * upboard WHERE num = ?;1
	 */

}
