package ex4.gen;

public class Ex3_Extends {
public static <T extends Number> double twice(T number) {
	return number.doubleValue();
}
public static void main(String[] args) {
	System.out.println(twice(10));
	System.out.println(twice(2.5));
	
}
}
