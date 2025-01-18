package javaStart2.access;

public class AirCon_Main {
	public static void main(String[] args) {
		AirCond airCon = new AirCond(26);
		airCon.tempUp();
		airCon.tempShow();
		
		airCon.tempDown();
		airCon.tempDown();
		airCon.tempDown();
		airCon.tempDown();
		airCon.tempDown();
		airCon.tempDown();
		airCon.tempShow();
		
		//필드(멤버변수)에 직접 참조
//		airCon.temperature = 18;
//		airCon.tempShow();
		
		

	}

}
