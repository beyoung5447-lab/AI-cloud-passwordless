package ex4;

public class B implements BCDInter {
public B() {
	System.out.println("B생성자 호출");
}
//public void bMethod() {System.out.println("B서비스);}
@Override
public void bcdservice() {
	System.out.println("B서비스");
	
}
}
