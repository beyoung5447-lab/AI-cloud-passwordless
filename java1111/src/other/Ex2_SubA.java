package other;
import ex2.Ex2_SuperA;
public class Ex2_SubA extends Ex2_SuperA {
private int mymum;
public  Ex2_SubA() {
	mymum = 50000;
	System.out.println("자식의 생성자 호출");
}
public void printB() {
	System.out.println(mymum);
	System.out.println("부모 자원==========");
	System.out.println("Num1 => "+getNum1());
	System.out.println(name);
	//System.out.println(name); -> 사용 불가
}
public static void main(String[] agrs) {
	// 자식을 참조자료형:
	// 부모도 참조, 내꺼도 참조해서 쓸 목적으로 선언
	Ex2_SubA ref = new Ex2_SubA();
	ref.printB();
	System.out.println("-------------------------------");
	ref.printA();
}
}
