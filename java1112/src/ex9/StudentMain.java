package ex9;

public class StudentMain {
public static void main(String[] args) {
	StudentService service = new StudentService();
	System.out.println("===== 일반 DTO ===");
	Student dto = new Student("테스형", 20);
	service.updateDTO(dto);
	System.out.println("service 호출후"+dto);
	System.out.println("=======================");
	System.out.println("===record====");
	Student_Rec rec = new Student_Rec("철수형", 20);
	Student_Rec updated = new Student_Rec("철수형", 20);
	System.out.println();
	System.out.println("기존 객체:"+rec);
	System.out.println("새 객체:"+updated);
	System.out.println("=========Interface를 사용해서 다형성 ==============");
	StudentInter[] students = {
			new Student("테스형",20),
			new Student("김철수",22),
			new Student("이형희",21),
			new Student("어머니",23),
	};
	StudentService service2 = new StudentService();
	service2.printStudents(students);
}
}
