package javaStart2.extend1;

public class CarMain {

	public static void main(String[] args) {
		
		GasCar car = new GasCar();
		car.name();
		car.price();
		car.charge();
		car.move();
		System.out.println();
		
		Car electricCar = new ElectricCar();
		electricCar.price();
		electricCar.charge();
		electricCar.move();
//		electricCar.name();
//		부모는 자식을 담을 수 있다
//		부모클래스에 자식인스턴스를 담을 수 있단 뜻
//		but . 자식의고유기능은 사용할 수 없음.
		}
}
