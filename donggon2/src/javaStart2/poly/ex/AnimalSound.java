package javaStart2.poly.ex;
public class AnimalSound {

	public static void main(String[] args) {
		//부모는 자식을 담을 수 있다
		Animal[] animal  = {new Cat(),new Dog(), new Cow()};
		soundAnimal(animal);
		

		

	}

	private static void soundAnimal(Animal[] animal) {
		for (Animal arr : animal) {
			System.out.println("동물소리 시작");
			arr.sound();
			System.out.println("동물소리 종료\n");
			
		}
		
		
		
	}

}
