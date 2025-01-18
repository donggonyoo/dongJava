package javaStart2.access;

public class AirCond {
	private int temperature;

	public AirCond(int temperature) {
		if(23 < temperature) {
		this.temperature = temperature;}
		else {return;}
		}

	
	public void tempUp() {
		temperature++;
		System.out.println("온도 +1");
	}
	
	void tempDown() {
		if(23>= temperature) {
			System.out.println("온도를 내릴 수 없어");
		}
		else {
			temperature--;
			System.out.println("온도 -1");
		}
	}
	void tempShow() {
		System.out.println("현재온도 : "+temperature);
	}

}
