package javaStart2.poly.basic;

public class Child extends Parent {
	
	public String value = "자식 멤버변수";

	@Override
	public void method() {
		System.out.println("*자식메서드 호출*");
	}
	
	
}
