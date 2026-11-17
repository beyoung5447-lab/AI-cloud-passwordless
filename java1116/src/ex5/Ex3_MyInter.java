package ex5;

public interface Ex3_MyInter {
	int date = 100;

	public default void printDefault() {
		System.out.println("디폴트 메서드");
	}

	public void printDatal();
}
