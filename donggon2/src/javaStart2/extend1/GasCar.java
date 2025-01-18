package javaStart2.extend1;

public class GasCar extends Car{
	private final long price = 34_000_000L;

	GasCar(){ //부모가 생성자가있다면 자식도 생성자를 만들어야함\
		//상속 관계를 사용하면 자식 클래스의 생성자에서 
//		부모 클래스의 생성자를 반드시 호출해야 한다.(규칙)**
		//상속 관계에서 자식 클래스의 생성자 첫줄에 반드시 `super(...)` 를 호출해야 한다. 
//		단 기본 생성자(`super()` )인 경우 생략할 수 있다.	
	}
	

	@Override
	public void price() {
		super.price();
		System.out.println(price+"원");
	}


	@Override
	public void move() { 
	System.out.println("@@가스차가 이동합니다@@"); }

	@Override
	public void charge() {
		System.out.println("@@가스ㅡ충전@@");
	}
	public void name() {
		System.out.println("@@K5 Lpg@@");
	}
}
