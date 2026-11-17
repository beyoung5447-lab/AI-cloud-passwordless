package ex1;

public class Ex6_StringRefoper {
	public static void main(String[] args) {
		test();
	}
		public static void test () {
		System.out.println("test메서드가 실행!");
		String msg = new String("test");
		String msg1 = new String("test");
		int n = 10;
		int n1 = 10;
		System.out.println(n == n1);
		System.out.println(msg == msg1);
		System.out.println("msg 주소1: 0x"+
		        Integer.toHexString(System.identityHashCode(msg)));
		System.out.println("equals =>" +msg.equals(msg1));
		System.out.println("equals => "+msg.equals("test"));
		String msg2 = "test2";
		String msg3 ="test2";
		System.out.println(msg2 == msg3);
		
		if(msg2 == "test2") {
			System.out.println(msg2+"는 같다");
		}else{
			System.out.println(msg2+"는 다르다");
			
		}
		
	}

}
