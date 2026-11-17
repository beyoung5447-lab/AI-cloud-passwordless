package ex3;

public class Ex5_ToArray {
	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}};
		
		System.out.println("2차원 배열 길이 (행 개수): " + arr.length);
		System.out.println("첫 번째 1차원 배열 길이 (열 개수): " + arr[0].length);
		System.out.println("두 번째 1차원 배열 길이 (열 개수): " + arr[1].length);
		System.out.println("배열 요소 값 arr[0][1] => " + arr[0][1]); 
		System.out.println("배열 요소 값 arr[1][1] => " + arr[1][1]); 
		
		System.out.println("\n--- 1. 일반 for문으로 2차원 배열 출력 ---");
		for (int i = 0; i < arr.length; i++) {          
			for (int j = 0; j < arr[i].length; j++) {    
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println(); 
		}
		
		System.out.println("\n--- 2. 향상된 for문(For-each)으로 2차원 배열 출력 ---");
		for (int[] row : arr) {            
			for (int val : row) {         
				System.out.print(val + "\t");
			}
			System.out.println(); 
		}
	}
}