package ex7;

public class ABImple2 implements InterC {

	@Override
	public void testB() {
		System.out.println("A");

	}

	@Override
	public void testA() {
		System.out.println("B");

	}

	public static void main(String[] args) {
		ABImple2 ref = new ABImple2();
		ref.testA();
		ref.testB();
	}

}
      