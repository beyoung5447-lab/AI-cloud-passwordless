package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dto.MemoDTO;
import factory.FactoryService;

public class MemoDao {
private static MemoDao dao;
private MemoDao() {
	
}
public static MemoDao getDao() {
	if (dao == null) {
		dao = new MemoDao();
		
	}
	return dao;
}
public void addMemo(MemoDTO v) {
	SqlSession ss = FactoryService.getFactory().openSession();
	ss.insert("memo.add",v);
	ss.commit();
	ss.close();
}
public List<MemoDTO> listMemo() {
	SqlSession ss= FactoryService.getFactory().openSession();
	List<MemoDTO> list = ss.selectList("memo.list"); 
	ss.close();
	return list;
}
public MemoDTO detail(int num) {
	SqlSession ss = FactoryService.getFactory().openSession();
	MemoDTO v = ss.selectOne("memo.detail",num);
	ss.close();
	return v ;
}
public void delete (int num) {
	SqlSession ss = FactoryService.getFactory().openSession();
	ss.delete("memo.del",num);
	ss.commit();
	ss.close();
}
public void update(MemoDTO v) {
	SqlSession ss = FactoryService.getFactory().openSession();
	ss.update("memo.up",v);
	ss.commit();
	ss.close();
	
}

}
