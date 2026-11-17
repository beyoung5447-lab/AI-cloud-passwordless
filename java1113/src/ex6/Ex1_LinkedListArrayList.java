package ex6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex1_LinkedListArrayList {
	public void linkedList(LinkedList<String> ar) {
		long start = System.currentTimeMillis();
		for (String e : ar) {
			String msg = e;
			if (e.equals("ICTpassword01")) {
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("소요시간: " + (end - start) + "ms");
	}
	
	public void arrayList(ArrayList<String> ar) {
		long start = System.currentTimeMillis();
		for (String e : ar) {
			String msg = e;
			if (e.equals("ICTpassword01")) {
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("소요시간: " + (end - start) + "ms");
	}
	
	public static void main(String[] args) {
		Ex1_LinkedListArrayList ref = new Ex1_LinkedListArrayList();
		Scanner sc = new Scanner(System.in); 
		System.out.println("1-ArrayList, 2-LinkedList:");
		int menu = Integer.parseInt(sc.nextLine());
		
		if (menu == 1) { // = -> ==
			ArrayList<String> ar1 = new ArrayList<String>(); 
			for (int i = 0; i < 10000000; i++) { 
				if (i % 5 == 0) {
					ar1.add("ICTpassword01");
				} else {
					ar1.add("Java"); 
				}
			}
			ref.arrayList(ar1); 
		} else if (menu == 2) {
			LinkedList<String> ar1 = new LinkedList<String>();
			for (int i = 0; i < 10000000; i++) {
				if (i % 5 == 0) {
					ar1.add("ICTpassword01");
				} else {
					ar1.add("Java");
				}
			}
			ref.linkedList(ar1);
		}
		
	}
}
