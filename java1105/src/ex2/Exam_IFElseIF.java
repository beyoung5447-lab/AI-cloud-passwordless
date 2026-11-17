package ex2;

import java.util.Scanner;

public class Exam_IFElseIF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("그룹을 입력하세요 (A 또는 B): ");
        String input = sc.next(); 
        
        char group = ' ';
        String color = "";
        
        if (input.equalsIgnoreCase("A")) {
            group = 'A';
            color = "파란색";
            System.out.println("당신은 " + group + "그룹이기 때문에 " + color + "입니다.");
        } else if (input.equalsIgnoreCase("B")) {
            group = 'B';
            color = "노랑색";
            System.out.println("당신은 " + group + "그룹이기 때문에 " + color + "입니다.");
        } else {
            System.out.println("A 또는 B 중 올바르게 입력해주세요.");
        }
        
    
    }
}