package ex10;

import java.util.Scanner;

public class StudentRequestMain {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("이름:");
	String name = sc.nextLine();
	System.out.println("나이:");
	int age = Integer.parseInt(sc.nextLine());
	StudentRequest s1 = new StudentRequest(name,age);
	System.out.println(s1);
	try {
		StudentRequest S2 = new StudentRequest(name,age);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
