package ex9;

public class StudentService {
	public void updateDTO(Student student) {
		System.out.println("수정전 :" + student);
		student.setAge(25);
		System.out.println("수정후 :" + student);
	}

	public Student_Rec updateRecord(Student_Rec student) {
		System.out.println("수정전:" + student);
		Student_Rec update = new Student_Rec(student.name(), 25);
		System.out.println("수정후 :" + student);
		return update;
	}

	public void printStudents(StudentInter[] student) {
		for (StudentInter s : student) {
			System.out.println(s.name() + "/" + s.age() + "세");
		}
	}
}