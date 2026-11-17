package ex1;

public class Ex1_Exception {
public static void main(String[] args)  {
try {
	Class<?> msg = Class.forName("ex1.Ex1_Exception");
	System.out.println("Message=>"+msg);
} catch (ClassNotFoundException e) {
	System.out.println("예외가 발생!");
	for (int i = 0; i < 10; i++) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			
			e1.printStackTrace();
		}
		System.out.println(i);
	}
}
System.out.println("=====================");
}
}
