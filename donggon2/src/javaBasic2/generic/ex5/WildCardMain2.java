package javaBasic2.generic.ex5;

import javaBasic2.generic.animal.Animal;
import javaBasic2.generic.animal.Cat;
import javaBasic2.generic.animal.Dog;

public class WildCardMain2 {
	public static void main(String[] args) {
		
		Box<Object> box1 = new Box<>();
		Box<Animal> box2 = new Box<>();
		Box<Dog> box3 = new Box<>();
		Box<Cat> box4 = new Box<>();
		
		writeBox(box1);
		writeBox(box2);
//		writeBox(box3);
//		writeBox(box4); 하한이 Animal
		
		Object object = box1.get();
//		Animal animal1 = (Animal)object; Animal타입으로 바꾸려면강제형변환필요
		System.out.println(object);
		
		Animal animal2 = box2.get();
		System.out.println(animal2);
		
		
		

	}
	static void writeBox(Box<? super Animal >t) {
		t.setValue(new Dog("멍멍이", 12));
	}

}
