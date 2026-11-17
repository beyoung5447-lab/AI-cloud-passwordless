package ex2;

public class Ex3_sub extends Ex3_FinalSuper {
public Ex3_sub() {
	method1();
}

public void method1() {
	System.out.println("자식이 제정의 해서 고친 기능: 재정의!");
}

@Override
public int hashCode() {
	
	return super.hashCode();
}
@Override
public boolean equals(Object obj) {
	
	return super.equals(obj);
}
@Override
protected Object clone() throws CloneNotSupportedException {
	
	return super.clone();
}
@Override
public String toString() {
	
	return super.toString();
}
@Override
protected void finalize() throws Throwable {
	
	super.finalize();
}
public void subMethod() {
	System.out.println("자식 전용 메서드!");
}
public static void main(String[] args) {
	Ex3_sub ref = new Ex3_sub();
	ref.method1();
	ref.subMethod();
	System.out.println("---------------");
	Ex3_FinalSuper ref2 = new Ex3_sub();
	ref2.method1();
}
}