package ex1;

public class Ex3_Var {
public static void main(String[] args) {
	byte n1 = 1;
	byte n2 = 2;
	//-byte n3 = (byte) (n1 + n2);
	int n3 = n1 + n2;
	short num = 129;
	byte bnum = (byte) num;
	System.out.println("short -> byte:"+bnum);
}
}
