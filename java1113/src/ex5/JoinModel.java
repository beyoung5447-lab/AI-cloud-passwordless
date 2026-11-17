package ex5;

import java.util.ArrayList;

public class JoinModel {
    private ArrayList<MemberVO> memList;

    public JoinModel() {
        memList = new ArrayList<MemberVO>();
    }

    public void addMember(MemberVO vo) {
        if (vo.getAge() < 19) {
            vo.setAgree(false);
        } else {
            vo.setAgree(true);
        }
        memList.add(vo);
    }

    public String getMemberList() {
        String res = "";
        for (MemberVO e : memList) {
            res += "번호: " + e.getNum() + "\n";
            res += "아이디: " + e.getId() + "\n";
            res += "나이: " + e.getAge() + "\n";
            res += "agree: " + e.isAgree() + "\n";
            res += "-----------------\n";
        }
        return res;
    }

    public static void main(String[] args) {
        JoinModel ref = new JoinModel();
        
        MemberVO v1 = new MemberVO();
        v1.setAge(10);
        v1.setNum(1);
        v1.setId("xman");
        
        MemberVO v2 = new MemberVO();
        v2.setAge(25); // 19세 이상 테스트를 위해 나이 수정 가능
        v2.setNum(2);
        v2.setId("xman1");
        
        ref.addMember(v1);
        ref.addMember(v2);
        
        // 추가된 회원 목록을 가져와서 콘솔에 출력
        String result = ref.getMemberList();
        System.out.println(result);
    }
}