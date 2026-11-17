package ex4;

public class Ex1_Inner {
	private int num;

	public Ex1_Inner() {
		num = 100;
	}

	public void myOuter() {
		System.out.println("외부 클래스의 메서드!");
	}

	public void work() {
		System.out.println("외부 클래스가 하는 업무!");
	}

	public class Inner {
		private int innerNum = 10;

		
		public void aa() {
			System.out.println("static 메서드네");
		}

		public void myInner() {
			System.out.println("외부 클래스의 private:" + num);
			System.out.println("내부 클래스의 private:" + innerNum);
			myOuter();
		}
	}

	public static void main(String[] args) {
		Ex1_Inner ref = new Ex1_Inner();
		
		
		Ex1_Inner.Inner inner = ref.new Inner();
		inner.myInner();
		
		System.out.println("*********");
		ref.myOuter();
		
		
		Ex1_Inner.Inner inner2 = ref.new Inner();
		inner2.myInner();
		inner2.myInner();
		
		
		new Ex1_Inner().new Inner().myInner();
		new Ex1_Inner().new Inner().aa();
	}
}
