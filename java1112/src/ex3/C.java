package ex3;

public class C extends A {
	private String typev;
	public C(String typev) {
		super(typev);
		System.out.println(typev+"C클래스 생성");
		this.typev=typev;
	}
	@Override
	public void testA() {
		// TODO Auto-generated method stub
		System.out.println("지식의 재정의 된"+typev+"C메서드가 호출이 됨");
	}
}
