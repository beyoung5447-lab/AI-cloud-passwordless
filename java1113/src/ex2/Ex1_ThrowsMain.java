package ex2;

public class Ex1_ThrowsMain {
    public static void main(String[] args) {
        
        Ex1_ThrowsExample example = new Ex1_ThrowsExample();

        System.out.println("=== 1. 존재하는 클래스 테스트 ===");
        
        example.findClass("java.lang.String");

        System.out.println("\n=== 2. 존재하지 않는 클래스(오타) 테스트 ===");
        
        example.findClass("java.lang.NotExistsClass");
    }
}