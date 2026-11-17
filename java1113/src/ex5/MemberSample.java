package ex5;

import java.util.Scanner;

public class MemberSample {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (true) {
		System.out.println("Menu: 1-add,2-list, 3-exit");
		int menu = Integer.parseInt(sc.nextLine());
		switch(menu) {
		case 1: 
			System.out.println("ref.addMember(v1)");
			break;
		case 2: 
			System.out.println("String res = ref.getMemberList():");
			break;
		case 3: 
			System.out.println("종료!");
			break;
		}
		
	}
}
}
