package javaBasic2.collection.map;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {
	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		System.out.println("deque 넣기");
		deque.offer(2);
		System.out.println(deque);
		deque.offerLast(3);
		System.out.println(deque);
		deque.offerFirst(1);
		System.out.println(deque);
		deque.offerLast(4);
		System.out.println(deque);
		
		
		System.out.println("\ndeque 꺼내지않고 조회만");
		System.out.println("deque.peekFirst() : "+deque.peekFirst());
		System.out.println("deque.peek() : "+deque.peek());
		System.out.println("deque.peekLast() : "+deque.peekLast());
		
		
		System.out.println("\ndeque 꺼내기");
		
		System.out.println("deque.pollLast() : " + deque.pollLast()/* 마지막꺼내기 */);
		
		System.out.println("deque.poll() : "+deque.poll());
		
		System.out.println("deque.pollFirst() : "+deque.pollFirst());
		System.out.println("\n"+deque);

		
		

	}

}
