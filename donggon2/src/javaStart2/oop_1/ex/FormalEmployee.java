package javaStart2.oop_1.ex;

public class FormalEmployee extends Employee{
	
	String dept = "정규직";
	private int empNo;
	private int salary;

	public FormalEmployee(String name, String dept,int empNo,int salary) {
		super(name, dept);
		this.empNo = empNo;
		this.salary = salary;
		
	}

	@Override
	void getInfo() {
		System.out.print(dept+"|");
		super.getInfo();
		System.out.println(empNo +"|"+salary);
	}

	@Override
	public int getPay() {
		return salary/12;	
	}
	
	
	

}
