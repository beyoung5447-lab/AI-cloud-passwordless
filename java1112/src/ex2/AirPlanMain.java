package ex2;

public class AirPlanMain {
public static void main(String[] args) {
	LightAirCraft ref = new LightAirCraft();
	ref.fly();
	ref.submethod();
	System.out.println("-----------------");
	Airplane ref2= new LightAirCraft();
	ref2.fly();
	
}
}
