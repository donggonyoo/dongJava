package javaStart2.access;

public class PublicClass {
	int defalutField;
	private int privateField;
	public int publicField;
	
	public void publicMethod() {
		System.out.println("publicMethod");
		System.out.println("publicField : "+publicField);
	}
	
	private void privateMethod() {
		System.out.println("privateMethod");
	}
	
	 void defalutMethod() {
		System.out.println("defalutMethod");
	}
	 
	 public void innerMethod() {
			System.out.println("@@ 내부호출 @@");
			publicMethod();
			privateMethod();
			defalutMethod();
			System.out.println();
		}
	 
	

}
