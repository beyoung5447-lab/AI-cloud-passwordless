package ex4;

public class C implements BCDInter {
	public C() {
		System.out.println("C생성자 호출");
	}
	//public void bMethod() {System.out.println("C서비스);}
	@Override
	public void bcdservice() {
		System.out.println("C서비스");
		
	}
}
