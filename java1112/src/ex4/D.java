package ex4;

public class D implements BCDInter{
	public D() {
		System.out.println("D생성자 호출");
	}
	//public void bMethod() {System.out.println("D서비스");}
	@Override
	public void bcdservice() {
		// TODO Auto-generated method stub
		System.out.println("D서비스");
	}

}
