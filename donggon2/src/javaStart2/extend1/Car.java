package javaStart2.extend1;

public class Car {
	public final int price = 100_000_000;
	
	Car(){
		System.out.println("차를 뭐 탈까?");
	}
	public void price() {
		System.out.print("차의 가격은 ? : ");
	}
	public void move() {
		System.out.println("차가 이동합니다");
		
	}
	public void charge() {
		System.out.println("차를 충전합니다");
		
	}

}
