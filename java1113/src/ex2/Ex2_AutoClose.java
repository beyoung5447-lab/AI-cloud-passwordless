package ex2;

// AutoClose 대신 자바 표준 인터페이스인 AutoCloseable을 구현합니다.
public class Ex2_AutoClose implements AutoCloseable {
    
    public Ex2_AutoClose() {
        System.out.println("생성자 호출");
    }

    @Override
    public void close() throws Exception {
        System.out.println("자원 해제 됨");
    }

    public void print() {
        System.out.println("출력!!");
    }
}