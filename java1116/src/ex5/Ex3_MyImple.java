package ex5;

public class Ex3_MyImple {
	Ex3_MyInter ref = new Ex3_MyInter() {

		@Override
		public void printDatal() {
			// TODO Auto-generated method stub
			
		}
	};

	public void printDatal() {
		System.out.println("익명 내부 클래스로 호출한 메서드1");
	}
public Ex3_MyImple () {
	ref.printDatal();
	ref.printDefault();
	
}
public static void main(String[] args) {
	Ex3_MyImple ref=new Ex3_MyImple();
}
}
