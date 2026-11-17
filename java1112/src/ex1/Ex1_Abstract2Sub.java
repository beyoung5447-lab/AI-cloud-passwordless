package ex1;

public class Ex1_Abstract2Sub extends Ex1_Abstract2{

	@Override
	public void myAbstract1() {
		// TODO Auto-generated method stub
		System.out.println("지식이 재정의한 매서드1");
	}

	@Override
	public String myAbstract1(int n) {
		// TODO Auto-generated method stub
		return "지식이 재정의한 메서드"+n;
	}
	public void subMethod() {
		System.out.println("지식 메서드!");
	}
	public static void main(String[] args) {
		Ex1_Abstract2Sub ref1 = new Ex1_Abstract2Sub();
		ref1.subMethod();
		String msg= ref1.myAbstract1(10);
		Ex1_Abstract2Sub ref2 = new Ex1_Abstract2Sub();
		ref2.subMethod();
		String msg2= ref1.myAbstract1(20);
		System.out.println(msg);
		System.out.println(msg2);
	}
}
