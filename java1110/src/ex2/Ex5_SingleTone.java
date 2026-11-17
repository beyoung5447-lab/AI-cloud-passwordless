package ex2;

public class Ex5_SingleTone {
	
	private static Ex5_SingleTone ref; // 생선되 주소를 static에 참조 변수로 저장

	private Ex5_SingleTone() {
		System.out.println("생성가 호출이 됨!!");
	}

	public static Ex5_SingleTone getInstance() {
		if (ref == null) {
			ref = new Ex5_SingleTone();
		}
		return ref;
	}

}
