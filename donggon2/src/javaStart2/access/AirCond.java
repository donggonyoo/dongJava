package javaStart2.access;

public class AirCond {
	private int temperature; 

	public AirCond(int temperature) {
		if(22 <= temperature) {
		this.temperature = temperature;
		}
		else {
			System.out.println("22도보다 낮게설정 불가능 >> "
					+ "기본온도 25도로 설정합니다");
			this.temperature = 25;
			}
		}

	
	public void tempUp() {
		temperature++;
		System.out.println("온도 +1");
	}
	
	/* defalut */ void tempDown() {
		if(temperature<=22) {
			System.out.println("온도를 내릴 수 없어(최저온도22)");
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
