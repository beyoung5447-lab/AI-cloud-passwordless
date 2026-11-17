package ex3;

public class Ex1_for {
public static void main(String[] args) throws InterruptedException {
for( int i = 10; i>= 0; i--) {
Thread.sleep(1000);
System.out.println(i);
}
}
}