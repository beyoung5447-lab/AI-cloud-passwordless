package ex1;

import java.util.Scanner;

public class Ex2_Method2 {
	public static void hello(String className) {
		System.out.println("안녕하세요!******");
		System.out.println("자바 수업입니다");
	}
	public static void hello(int num) {
		System.out.println(num);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("첫번째 강의 입력");
	String cName = sc.nextLine();
	hello(cName);
	hello(100);
	System.out.println("두번째 강의 입력");
	cName = sc.nextLine();
	hello(cName);
	sc.close();
}
}
