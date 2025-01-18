package javaStart2.extend1.super2;

public class ClassB extends ClassA{

	public ClassB(int a,int b) {
		//super(); 생략 부모생성자가 인자가없음(생략해도 생성 됨)
		System.out.println("자식생성자"+" a : "+a+" b : "+b);
	}
	
	

}
