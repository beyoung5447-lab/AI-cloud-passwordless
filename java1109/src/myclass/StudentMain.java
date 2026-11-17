package myclass;




public class StudentMain {
    public static void main(String[] args) {
        Student st = new Student();
        
        
        st.studentID = 1;
        st.studentName = "테스형";
        st.grade = 3;           
        st.address = "종로";    

        
        System.out.println("studentID: " + st.studentID);
        System.out.println("studentName: " + st.studentName);
        System.out.println("grade: " + st.grade);
        System.out.println("address: " + st.address);
        System.out.println("------------------");
        st.studentID = 2;
        st.studentName = "테스형";
        st.grade = 90;           
        st.address = "종로";
        System.out.println("studentID: " + st.studentID);
        System.out.println("studentName: " + st.studentName);
        System.out.println("grade: " + st.grade);
        System.out.println("address: " + st.address);
        System.out.println("------------------");
}
}