package ex2;

public class studentMain {
	public static void main(String[] args) {
	 Student st = new Student();
	 st.showstudentInfo();
	 st.studentID = 1;
     st.studentName = "테스형";
     st.grade = 100;           
     st.address = "종로";    
     Student st2 = new Student();
     st2.studentID = 2;
     st2.studentName = "테스형";
     st2.grade = 90;           
     st2.address = "종로";
     System.out.println("studentID: " + st.studentID);
     System.out.println("studentName: " + st.studentName);
     System.out.println("grade: " + st.grade);
     System.out.println("address: " + st.address);
     System.out.println("------------------");
   
     System.out.println("studentID: " + st2.studentID);
     System.out.println("studentName: " + st2.studentName);
     System.out.println("grade: " + st2.grade);
     System.out.println("address: " + st2.address);
     System.out.println("------------------");
     
     System.out.println("studentID: " + st.studentID);
     System.out.println("studentName: " + st.studentName);
     System.out.println("grade: " + st.grade);
     System.out.println("address: " + st.address);
     System.out.println("------------------");

}
}
