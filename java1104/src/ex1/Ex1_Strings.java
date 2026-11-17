package ex1;

public class Ex1_Strings { //- 클래스 영역
	public static void main(String[]args) { //- 메서드 영역   
		System.out.println("화면 출력");
		test();
		int num = 10;
		System.out.println("숫자 출력:"+num);
		test();
	}
    public static void test() {
    	System.out.println("테스트 메서드가 호출이 됨!");
    }
}
