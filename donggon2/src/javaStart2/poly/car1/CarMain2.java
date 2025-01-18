package javaStart2.poly.car1;
public class CarMain2 {

	public static void main(String[] args) {
		Car dn8 = new DN8();
		Driver driver = new Driver();
		driver.setCar(dn8);
		driver.drive();
		
		
		//차량변경
		Car g80 = new G80();
		driver.setCar(g80);
		driver.drive();

	}

}
