package myclass;

public class StudentMain2 {
	public static void main(String[] args) {
Student st1 = new Student();
Student st2 = new Student();
        
        
        st1.studentID = 1;
        st1.studentName = "테스형";
        st1.grade = 3;           
        st1.address = "종로";    
        
        st2.studentID = 2;
        st2.studentName = "테스형";
        st2.grade = 90;           
        st2.address = "종로";

        
        System.out.println("studentID: " + st1.studentID);
        System.out.println("studentName: " + st1.studentName);
        System.out.println("grade: " + st1.grade);
        System.out.println("address: " + st1.address);
        System.out.println("------------------");
      
        System.out.println("studentID: " + st2.studentID);
        System.out.println("studentName: " + st2.studentName);
        System.out.println("grade: " + st2.grade);
        System.out.println("address: " + st2.address);
        System.out.println("------------------");
        
        System.out.println("studentID: " + st1.studentID);
        System.out.println("studentName: " + st1.studentName);
        System.out.println("grade: " + st1.grade);
        System.out.println("address: " + st1.address);
        System.out.println("------------------");
}
	}


