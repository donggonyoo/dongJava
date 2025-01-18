package javaStart2.poly.car1;
public class K9 implements Car{

	@Override
	public void stratEngine() {
		System.out.println("k9의 시동을 켭니다");
		
	}

	@Override
	public void pressAccel() {
		System.out.println("k9의 엑셀을 밟습니다");
		
	}

	@Override
	public void endEngine() {
		System.out.println("k9의 시동을 끕니다");
		
	}

}
