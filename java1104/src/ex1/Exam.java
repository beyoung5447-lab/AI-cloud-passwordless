package ex1;

public class Exam {
    public static void main(String[] args) {
        // 1. 프로필 정보 변수 선언 및 초기화
        String myName = "테스형";
        int myAge = 30;
        int manAge = myAge - 1;
        float h = 177.5f;
        String local = "서울";

        // 프로필 출력
        System.out.print("===== My Profile =====");
        System.out.print("이름:[" + myName + "]");
        System.out.print("나이:[" + myAge + "]");
        System.out.print("만나이:[" + manAge + "]");
        System.out.print("키:[" + h + "]");
        System.out.print("사는곳:[" + local + "]");

        // 2. 이름에서 글자 추출하기 (charAt 사용)
        char name1 = myName.charAt(0);
        char name2 = myName.charAt(1);
        char name3 = myName.charAt(2);

        System.out.print("성:[" + name1 + "]");
        System.out.println("이름:[" + name2 + name3 + "]");

        // 3. 동의 여부 확인하기 (초기값: false)
        boolean fg = false;

        if (!fg) {
            System.out.println("미동의했습니다!");
        }

        // 4. 동의 여부 변경하기 (true로 변경)
        fg = true;

        if (fg) {
            System.out.println("동의했습니다!");
        }
    }
}