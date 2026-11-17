package ex1;

public class A {
	private int num;
	private String msg;

	public A() {
		num = 0;
		msg = "기본 메세지";

	}

	public A(int num) {

		this.num = num;
		msg ="기본메세지";
		

	}

	public A(int num, String msg) {
		super();
		this.num = num;
		this.msg = msg;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}


}
