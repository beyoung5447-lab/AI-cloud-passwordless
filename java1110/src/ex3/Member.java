package ex3;

public class Member {
    private String name;
    private int age;
    private String loc;

    // 생성자
    public Member(String name, int age, String loc) {
        this.name = name;
        this.age = age;
        this.loc = loc;
    }

    // Getter & Setter 메서드
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}