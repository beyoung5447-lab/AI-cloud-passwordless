package ex2;

public class Ex1_StackMethod {
    public void testA() {
        int num = 10;
        testA(num); 
        System.out.println("num1=>" + num);
    }

    private void testA(int num) {
        num += 10;
        System.out.println("num2=" + num);
    } 

    public static void main(String[] args) {
        Ex1_StackMethod ref = new Ex1_StackMethod();
        ref.testA();
        
    }
}