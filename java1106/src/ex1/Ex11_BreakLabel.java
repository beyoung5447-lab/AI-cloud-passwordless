package ex1;

import java.util.Iterator;
import java.util.Scanner;

public class Ex11_BreakLabel {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ext: for (;;) {
		System.out.print("1-홀, 2-짝, 3-종료:");
		int num = Integer.parseInt(sc.nextLine());
	switch (num){
	case 1: 
		System.out.println("홀입니다");
		break;
	case 2: 
		System.out.println("짝입니다");
		break;
	case 3: 
		System.out.println("종료입니다");
		break ext;
		
	}
}
}

}

