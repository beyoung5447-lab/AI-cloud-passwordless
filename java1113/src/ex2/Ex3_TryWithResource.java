package ex2;

import java.io.FileInputStream; // FileInputStream 임포트 추가
import java.io.IOException;

public class Ex3_TryWithResource {
    public static void main(String[] args) {
        String path = "D:\\ictpass\\java\\workspace\\java1113\\src\\ex1\\msg.txt";
        
        // try-with-resource 구문의 올바른 괄호() 사용
        try (FileInputStream fis = new FileInputStream(path)) {
            System.out.println((char) fis.read());
        } catch (IOException e) { // FileInputStream은 예외 타입이 될 수 없으므로 IOException으로 처리
            e.printStackTrace();
        }
    }
}