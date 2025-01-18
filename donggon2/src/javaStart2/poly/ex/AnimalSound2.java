package javaStart2.poly.ex;
public class AnimalSound2 {

	public static void main(String[] args) {
		//부모는 자식을 담을 수 있다
		Cat cat = new Cat();
		soundAnimal(cat);
		
		Dog dog = new Dog();
		soundAnimal(dog);
		
		Cow cow = new Cow();
		soundAnimal(cow);
		

		

	}

	private static void soundAnimal(Animal animal) {
		System.out.println("동물 소리 테스트 시작");
		animal.sound();
		System.out.println("동물 소리 테스트 종료\n");
		
		
		
	}

}
