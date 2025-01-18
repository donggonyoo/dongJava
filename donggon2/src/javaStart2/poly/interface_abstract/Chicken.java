package javaStart2.poly.interface_abstract;

public class Chicken extends AbstractAnimal implements Fly{

	@Override
	void sound() {
		System.out.println("새가 짹쨱");
		
	}

	@Override
	public void fly() {
		System.out.println("새가 날아다녀요");
		
	}
	
	

}
