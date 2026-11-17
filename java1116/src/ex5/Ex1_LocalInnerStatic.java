package ex5;

import ex4.Ex1_SuperInner;

public class Ex1_LocalInnerStatic {

    private int num;

    public Ex1_LocalInnerStatic() {
        num = 100;
    }

    static class Inner extends Ex1_SuperInner {
        int num = 300;
        static int num5 = 10;
        private Ex1_LocalInnerStatic outer; 

        public Inner(Ex1_LocalInnerStatic outer) { 
            this.outer = outer;
            System.out.println("Inner 객체가 생성됨");
        }

        @Override
        public void innerMethod() {
            System.out.println("내부 클래스가 재정의된 메서드");
        }

        public static void as() {}
        
        public void getData(int num, final int cnum) {
            System.out.println("실수 num:" + num);
            System.out.println("실수값 cnum:" + cnum);
            
            
            System.out.println("외부 클래스의 멤버인 num:" + outer.num);
            innerMethod();
        }
        
        public void insertTest(int num) {
            int num2 = 10;
            num2 = 200;
            final int cnum = 1000;
        }
        public static void main(String[] args) {
        	Ex1_LocalInnerStatic ref = new Ex1_LocalInnerStatic();
        	
        	}
		}
    } 
