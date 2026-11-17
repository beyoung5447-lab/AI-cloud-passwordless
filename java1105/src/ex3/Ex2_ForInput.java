package ex3;

import java.util.Scanner;

public class Ex2_ForInput {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("strat");
	int n= Integer.parseInt(sc.nextLine());
	System.out.print("end");
	int m= Integer.parseInt(sc.nextLine());
	for(int i=n; i<=m; i++) {
		System.out.println(i);
	}
}
}
