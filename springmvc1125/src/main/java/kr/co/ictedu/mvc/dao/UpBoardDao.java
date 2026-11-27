package kr.co.ictedu.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ictedu.mvc.dto.upBoardDTO;

@Repository
public class UpBoardDao implements UpBoardDaoInter {

	@Autowired
	private SqlSessionTemplate ss;

	@Override
	public void upboardAdd(upBoardDTO vo) {
		// <insert id="add" parameterType="upvo">
		ss.insert("upboard.add", vo);
	}

	@Override
	public List<upBoardDTO> upboardList() {
		return ss.selectList("upboard.list");
	}

	@Override
	public int getTotal() {
		return ss.selectOne("upboard.totalCount");
	}

	@Override
	public List<upBoardDTO> upboardlist() {
		// TODO Auto-generated method stub
		return null;
	}
}