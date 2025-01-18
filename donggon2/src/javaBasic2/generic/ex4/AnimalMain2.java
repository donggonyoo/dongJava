package javaBasic2.generic.ex4;

import javaBasic2.generic.animal.Animal;
import javaBasic2.generic.animal.Cat;
import javaBasic2.generic.animal.Dog;

public class AnimalMain2 {
	public static void main(String[] args) {
		Cat cat = new Cat("준냥이", 5);
		Dog dog = new Dog("아롱이", 8);
		Dog dog2 = new Dog("골든리트리버", 12);
		
		AnimalMethod.animal(cat);
		AnimalMethod.animal(dog);
		
		Animal bigger = AnimalMethod.getBigger(dog2, dog);
		System.out.println(bigger+"가 더 큽니다");
		

	}

}
