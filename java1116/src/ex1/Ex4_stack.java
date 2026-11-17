package ex1;

import java.util.Stack;

public class Ex4_stack {
public static void main(String[] args) throws InterruptedException {
	Stack<Ex3_coin> ref = new Stack<Ex3_coin>();
	System.out.println("스택 비워져 있는 유무 1"+ref.isEmpty());
	ref.push(new Ex3_coin(100));
	ref.push(new Ex3_coin(50));
	ref.push(new Ex3_coin(500));
	ref.push(new Ex3_coin(10));
	ref.push(new Ex3_coin(100));
	//System.out.println("용량:"+ref.capacity());
	//System.out.println("갯수:"+ref.size());
	//System.out.println("스택 비워져 있는 유무1:"+ref.isEmpty());
	//System.out.println("------------------------");
	//System.out.println("while true:=>"+ref.isEmpty());
	//System.out.println(ref.pop().getValue());
	//System.out.println("갯수:"+ref.size());
	while(!ref.isEmpty()) {
		Thread.sleep(1000);
		System.out.println(ref.pop().getValue());
		System.out.println("갯수"+ref.size());
		System.out.println("=====================");
	}
	System.out.println("남은 갯수:"+ref.size());
	
}
}
