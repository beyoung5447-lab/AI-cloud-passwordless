package ex2;

public class Ex4_StaticBlock {
	static int num;
	int age;
	static {
		System.out.println("메인 보다 초기화해서 시작 1");
	}

	public static void main(String[] args) {
		System.out.println("메인 시작 2");
	}
}
