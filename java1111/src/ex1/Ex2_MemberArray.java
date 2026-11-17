package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex2_MemberArray {
    public static void main(String[] args) {
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM");
        String today = f.format(new Date());
        
        
        MemoVO[] varr = {
            new MemoVO(1, "테스형", "배열 객체", today, "#001"),
            new MemoVO(2, "테스형2", "배열 객체2", today, "#002"),
            new MemoVO(3, "테스형3", "배열 객체3", today, "#003")
        };
        
       
        for (int i = 0; i < varr.length; i++) {
           
            System.out.println("번호: " + varr[i].getNum());
            System.out.println("작성자: " + varr[i].getWriter());
            System.out.println("-----------------");
        }
        
        for (MemoVO e : varr) {
			System.out.println(e.getNum());
		}
        for (MemoVO e : varr) {
			System.out.println(e.getWriter());
		}
        
    }
}
	
