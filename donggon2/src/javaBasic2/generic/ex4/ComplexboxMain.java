package javaBasic2.generic.ex4;

import javaBasic2.generic.animal.Animal;
import javaBasic2.generic.animal.Cat;
import javaBasic2.generic.animal.Dog;

public class ComplexboxMain {
	public static void main(String[] args) {
		Dog dog = new Dog("멍멍이", 8);
		ComplexBox<Animal> complexBox = new ComplexBox<>();
		complexBox.set(dog);
		
		Cat cat = new Cat("냐옹이이", 3);
		Cat printReturn = complexBox.printReturn(cat);
		System.out.println(printReturn);

	}

}
