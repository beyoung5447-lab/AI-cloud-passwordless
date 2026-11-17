package ex5;

public class Ex1_BasicImple implements Ex1_BasicInter {

	@Override
	public void abMethod() {
	 System.out.println("Interface 상수:"+num);
	 System.out.println("Interface 상수:"+num2);
	 myDefault();
	 Ex1_BasicInter.mystatic();
	 
		
	}
	public static void main(String[] args) {
		Ex1_BasicImple ref= new Ex1_BasicImple();
		ref.abMethod();
	}
	@Override
	public void myDefault() {
		// TODO Auto-generated method stub
		Ex1_BasicInter.super.myDefault(); {
			System.out.println("여기는 구현한 클래스에서 제정의함!");
		}
	}

}
