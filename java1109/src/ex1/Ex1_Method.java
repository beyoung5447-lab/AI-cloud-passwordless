package ex1;

public class Ex1_Method {
	public static void main(String[] args) {
		//System.out.println("안녕하세요!");
		//System.out.println("자바 수업입니다");
		//System.out.println("안녕하세요!");
		//System.out.println("자바 수업입니다");
		//System.out.println("안녕하세요!");
		//System.out.println("자바 수업입니다");
		hello();
		System.out.println("-----------------");
		hello();
		System.out.println("-----------------");
		hello();
		System.out.println("-----------------");
		System.out.println("반복문 안에서 호출!!");
		for(int i=0; i<3; i++) {
			hello();
			System.out.println("-----------------");
		}
		
		
	}
public static void hello() {
	System.out.println("안녕하세요!");
	System.out.println("자바 수업입니다");
	
	
}

}
