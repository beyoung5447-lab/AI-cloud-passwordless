package ex3;

public class stealthAircraft extends Airplane {
public stealthAircraft() {
	super("stealthAircraft");
}

@Override
public void fly() {
	// TODO Auto-generated method stub
	super.fly();
	System.out.println("스텔스 비행");
}
public static void main(String[] args) {
	stealthAircraft ref = new stealthAircraft();
	ref.takeoff();
	ref.fly();
	ref.land();
}
}
