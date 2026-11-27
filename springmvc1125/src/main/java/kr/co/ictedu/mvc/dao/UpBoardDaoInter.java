package kr.co.ictedu.mvc.dao;

import java.util.List;

import kr.co.ictedu.mvc.dto.upBoardDTO;

public interface UpBoardDaoInter {
	void upboardAdd(upBoardDTO vo);

	List<upBoardDTO> upboardlist();

	int getTotal();

	List<upBoardDTO> upboardList();
}
