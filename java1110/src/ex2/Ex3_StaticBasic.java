package ex2;

public class Ex3_StaticBasic {
	static int num1;
	int num2;

	public Ex3_StaticBasic(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;

	}

	public void incrementNumber() {
		num1 += 1;
		num2 += 1;
	}

	public static void incrementstaticNumber() {
		num1 += 1;
	}

	public void resultVal() {
		System.out.println("static변수" + num1);
		System.out.println("인스턴스변수" + num2);
	}

	public static void main(String[] args) {
		Ex3_StaticBasic ref1 = new Ex3_StaticBasic(0, 0);
		Ex3_StaticBasic ref2 = new Ex3_StaticBasic(0, 0);
		ref1.incrementNumber();
		ref2.incrementNumber();
		ref1.resultVal();
		System.out.println("---------------------");
		ref2.resultVal();
		System.out.println("----------------------");
	}
}
