package ex1;


public class Ex15_Continue {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("-----------------");
		
		int i = 1;
		while (i <= 5) {
			if (i == 4) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		i = 1;
		do {
		if (i == 4) {
		i++;
		continue;
		}
		System.out.println(i);
		i++;

		} while (i <= 5);
		
	}
}