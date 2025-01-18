package javaBasic2.collection.map;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueMain {
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.offer(1);
		queue.offer(3);
		queue.offer(5);
		System.out.println("현재Queue : "+queue);
		
		System.out.println("\n다음에 꺼낼 데이터 꺼내지않고 조회만 ");
		System.out.println(queue.peek()+"\n");
		
		System.out.println("Queue.poll : "+queue.poll());
		System.out.println("Queue.poll : "+queue.poll());
		System.out.println("Queue.poll : "+queue.poll());
		
		System.out.println("\n현재Queue : "+queue);

		
	}

}
