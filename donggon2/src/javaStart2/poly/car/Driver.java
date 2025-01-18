package javaStart2.poly.car;
public class Driver {
	private G80 g80;
	
	public void setCar(G80 g80) {
		this.g80 = g80;
	}
	
	public void drive() {
		System.out.println("G80을 운전합니다");
		g80.startEngine();
		g80.pressAccel();
		g80.offEngine();
		
	}

}
