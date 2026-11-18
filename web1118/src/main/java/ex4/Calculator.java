package ex4;
@FunctionalInterface
public interface Calculator {
	int calculate(int a, int b);
	default void test1() {
		System.out.println("Test1");
	}
	default void test2( ) {
		System.out.println("Test1");
	}
}
