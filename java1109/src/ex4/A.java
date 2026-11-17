package ex4;

public class A {
public A() {
 System.out.println("기본 생성자 호출");
}
public A(String msg) {
	
}
public static void main(String[] args){
    A ref1 = new A();
	A ref2 = new A(); // ref1 변경 -> true
	System.out.println(ref1 == ref2);
	
}
}
