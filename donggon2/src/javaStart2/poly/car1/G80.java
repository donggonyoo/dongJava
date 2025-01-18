package javaStart2.poly.car1;
public class G80 implements Car{

	@Override
	public void stratEngine() {
		System.out.println("G80의 시동을 켭니다");
		
	}

	@Override
	public void pressAccel() {
		System.out.println("G80의 엑셀을 밟습니다");
		
	}

	@Override
	public void endEngine() {
		System.out.println("G80의 시동을 끕니다");
		
	}

}
