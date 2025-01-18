package javaStart2.poly.ex_hard;

public class DefaultPay implements Pay {

	@Override
	public boolean pay(int amount) {
		System.out.println("잘못된 결제수단임");
		return false;
	}

}
