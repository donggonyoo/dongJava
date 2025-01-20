package javaStart2.varChange;

public class VarChange_2 {

	public static void main(String[] args) {
		Num num1 = new Num();
		num1.number = 19;
		Num num2 = num1; //주소값이복사가 됨
		System.out.println("객체 주소");
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		
		System.out.println("@@변경 전@@");
		System.out.println("num1 : "+num1.number);
		System.out.println("num2 : "+num2.number);
		
		num1.number = 20;
		System.out.println("@@num1.number = 20@@");
		System.out.println("num1 : "+num1.number);
		System.out.println("num2 : "+num2.number);
		
		num2.number = 44;
		System.out.println("@@num2.number = 44 @@");
		System.out.println("num1 : "+num1.number);
		System.out.println("num2 : "+num2.number);
		
		
		
		

	}

}
