package javaStart2.poly.ex2;

public class Cow implements AnimalInterface{

	@Override
	public void sound() {
		System.out.println("음메메메");
		
	}

	@Override
	public void move() {
		System.out.println("소가 움직여요");
		
	}

}
