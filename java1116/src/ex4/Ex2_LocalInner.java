package ex4;

class Ex2_Locallnner {
    public void innerMethod() {
        System.out.println("Super의 기본 메서드");
    }
}

public class Ex2_LocalInner {
    private int num;

    public Ex2_LocalInner() {
        num = 100;
    }

    public void insertTest(int paramNum) {
        int num2 = 10;
       
        int cnum = 1000; 

        
        class Inner extends Ex1_SuperInner {
            int num3 = 300;

            public Inner() {
                System.out.println("Inner 객체가 생성됨");
            }

            @Override
            public void innerMethod() {
                System.out.println("내부 클래스가 재정의한 메서드!");
            }

            public void getData() {
                System.out.println("상수 cnum: " + cnum);
                System.out.println("전달받은 매개변수 paramNum: " + paramNum);
            }
        }

      
        Inner inner = new Inner();
        inner.getData();
        inner.innerMethod();
    }

  
    public static void main(String[] args) {
        Ex2_LocalInner ref = new Ex2_LocalInner();
        ref.insertTest(50);
    }
}
