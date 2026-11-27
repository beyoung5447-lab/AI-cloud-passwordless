package kr.co.ictedu.myictstudy.vo;

import org.apache.ibatis.type.Alias;

import lombok.Getter;

import lombok.Setter;

@Alias("memovo")
@Getter
@Setter
public class MemoVO {
	private int num;
	private String mtitle;
	private String mcontent;
	private String mwriter;
	private String mdate;
	private String reip;
}