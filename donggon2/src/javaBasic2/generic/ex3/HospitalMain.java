package javaBasic2.generic.ex3;

import javaBasic2.generic.animal.Cat;
import javaBasic2.generic.animal.Dog;

public class HospitalMain {
	public static void main(String[] args) {
		Dog dog = new Dog("멍멍이", 15);
		Dog dog2 = new Dog("멍멍이2", 18);
		Cat cat = new Cat("냐옹이", 10);
		
		AnimalHospital<Dog> dogHospital1 = new AnimalHospital<>(dog);
		AnimalHospital<Dog> dogHospital2 = new AnimalHospital<>(dog2);
		AnimalHospital<Cat> catHospital = new AnimalHospital<>(cat);
		
		dogHospital1.checkUp();
		dogHospital2.checkUp();
		dogHospital1.bigger(dog2);
//		dogHospital1.bigger(cat);강아지병원에 고양이가 들어가지못하게 막음
		
		catHospital.checkUp();

	}

}
