package javaStart1.ch01;

public class Operate {
	public static void main(String[] args) {
		int a = 5;
		int b = 2;
	
		
		//더하기
		int sum = a+b;
		System.out.println(a+" + "+b+" == "+sum);
		
		//나눗셈 
		double div = (double)a/(double)b;
		System.out.println(a+" / "+b+" == "+div);
		
		//나머지 
		int mod = a%b;
		System.out.println(a+" % "+b+" == "+mod);

	}

}
