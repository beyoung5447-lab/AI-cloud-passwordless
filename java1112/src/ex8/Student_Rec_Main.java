package ex8;

public class Student_Rec_Main {
public static void main(String[] args) {
	Student_Rec s = new Student_Rec("테스형",31);
	System.out.println("이름:"+s.name());
	System.out.println("나이:"+s.age());
	System.out.println(s);
}
} 