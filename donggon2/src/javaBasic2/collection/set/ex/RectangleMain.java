package javaBasic2.collection.set.ex;

import java.util.HashSet;
import java.util.Set;

public class RectangleMain {

	public static void main(String[] args) {
		Set<Rectangle> set = new HashSet<Rectangle>();
		
		set.add(new Rectangle(10, 20)); 
		set.add(new Rectangle(10, 20)); //똑같은것이라 판단하고 셋에 넣지않음!
		set.add(new Rectangle(20, 20)); 
		
		System.out.println("set : "+set+"\n");
		for (Rectangle r : set) {
			System.out.println(r+" ");
			
		}
		

	}

}
