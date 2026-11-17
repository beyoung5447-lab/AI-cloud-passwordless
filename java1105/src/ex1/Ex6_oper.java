package ex1;

public class Ex6_oper {
	public static void main(String[] args) {
		String msg ="ICTPasswordLess";
		System.out.println(msg);
		System.out.println("문자열의 길이(length):" + msg.length());
		char cc = msg.charAt(0);
		System.out.println("한문자만 반환하는 매서드 charAt(idx):"+cc);
		String res = (cc =='I')? cc + "별": cc + "하트";
		System.out.println(res);
		int res2 = (cc=='I')? 100 : 50;
		System.out.println(res2);
		
		
	}

}
