package ex1;

public class Ex1_Hello {
	private String msg;
	public Ex1_Hello() {
		System.out.println("나의 첫번쩨 스타일!");
	}
	public String printHello() {
		return "만나서 반가워요"+msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
