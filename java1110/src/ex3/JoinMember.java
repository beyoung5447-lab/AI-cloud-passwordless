package ex3;

public class JoinMember {
    // 최대 100명의 회원을 저장할 수 있는 배열
    private static Member[] members = new Member[100];
    // 현재 등록된 회원의 수
    private static int count = 0;

    // 회원 추가 메서드
    public static void addMember(Member m) {
        if (count < members.length) {
            members[count] = m;
            count++;
            System.out.println("회원 가입이 완료되었습니다!\n");
        } else {
            System.out.println("더 이상 회원을 등록할 수 없습니다. (정원 초과)\n");
        }
    }

    // 회원 목록 배열을 반환하는 메서드
    public static Member[] getMembers() {
        return members;
    }

    // 현재 등록된 회원 수를 반환하는 메서드
    public static int getCount() {
        return count;
    }
}