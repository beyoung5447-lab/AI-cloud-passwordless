package ex2;

public class supersonicAirplane extends Airplane {
public supersonicAirplane () {
	super("supersonicAirplane");
}

@Override
public void fly() {
	
	
	System.out.println("초음속 비행 합니다");
}
public static void main(String[] args) {
	supersonicAirplane ref = new supersonicAirplane();
	ref.takeoff();
	ref.fly();
	ref.land();
}
}
