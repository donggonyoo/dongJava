package javaStart2.oop_1.ex;

public class InForamlEmployee extends Employee{
	
	String dept = "비정규직";
	private int primaryPay;

	public InForamlEmployee(String name, String dept,int primaryPay) {
		super(name, dept);
		this.primaryPay = primaryPay;
		
	}

	@Override
	void getInfo() {
		System.out.print(dept+"|");
		super.getInfo();
		System.out.println("|"+primaryPay);
	}

	@Override
	public int getPay() {
		return primaryPay;	
	}
	
	
	

}
