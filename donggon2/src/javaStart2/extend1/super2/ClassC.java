package javaStart2.extend1.super2;

public class ClassC extends ClassB{

	public ClassC() {
		super(10,20); //부모의생성자가 인자가 있을경우 --> 생략 시 컴파일오류
		System.out.println("최하위 자식 생성자");
	}
	
	

}
