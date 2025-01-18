package javaStart2.poly.car;

public class CarMain {
	public static void main(String[] args) {
		
		G80 g80 = new G80();
		Driver driver = new Driver();
		driver.setCar(g80);
		driver.drive();
	}

}
