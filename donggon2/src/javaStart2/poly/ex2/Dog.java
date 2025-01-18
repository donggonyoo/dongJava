package javaStart2.poly.ex2;

public class Dog implements AnimalInterface{

	@Override
	public void sound() {
		System.out.println("멍멍");
		
	}

	@Override
	public void move() {
		System.out.println("강아지가 움직여요");
		
	}

}
