package ex3;

public class Ex4_RefArray {
public static void main(String[] args) {
	String[] str1 = {"Test1","xest2","Test1"};
	System.out.println("index0,index2 =>"+(str1[0] == str1[2]));
	for (String e:str1) {
	System.out.println(e+":"+e.startsWith("T"));
}
}
}
