package ex1;

public class Ex14_dowhile {
public static void main(String[] args) {
	int i = 1;
	do {
		System.out.println(i);
		i++;
	} while (i <= 5);
	System.out.println("-------------");
	i = 10;
	do {
		System.out.println(i+"실행됨");
		i++;
	} while (i<5);
	i=3;
	do {
		System.out.println(i+"\t");
	} while (i>0);
	System.out.println("");
	System.out.println("--------------");
	
}
}
