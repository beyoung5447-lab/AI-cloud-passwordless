package ex1;

import java.util.Scanner;

public class Ex7_Switch_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("msg1 => ");
        String msg1 = sc.nextLine();
        
        System.out.print("msg2 => ");
        String msg2 = sc.nextLine();
        
        
        System.out.println("msg1 == msg2 (참조 비교): " + (msg1 == msg2));
        System.out.println("msg1.equals(msg2) (값 비교): " + msg1.equals(msg2));
        
        
        switch (msg1) {
            case "test": 
                System.out.println("입력값이 test다"); 
                break;
            default:
                System.out.println("입력값이 test와 다르다"); 
        }
        
        
        int n = 10;
        int n1 = 10;
        System.out.println("n == n1 (기본형 비교): " + (n == n1));
        
      
        String testStr = "test";
        System.out.println("msg1과 리터럴 주소 비교: 0x" + Integer.toHexString(System.identityHashCode(msg1)));
        System.out.println("testStr 주소: 0x" + Integer.toHexString(System.identityHashCode(testStr)));
        
        System.out.println("equals => " + msg1.equals(testStr));
        System.out.println("equals => " + msg1.equals("test"));
        
        String str1 = "test";
        String str2 = "test";
        String str3 = new String("test");
        
        System.out.println("str1 == str2 (리터럴 풀 비교): " + (str1 == str2)); // true
        System.out.println("str1 == str3 (객체 비교): " + (str1 == str3));     // false (주소가 다름)
        
        if (str1 == "test") {
            System.out.println(str1 + "는 같다");
        } else {
            System.out.println(str1 + "는 다르다");
        }
        
        sc.close();
    }
}
