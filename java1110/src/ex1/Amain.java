package ex1;

public class Amain {
	public static void main(String[] args) {
		A ref1 = new A();
		int myNum = ref1.getNum();
		String myMsg = ref1.getMsg();
		System.out.println("num : " + myNum + ", msg : " + myMsg);
		System.out.println("-------------------");

		A ref2 = new A(200);
		myNum = ref2.getNum();
		myMsg = ref2.getMsg();
		System.out.println("num : " + myNum + ", msg : " + myMsg);
		System.out.println("-------------------");
		
	}
}