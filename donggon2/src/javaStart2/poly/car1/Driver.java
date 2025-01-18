package javaStart2.poly.car1;
public class Driver {
	private Car car;
	
	public void setCar(Car car) {
		System.out.println("차량을 탑승 : "+car);
		this.car = car;
	}
	
	public void drive() {
		car.stratEngine();
		car.pressAccel();
		car.endEngine();
		
	}

}
