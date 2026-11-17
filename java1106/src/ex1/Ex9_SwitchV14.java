package ex1;

public class Ex9_SwitchV14 {
public static void main(String[] args) {
	int num =95;
	String res;
	switch (num/10) {
	case 10,9:
		res = "a학점";
	    break;
	case 8:
		res = "b학점";
		break;
	case 7:
		res = "c학점";
		break;
	case 6:
		res = "d학점";
		break;
	default:
		res = "f학점";
	}
	System.out.println(num+"정수의 학점 ==>"+ res);
	System.out.println("-----------");
	res = switch (num/10) {
	case 10,9 -> "a학점";
	case 8 -> "b학점";
	case 7 -> "c학점";
	case 6 -> "d학점";
	default -> "f학점";
};
System.out.println(num+"정수의 학점 ==>"+ res);
System.out.println("-----------");
res = switch (num/10) {
case 10,9 -> "a학점";
case 8 -> "b학점";
case 7 -> "c학점";
case 6 -> "d학점";
default -> "f학점";};
	
	
}

}
