package ex3;

import java.util.Scanner;

public class Exam1 {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.print("정수를 입력하세요:");
int m = Integer.parseInt(sc.nextLine());

System.out.print("범위를 입력하세요:");
int n = Integer.parseInt(sc.nextLine());

for (int i=1; i<=m; i++) {

System.out.print(i+" ");
if (i%n==0) {

System.out.println("");

}


}

}

}