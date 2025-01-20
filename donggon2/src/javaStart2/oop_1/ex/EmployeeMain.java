package javaStart2.oop_1.ex;

public class EmployeeMain {
	public static void main(String[] args) {
		FormalEmployee e1 = new FormalEmployee("유동곤", "회계부", 1, 5000);
		e1.getInfo();
		int pay = e1.getPay();
		
		System.out.println(e1.getName()+"급여 : "+pay+"만원");
		
		Employee e2 = new InForamlEmployee("동곤유", "경영부", 200);
		e2.getInfo();
		int pay2 = e2.getPay();
		System.out.println(e2.getName()+"급여 : "+pay2+"만원");

		

	}

}
