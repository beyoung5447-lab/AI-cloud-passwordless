package ex1;

public class Ex6_primitive {
    public static void main(String[] args) {
        // var1 변수를 위쪽에서 먼저 선언합니다.
        char var1 = '\u0000';
        System.out.println("문자열 예시: " + var1);

        char Var3 = '나';
        System.out.println("자바에서 한문자를 저장하기 위한 자료형: char => " + Var3);
        
        System.out.println("초기값: " + var1);
        
        char Var2 = '\u0061';
        System.out.println("초기값: " + Var2);
        System.out.println("char 타입의 초기 값 \\u0061 => " + Var2);
        
        Var2 = '\u0062';
        System.out.println("char 타입의 초기 값 \\u0062 => " + Var2);
        
        Var2 = '\u007A';
        System.out.println("char 타입의 초기 값 \\u007A => " + Var2);
        
        char var3 = 97;
        System.out.println(var3);
        
        var3 = 65;
        System.out.println(var3);
        
        char ch1 = 'A';
        short ch2 = 1;
        char res = (char) (ch1 + ch2);
        System.out.println(res);
    }
}