package ex2;

public class Ex2_StaticBaisc {
    int num1 = 100;
    static int num2 = 200;
    public static void testMethod() {
    	System.out.println(num2+"는 static 자원을 사용한다");
    	
    	
    }
    public static void main(String[] args) {
		Ex2_StaticBaisc ref = new Ex2_StaticBaisc();
		System.out.println(ref.num1);
		System.out.println(ref.num2);
		System.out.println(num2);
	}
}
