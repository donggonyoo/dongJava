package javaBasic2.generic.ex4;

import javaBasic2.generic.animal.Animal;

public class AnimalMethod {
	
	static <T extends Animal>void animal(T t){
		System.out.println("동물이름 : "+t.getName() );
		System.out.println("동물 크기 : "+t.getSize() );
		t.sound();
	}
	
	static<T extends Animal> T getBigger(T t1,T t2) {
		return t1.getSize() > t2.getSize() ? t1 : t2;
		
	}

}
