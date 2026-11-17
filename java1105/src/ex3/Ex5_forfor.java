package ex3;

public class Ex5_forfor {
    public static void main(String[] args) {
        // 2단부터 9단까지 반복
        for (int i = 2; i <= 9; i++) {
            System.out.println("=== " + i + "단 ===");
            
            // 각 단의 1부터 9까지 곱하기
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            
            System.out.println(); // 단이 끝날 때마다 빈 줄 추가
        }
    }
}