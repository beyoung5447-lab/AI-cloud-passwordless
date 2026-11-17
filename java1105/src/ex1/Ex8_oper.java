package ex1;

public class Ex8_oper {
public static void main(String[] args) {
	int a = 0;
	a = a + 10;
	System.out.println(a);
	System.out.println("1) a = -5"+ (a-=5));
	System.out.println(a);
	System.out.println("2) a *= 10: "+ (a-=10));
	System.out.println(a);
	System.out.println("3) a /= 2: "+ (a/=2));
	System.out.println(a);
	System.out.println("3) a %= 2: "+ (a%=2));
	System.out.println(a);
}
}
