package ex3;

import java.util.Scanner;

public class JoinMemberMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        String loc;
        
        for (;;) {
            System.out.print("메뉴 : 1-가입 , 2-출력 , 3-종료 => ");
            int number;
            try {
                number = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자로 입력해주세요.\n");
                continue;
            }
            
            if (number == 1) {
                System.out.print("이름: ");
                name = sc.nextLine();
                System.out.print("나이: ");
                age = Integer.parseInt(sc.nextLine());
                System.out.print("사는곳: ");
                loc = sc.nextLine(); 
                
                // Member 객체를 생성하여 JoinMember에 전달
                Member m = new Member(name, age, loc);
                JoinMember.addMember(m);
                
            } else if (number == 2) {
                Member[] members = JoinMember.getMembers();
                int count = JoinMember.getCount();

                if (count == 0) {
                    System.out.println("등록된 회원이 없습니다.\n");
                    continue;
                }

                System.out.println("--- [회원 목록 출력] ---");
                for (int i = 0; i < count; i++) {
                    System.out.println((i + 1) + " - " + members[i].getName() + " , " + members[i].getAge() + "세 , " + members[i].getLoc());
                }
                System.out.println("------------------------\n");

            } else if (number == 3) {
                System.out.println("회원관리 프로그램 종료!");
                break;

            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.\n");
            }
        }
        
        sc.close();
    }
}