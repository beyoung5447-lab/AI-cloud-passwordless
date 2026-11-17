package ex2;

public class Ex2_SubB extends Ex2_SuperA {
    private int mymum;

    public Ex2_SubB() {
        mymum = 50000;
        System.out.println("자식의 생성자 호출");
    }

    public void printB() {
        System.out.println(mymum);
        System.out.println("부모 자원==========");
        System.out.println("Num1 => " + getNum1());
        System.out.println(num2);
        
    }

    public static void main(String[] args) {
        
        Ex2_SuperA ref = new Ex2_SubB();
        ref.printA(); 

     
        if (ref instanceof Ex2_SubB) {
            Ex2_SubB ref1 = (Ex2_SubB) ref;
            ref1.printA();
            ref1.printB();
        }

        System.out.println("-------------------");

        
        Ex2_SubB ref2 = new Ex2_SubB();
        ref2.printA();
        ref2.printB();
    }
}