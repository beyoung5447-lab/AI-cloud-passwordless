package kr.co.ictedu.mvc.dao;

import java.util.List;

import kr.co.ictedu.mvc.dto.FBoardDTO;

public interface FBoardDaoInter {
	// <select id="list" resultType="fvo">
	List<FBoardDTO> listFBoard();

	// <insert id="add" parameterType="fvo">
	void addFBoard(FBoardDTO vo);

	// <update id="hit" parameterType="int">
	void updateHit(int num);

	// <select id="detail" parameterType="int" resultType="fvo">
	FBoardDTO detailFboard(int num);
}