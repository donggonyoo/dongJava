package javaStart2.poly.interface_abstract;

public class HardMain {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Bird bird = new Bird();
		Chicken chicken = new Chicken();
		
		soundAnimal(dog);
		soundAnimal(bird);
		soundAnimal(chicken);
		
//		flyAnimal(dog); Fly를 구현하지않았으므로 오류발생
		flyAnimal(bird);
		flyAnimal(chicken);
		
	}
	private static void soundAnimal(AbstractAnimal animal) {
		System.out.println("동물 소리 테스트 시작");
		animal.sound();
		System.out.println("동물 소리 테스트 종료\n");

	}
	private static void flyAnimal(Fly fly) {
		System.out.println("비행을 시작");
		fly.fly();
		System.out.println("비행 종료\n");
		
	}

}
