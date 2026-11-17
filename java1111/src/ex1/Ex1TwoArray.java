package ex1;

import java.util.Arrays;

public class Ex1TwoArray {
public static void main(String[] args) {
	String [][] strArr= {{"감자","고구마","토마토"}, 
			{"사과","딸기","포도"}};
			for (String[] e: strArr) {
				//System.out.println(e);
				for (String f : e) {
					System.out.println(f+"\t");
					
				}
				System.out.println("");
			}
			System.out.println("______________");
			String[] strArr2;
			strArr=new String[][] {{"감자","고구마","토마토"}, 
				{"사과","딸기","포도"}};
				System.out.println(Arrays.deepToString(strArr));
}

}
