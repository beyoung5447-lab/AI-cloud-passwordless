package ex1;

import java.util.Scanner;

public class Ex5_oper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1 입력");
		int numA = Integer.parseInt(sc.nextLine());
		System.out.print("숫자 2 입력");
		int numB = Integer.parseInt(sc.nextLine());
		//int numA = 10;
		//int numB = 2;
		int resNum1 = numA + numB;
		int resNum2 = numA - numB;
		int resNum3 = numA * numB;
		int resNum4 = numA / numB;
		int resNum5 = numA % numB;
		String integer = sc.nextLine();
        System.out.println(numA + "-"+numB+"="+ resNum2);
		System.out.println(numA + "*"+numB+"="+ resNum3);
		System.out.println(numA + "/"+numB+"="+ resNum4);
		System.out.println(numA + "%"+numB+"="+ resNum5);
	}

}
