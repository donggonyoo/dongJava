package javaStart2.poly.ex2;

public class Cat implements AnimalInterface{

	@Override
	public void sound() {
		System.out.println("냐옹");
		
	}

	@Override
	public void move() {
		System.out.println("고양이가 움직여요");
		
	}

}
