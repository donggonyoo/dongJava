package javaStart2.extend1;

public class ElectricCar extends Car{
	private final long price = 50_000_000L;

	//부모가 기본생성자이므로 만들지않아도 출력됨( super())
	
	@Override
	public void price() {
		System.out.println(price+"원");
	}

	@Override
	public void move() {
		System.out.println("@@ 전기차 이동 @@");
	}

	@Override
	public void charge() {
		System.out.println("전기를 충전합니다");
	}
	
	public void name() {
		System.out.println("@@ 테슬라 @@");
	}

}
