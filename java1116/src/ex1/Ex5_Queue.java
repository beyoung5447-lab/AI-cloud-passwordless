package ex1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Ex5_Queue {
public static void main(String[] args) {
	Queue<String> queue = new LinkedList<String>();
	queue.offer("테스형");
	queue.offer("철수형");
	queue.offer("카리나");
	System.out.println(queue);
	System.out.println(queue.isEmpty());
	for (String string : queue) {
		char[] e = null;
		System.out.println(e);
		System.out.println("남은 데이터"+queue);
	}
	while(!queue.isEmpty()) {
		System.out.println(queue.isEmpty());
	}
	System.out.println("남은 데이터"+queue);
}
}
