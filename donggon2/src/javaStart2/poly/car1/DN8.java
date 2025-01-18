package javaStart2.poly.car1;
public class DN8 implements Car{

	@Override
	public void stratEngine() {
		System.out.println("DN8의 시동을 켭니다");
		
	}

	@Override
	public void pressAccel() {
		System.out.println("Dn8의 엑셀을 밟습니다");
		
	}

	@Override
	public void endEngine() {
		System.out.println("Dn8의 시동을 끕니다");
		
	}

}
