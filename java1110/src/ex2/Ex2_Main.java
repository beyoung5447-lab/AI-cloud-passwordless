package ex2;

public class Ex2_Main {
	 public static void main(String[] args) {
			Ex2_StaticBaisc ref = new Ex2_StaticBaisc();
			System.out.println(ref.num1);
			System.out.println(ref.num2);
			System.out.println(Ex2_StaticBaisc.num2);
			Ex2_StaticBaisc.testMethod();
		}
	
}
