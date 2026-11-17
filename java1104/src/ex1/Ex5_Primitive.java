package ex1;

public class Ex5_Primitive {
    public static void main(String[] args) {
        byte d = 100;
        System.out.println(d);
        byte e = 10;
        int res1 = d + e;
        System.out.println("캐스팅 결과 => " + res1);
        
        short c1 = 50;
        System.out.println(c1);
        short c2 = 50;
        int c_res1 = c1 + c2;
        System.out.println("캐스팅 결과 => " + c_res1);
        
        int l_num;
        //l_num = 10000000000L; // int 범위를 벗어나는 큰 값은 뒤에 L을 붙여야 함
        
        // 1. 숫자로 시작하는 변수명 수정 및 중복 이름 회피
        long longNum = 10000000000000000L; 
        long l_num2 = 100L;
        long num_l = 100L;
        
        System.out.println("값 확인: " + System.currentTimeMillis());
        
        // 2. 세미콜론 및 괄호 오류 수정
        int time1 = (int) System.currentTimeMillis();
        long time2 = System.currentTimeMillis();
        
        System.out.println("정상적인 값 확인 => " + time2);
    }
}