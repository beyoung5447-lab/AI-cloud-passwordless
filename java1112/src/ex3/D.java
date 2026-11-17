package ex3;

public class D extends B{
	private String typev;
	public D(String typev) {
		super(typev);
		System.out.println(typev+"D클래스 생성");
		this.typev=typev;

}
	@Override
	public void testA() {
		// TODO Auto-generated method stub
		System.out.println("지식의 재정의 된"+typev+"D메서드가 호출이 됨");
	}
	@Override
	public void bMethod() {
		// TODO Auto-generated method stub
		System.out.println("순수한 D클래스의 메서드");
	}
}