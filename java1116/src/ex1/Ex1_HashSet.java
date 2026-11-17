package ex1;

import java.util.HashSet;
import java.util.Iterator; 

public class Ex1_HashSet {
	public static void main(String[] args) {
		HashSet<String> h1 = new HashSet<>();
		h1.add("ztest");
		h1.add("Btest");
		h1.add("Atest");
		h1.add("Ctest");
		h1.add("Btest");
		h1.add("Ktest");
		h1.add("Ktest");
		h1.add("Ktest");
		System.out.println("크기:" + h1.size());
		System.out.println(h1.toString());
		System.out.println("----------------------------");
		for (String e : h1) {
			System.out.println(e + ":" + e.charAt(0));
		}
		System.out.println("----------------------------");
		Iterator<String> it = h1.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}
}