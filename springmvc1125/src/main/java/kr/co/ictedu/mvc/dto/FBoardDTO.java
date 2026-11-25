package kr.co.ictedu.mvc.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FBoardDTO {
	// kr.co.ictedu.mvc.dto

	private int num;
	private String subject;
	private String writer;
	private String pwd;
	private String content;
	private int hit;
	private String reip;
	private String fdate;

}
