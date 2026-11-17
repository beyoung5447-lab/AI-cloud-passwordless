package ex4;

import java.util.Vector;

public class Ex1_Vector {

	public Vector v;

	public Ex1_Vector() {
		v = new Vector();
		System.out.println("초기 용량: " + v.capacity());
		System.out.println("초기 사이즈: " + v.size());
		System.out.println("====================");
		String str = "Test1";
		v.add(str);
		Integer num1 = 10;
		v.add(num1);
		System.out.println("초기 용량: " + v.capacity());
		System.out.println("초기 사이즈: " + v.size());
		System.out.println("====================");
		System.out.println("index가 0인 데이터 가져오기:" + v.get(0));
		System.out.println("index가 1인 데이터 가져오기:" + v.get(1));
		for (int i = 0; i < 11; i++) {
			v.add("Test" + (i + 1));
			System.out.println("용량: " + v.capacity());
			System.out.println("사이즈: " + v.size());
			System.out.println("====================");
			System.out.println("첫인덱스 데이터 가져오기:" + v.get(0));
			System.out.println("마지막 데이터 가져오기:" + v.get(v.size() - 1));
			for (Object e : v) {
				System.out.println(e);
				
			}
			
				
			}
		}

	public static void main(String[] args) {
		Ex1_Vector ref = new Ex1_Vector();
	}
}