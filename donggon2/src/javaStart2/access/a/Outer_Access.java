package javaStart2.access.a;

import javaStart2.access.PublicClass;

public class Outer_Access {

	public static void main(String[] args) {
		PublicClass a = new PublicClass();
		a.publicField=10;
//		a.privateFiled = 20;
//		a.defalutFiled=30;
		
		a.publicMethod();
		System.out.println("========");
//		a.privateMethod();
//		a.defalutMethod();
		
		a.innerMethod();

	}

}
