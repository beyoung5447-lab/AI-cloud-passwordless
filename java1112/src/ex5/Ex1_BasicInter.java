package ex5;

public interface Ex1_BasicInter {
     public static final int num = 10;
     int num2 = 20;
     void abMethod();
     public default void myDefault() {
    	 System.out.println("인터페이스 전용 기본에서도");
     }
     public static void mystatic() {
    	 System.out.println("static 매서드");
     }
}
