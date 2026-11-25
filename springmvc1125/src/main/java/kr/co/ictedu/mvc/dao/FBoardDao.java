package kr.co.ictedu.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ictedu.mvc.dto.FBoardDTO;
@Repository
public class FBoardDao implements FBoardDaoInter {
	// <bean id="ss" class="org.mybatis.spring.SqlSessionTemplate">
	@Autowired
	private SqlSessionTemplate ss;
	@Override
	public List<FBoardDTO> listFBoard() {
		// ss.selectList(namespace.id��):List<?>
		//<select id="list" resultType="fvo">
		//select * from fboard order by 1 desc 
		return ss.selectList("fb.list");
	}
	@Override
	public void addFBoard(FBoardDTO vo) {
		//<insert id="add" parameterType="fvo">
		ss.insert("fb.add", vo);	
	}
	@Override
	public void updateHit(int num) {
		ss.update("fb.hit", num);
	}
	@Override
	public FBoardDTO detailFboard(int num) {
		//<select id="detail" parameterType="int" resultType="fvo">
		return ss.selectOne("fb.detail", num);
	}

}