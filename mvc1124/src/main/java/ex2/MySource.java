package ex2;

public class MySource {
	private String source;

	public MySource(String source) {
		this.source = source;
		System.out.println(" 생성자를 통해서 주입 받은 값" + source);
	}

	public String reTurnSource() {
		StringBuilder sb = new StringBuilder();
		sb.append("DI 실습:");
		sb.append(source);
		return sb.toString();

	}
}
