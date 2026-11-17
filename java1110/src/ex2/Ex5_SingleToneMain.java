package ex2;

public class Ex5_SingleToneMain {
public static void main(String[] args) {
	Ex5_SingleTone ref1= Ex5_SingleTone.getInstance();
	Ex5_SingleTone ref2= Ex5_SingleTone.getInstance();
	System.out.println(ref1==ref2);
	
}
}
