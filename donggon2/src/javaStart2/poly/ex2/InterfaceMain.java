package javaStart2.poly.ex2;


public class InterfaceMain {

	public static void main(String[] args) {
		
//		AnimalInterface animal = new AnimalInterface();
//		인터페이스는 인스턴스 생성 불가
		Cat cat = new Cat();
		soundAnimal(cat);

		Dog dog = new Dog();
		soundAnimal(dog);

		Cow cow = new Cow();
		soundAnimal(cow);

	}

	private static void soundAnimal(AnimalInterface animal) {
		System.out.println("동물 소리 테스트 시작");
		animal.sound();
		System.out.println("동물 소리 테스트 종료\n");



	}



}


