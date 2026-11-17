package ex3;

import java.util.Scanner;

public class Ex2_Array2 {

	public static int[] makeArray(int num) {
		int[] arr1;
		if (num == 3) {
			arr1 = new int[3];
		} else {
			arr1 = new int[5];
		}
		System.out.println("배열의 크기: " + arr1.length);
		return arr1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("배열 크기:");
		int num = Integer.parseInt(sc.nextLine());

		int[] arr = makeArray(num);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]:");
			int idx = Integer.parseInt(sc.nextLine());
			arr[i] = idx;
		}

		System.out.println("모든 값이 입력이 완료 되었습니다");

		for (int e : arr) {
			System.out.println(e);
		}

		sc.close();
	}
}

