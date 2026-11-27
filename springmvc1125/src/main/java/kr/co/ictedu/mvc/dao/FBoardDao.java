package kr.co.ictedu.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ictedu.mvc.dto.FBoardDTO;

// ������ó���� ���� ������̼�*****
@Repository
public class FBoardDao implements FBoardDaoInter {
	@Autowired
	private SqlSessionTemplate ss;

	@Override
	public List<FBoardDTO> listFBoard() {
		return ss.selectList("fb.list");
	}

	@Override
	public void addFBoard(FBoardDTO vo) {
		ss.insert("fb.add", vo);
	}

	@Override
	public void updateHit(int num) {
		ss.update("fb.hit", num);
	}

	@Override
	public FBoardDTO detailFBoard(int num) {
		return ss.selectOne("fb.detail", num);
	}

	// FBoardDaointer�� ����� update �޼��带 �����Ѵ�.
	@Override
	public void updateFBoard(FBoardDTO vo) {
		ss.update("fb.update", vo);
		// MyBatis ���ۿ� �ִ� namespace="fb"�ȿ��� id�� "update"�� SQL�� �����Ѵ�.
		// vo�� �� ��ȣ(num)�� ������ ���� ã��, �����ۼ��ڡ������� �� ������ �ٲ۴�.
	}

	// FBoardDaointer�� ����� delete �޼��带 �����Ѵ�.
	@Override
	public void deleteFBoard(int num) {
		ss.delete("fb.delete", num);
		// MyBatis ���ۿ� �ִ� namespace="fb"�ȿ��� id�� "delete"�� SQL�� �����Ѵ�.
		// num�� ������ �Խñ� ��ȣ��

	}

	@Override
	public FBoardDTO detailFboard(int num) {
		// TODO Auto-generated method stub
		return null;
	}

}
