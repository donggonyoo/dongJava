package javaBasic2.collection.map;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack);
		
		System.out.println("\n다음 꺼낼요소확인(꺼내진않음)");
		System.out.println("stack.peek() : "+stack.peek()+"\n");
		
		System.out.println("꺼내기");
		System.out.println("stack.pop() : "+stack.pop());
		System.out.println("stack.pop() : "+stack.pop());
		System.out.println("stack.pop() : "+stack.pop());
		
		System.out.println("\n남은스택");
		System.out.println(stack);
		

	}

}
