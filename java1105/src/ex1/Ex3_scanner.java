package ex1;

import java.util.Scanner;

public class Ex3_scanner {
public static void main(String[] args) {
	// 지역 변수, 참조 변수로 선언 **
	//Scanner sc;
	//sc = new Scanner(System.in);
	Scanner sc = new Scanner(System.in);
	System.out.print("이름:");
	String name = sc.nextLine();
	System.out.println("당신의 이름은 =>"+name+"입니다");
	System.out.print("나이:");
	String ageStr = sc.nextLine();
	System.out.println("당신의 나이는 =>"+ageStr+"입니다");
	System.out.print("지역:");
	String loc = sc.nextLine();
	System.out.println("당신의 지역은 =>"+loc+"입니다");
	int age = Integer.parseInt(ageStr);
	if (age <= 19) {
		System.out.println("미성년"); 
		
	}else {
		System.out.println("성년");
		
	}
	
}
}