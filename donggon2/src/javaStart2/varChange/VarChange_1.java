package javaStart2.varChange;

public class VarChange_1 {

	public static void main(String[] args) {
		int a = 15;
		int b = a;
		
		System.out.println(" a : "+a);
		System.out.println(" b : "+b);
		
		System.out.println("a 변경 ");
		a= 20;
		System.out.println(" a : "+a);
		System.out.println(" b : "+b);
		
		System.out.println("b 변경 ");
		b= 40;
		System.out.println(" a : "+a);
		System.out.println(" b : "+b);

	}
}
