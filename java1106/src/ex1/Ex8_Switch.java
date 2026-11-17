package ex1;

public class Ex8_Switch {
public static void main(String[] args) {
	int times = (int) ((Math.random()*4)+8);
	System.out.println("[현재시간:" + times + "시]");
	switch (times) {
	case 8:
		System.out.println("8시 출근 합니다");
		break;
	case 9:
		System.out.println("9시 회의 합니다");
		break;
	case 10:
		System.out.println("10시 업무 합니다");
		break;
	case 11:
		System.out.println("11시 파견 합니다");
		break;
		default:
			System.out.println("업무가 없습니다");
	}
	System.out.println("------------");
	switch (times) {
	case 8:
		System.out.println("8시 출근 합니다");
	case 9:
		System.out.println("9시 회의 합니다");
	case 10:
		System.out.println("10시 업무 합니다");
	case 11:
		System.out.println("11시 파견 합니다");
	default:
			System.out.println("업무가 없습니다");}
	
}
}
