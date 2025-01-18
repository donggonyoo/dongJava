package javaBasic2.generic.ex2;

import javaBasic2.generic.animal.Animal;
import javaBasic2.generic.animal.Cat;
import javaBasic2.generic.animal.Dog;

public class BoxMain {
	public static void main(String[] args) {
		Animal animal = new Animal("동물", 0);
		Dog dog = new Dog("멍멍이", 15);
		Cat cat = new Cat("냐옹이", 10);
		
		Box<Cat> box = new Box<Cat>();
		box.setValue(cat);
		Cat catt = box.getValue();
		System.out.println(catt);
		catt.sound();
		
		
		
		Box<Dog> box2 = new Box<Dog>();
		box2.setValue(dog);
		Dog dogg = box2.getValue();
		System.out.println(dogg);
		dogg.sound();

	}

}
