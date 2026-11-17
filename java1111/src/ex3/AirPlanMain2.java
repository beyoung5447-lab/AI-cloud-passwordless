package ex3;

public class AirPlanMain2 {
    AirPlanMain2[] air;

    public static void main(String[] args) {
        // 미션: 3대의 비행기를 동시에 동작 -> 부모참조자료형 변수 = new 자식클래스의 생성자호출();
        
   
        Airplane[] airplines = new Airplane[3];
        airplines[0] = new LightAirCraft();
        airplines[1] = new stealthAircraft();
        airplines[2] = new supersonicAirplane();

        for (Airplane plane : airplines) {
            plane.takeoff();
        	plane.fly();
        	plane.land();
        	
        }
    }
}