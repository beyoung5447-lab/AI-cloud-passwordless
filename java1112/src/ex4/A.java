package ex4;

public class A {
	private BCDInter bcd;
	// private B b;
	// private C c;
	// private D d;

	public A(int n) {
		if (n == 1) {
			bcd = new B();
			// bcd.bMethod();
		} else if (n == 2) {
			bcd = new C();
			// c.bMethod();
		} else if (n == 3) {

		} else {

			bcd = new B();
			// bcd.bMethod();
		}

		bcd = new D();
		// d.bMethod();

		System.out.println("A 생성자 호출");
	}

	public static void main(String[] args) {
		A ref = new A(2);
	}
}