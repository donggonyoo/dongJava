package javaStart2.access;

public class PublicClass {
	int defalutField;
	private int privateField;
	protected int protectedField;
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
		System.out.println("defalutField : "+defalutField);
	}
	 protected void protectedMethod() {
		 System.out.println("protectedMethod");
		 System.out.println("protectedField : "+protectedField);
		
	}
	 
	 public void innerMethod() {
			System.out.println("@@ 내부호출 @@");
			publicMethod();
			privateMethod();
			protectedMethod();
			defalutMethod();
			System.out.println();
		}
	 
	

}
