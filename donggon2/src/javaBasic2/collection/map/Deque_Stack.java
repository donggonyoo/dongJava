package javaBasic2.collection.map;

import java.util.ArrayDeque;

public class Deque_Stack {
	public static void main(String[] args) {
		ArrayDeque<Object> stack = new ArrayDeque<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println("넣은 순서 : 1->2->3->4");
		System.out.println(stack);
		System.out.println();
		
		System.out.println("꺼내기 (LIFO)");
		System.out.println("stack.pop()"+stack.pop());
		System.out.println("stack.pop()"+stack.pop());
		System.out.println("stack.pop()"+stack.pop());
		System.out.println("stack.pop()"+stack.pop());

	}

}
