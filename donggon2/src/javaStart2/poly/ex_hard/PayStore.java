package javaStart2.poly.ex_hard;

public abstract class PayStore {
	//결제 수단 추가시 변하는 부분
	public static Pay findPay(String option) {
		
	if (option.equalsIgnoreCase("kakao")) {
	return new KakaoPay();
	} else if (option.equalsIgnoreCase("naver")) {
	return new NaverPay();
	}else if(option.equalsIgnoreCase("toss")) {
		return new TossPay();
	}
	else {
	return new DefaultPay();
	}
	}

}
