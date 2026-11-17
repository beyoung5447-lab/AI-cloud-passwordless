package ex2;

import java.util.Scanner; // 1. Scanner import 추가

public class Ex1_ElseIF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("자녀의 나이를 입력 하세요: ");
        
        int age = sc.nextInt(); // 2. 사용자가 입력한 값을 age 변수에 저장
        
        if (age >= 8) {
            System.out.println("학교에 다님");
        } else {
            System.out.println("학교에 안다님");
        }
        
        sc.close(); // 3. 스캐너 사용 종료 (선택사항이지만 권장)
    }
}