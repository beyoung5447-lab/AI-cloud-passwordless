package ex2;

public abstract class Airplane {
	public Airplane(String airplaneName) {
		System.out.println(airplaneName + "비행기가 활주로에서 진입합니다");
	}

//public void fly() {
//	System.out.println("일반적인 비행");
//}
	public abstract void fly();

	public final void takeoff() {
		System.out.println("이륙합니다");
	}

	public final void land() {
		System.out.println("착륙합니다");

	}
}