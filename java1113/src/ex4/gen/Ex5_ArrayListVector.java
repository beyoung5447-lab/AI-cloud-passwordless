package ex4.gen;

import java.util.ArrayList;


public class Ex5_ArrayListVector {

    
    static class UserInfo {
        private String name;
        private int age;
        private String location;

        public UserInfo(String name, int age, String location) {
            this.name = name;
            this.age = age;
            this.location = location;
        }

        public String getName() { return name; }
        public int getAge() { return age; }
        public String getLocation() { return location; }
    }

    public static void main(String[] args) {
        
        ArrayList<UserInfo> userList = new ArrayList<>();

       
        userList.add(new UserInfo("테스형", 53, "아테네"));
        userList.add(new UserInfo("오스형", 48, "스파르타"));

       
        for (UserInfo user : userList) {
            System.out.println("이름: " + user.getName() + 
                               " | 나이: " + user.getAge() + 
                               "세 | 사는 곳: " + user.getLocation());
        }
    }
}