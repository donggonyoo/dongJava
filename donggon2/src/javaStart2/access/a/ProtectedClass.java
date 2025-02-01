package javaStart2.access.a;

import javaStart2.access.PublicClass;

public class ProtectedClass extends PublicClass{
	int defalutField;
	private int privateField;
	protected int protectedField;
	public int publicField;

	@Override
	public void publicMethod() {
		System.out.println("publicMethod");
		System.out.println("publicField : "+publicField);
	}
	void defalutMethod() {
		System.out.println("defalutMethod");
		System.out.println("defalutField : "+defalutField);
	}
	private void privateMethod() {
		System.out.println("privateMethod");
	}

	@Override
	protected void protectedMethod() {
		System.out.println("protectedMethod");
		System.out.println("protectedField : "+protectedField);
	}

	@Override
	public void innerMethod() {
		super.innerMethod();
	}
	

}
