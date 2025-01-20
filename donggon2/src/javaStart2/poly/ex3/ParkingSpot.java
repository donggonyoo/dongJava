package javaStart2.poly.ex3;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpot {
	private int count;
	int a;
	
	public ParkingSpot(int a) {
		this.a = a;
	}
	
	List<Car> list = new ArrayList<>(a);
	
	
	public void in(Car car) {
		if(a==list.size()) {
			System.out.println("만차");
		}
		else {
		list.add(car);
		car.parking();
		
		}
		
	}

}
