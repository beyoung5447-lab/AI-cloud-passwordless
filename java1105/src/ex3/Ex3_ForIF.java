package ex3;

public class Ex3_ForIF {
public static void main(String[]args) {
	int num = 1;
	
  //  if (num % 2 ==0) {
		System.out.print(num+"은 짝");
//	} else {
	//	System.out.print(num+"은 홀");
	//}
	for(int i=1; i<11;i++) {
		 if (num % 2 ==0) {
				System.out.print(num+"은 짝");
			} else {
				System.out.print(num+"은 홀");
			}
	}
}
}
