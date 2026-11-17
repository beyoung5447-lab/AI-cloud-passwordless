package ex2;

public class Ex1_ThrowsExample {
    
    public void findClass(String className) {
        try {
            System.out.println("해당 클래스는: " + Class.forName(className));
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("팡팡! 축하합니다. 오타에요");
        }
    }
}