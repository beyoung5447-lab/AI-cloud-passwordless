package ex3.dao;

import ex3.dto.MyorderDTO;

public class MyorderDao {

	private static MyorderDao dao;

	private MyorderDao() {
	}

	public static MyorderDao getDao() {

		if (dao == null) {
			dao = new MyorderDao();
		}
		return dao;
	}

	public void addOrder(MyorderDTO v) {
		System.out.println("name" + v.getName());
		System.out.println("age" + v.getAge());
		System.out.println("order" + v.getOrder());
	}
}
