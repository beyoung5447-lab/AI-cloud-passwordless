package ex3;

public class E extends C{
	private String typev;
	public E(String typev) {
		super(typev);
		System.out.println(typev+"E클래스 생성");
		this.typev=typev;

}
	@Override
	public void testA() {
		// TODO Auto-generated method stub
		super.testA();
		System.out.println("지식의 재정의 된"+typev+"E메서드가 호출이 됨");
	}
}