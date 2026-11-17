package ex9;

public class Student implements StudentInter {
	private final String name;
	private final int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Student st = new Student("테스형", 30);
		System.out.println(st.getName());
		System.out.println(st.getAge());
		st.setAge(31);
		System.out.println(st.getAge());
	}

	void setAge(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Student[name=" + name + ",age=" + age + "]";
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int age() {
		// TODO Auto-generated method stub
		return 0;
	}
}
