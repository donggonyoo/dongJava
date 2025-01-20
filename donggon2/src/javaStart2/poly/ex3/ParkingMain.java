package javaStart2.poly.ex3;

import java.util.Scanner;

public class ParkingMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("주차가능대수를 입력해보세요 : ");
		ParkingSpot spot = new ParkingSpot(scan.nextInt());
		
		spot.in(new Ev());
		spot.in(new FuelCar());
		spot.in(new Ev());
		spot.in(new Ev());
		spot.in(new Ev());

	}

}
