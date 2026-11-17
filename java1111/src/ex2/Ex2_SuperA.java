package ex2;

public class Ex2_SuperA {
	private int num1;
int num2;
protected String name;
public  Ex2_SuperA() {
	num1= 10000;
	num2= 20000;
	name = "ICTpassword 종로 1";
	System.out.println("Log:부모 클래스 생성");
	
}
public int getNum1() {
	return num1;
}
public void setNum1(int num1) {
	this.num1 = num1;
}
public int getNum2() {
	return num2;
}
public void setNum2(int num2) {
	this.num2 = num2;
}
public void printA() {
	System.out.println(name + "부모의 메서드 호출!");
}

}
