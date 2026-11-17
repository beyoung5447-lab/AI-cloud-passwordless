package ex1;

public abstract class Ex1_Abstract2 {
private int n;
public Ex1_Abstract2() {
	System.out.println("추상 클래스의 생성자 호출");
}       
public void ex2_method() {
	System.out.println("메서드 호출!");
}
public abstract void myAbstract1();
public abstract String myAbstract1(int n);
}
