package javaBasic2.generic.ex4;

import javaBasic2.generic.animal.Animal;

public class ComplexBox<T extends Animal>{

	private T animal;
	
	public void set(T animal) {
		this.animal = animal;
	}
	
	public<T> T printReturn(T t){
		System.out.println("animal.className : "+animal.getClass().getName());
		System.out.println("t.className : "+t.getClass().getName());
		//t.getName()으로 바로호출불가능 (T는 상속받은 클래스가없음)
		return t;
	}
	

}
