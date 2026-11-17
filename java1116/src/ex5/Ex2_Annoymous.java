package ex5;

public class Ex2_Annoymous {
	private void work() {
		System.out.println("출근 합니다");
	}

	Ex2_Person ref = new Ex2_Person() {
		@Override
		public void wake() {
			System.out.println("6시 30분에 기상!");
		}
	};

	public static void main(String[] args) {

		Ex2_Annoymous ex1 = new Ex2_Annoymous();

		ex1.ref.wake();

		ex1.work();
	}
}