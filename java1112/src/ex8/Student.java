package ex8;

public class Student {
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
	}
}
