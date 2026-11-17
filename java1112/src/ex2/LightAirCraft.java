package ex2;

public class LightAirCraft extends Airplane {

	public LightAirCraft() {
		super("LightAirCraft");
	}

	@Override
	public void fly() {
		System.out.println("저공/저속 비행");
		
	}
    public void submethod() {
    	System.out.println("지식의 매서드 입니다");}
    public static void main(String[] args) {
    	LightAirCraft ref = new LightAirCraft();
    	ref.takeoff();
    	ref.fly();
    	ref.land();
	}
}
