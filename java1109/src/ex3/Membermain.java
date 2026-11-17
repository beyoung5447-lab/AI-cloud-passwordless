package ex3;

public class Membermain {
	public static void main(String[] args) {
		Member ref = new Member();
		ref.setNum(1);
		int myN = ref.getNum();
		System.out.println(myN);
		System.out.println("입력 및 출력");
		ref.setId("xman");
		String myId = ref.getId();
		System.out.println("myID" + myId);
		String agg = "";
		if (ref.isAgree()) {
			agg = "동의함";
		} else {
			agg = "미동의";
			System.out.println("동의 여부" + agg);
		}
	}

}
