package javaStart1.casting;

public class Casting_1 {

	public static void main(String[] args) {
		int a = 10;
		long longValue;
		double doubleValue;
		
		//작은 범위 --> 큰 범위 
		longValue = a;
		System.out.println("int -> long : "+longValue);
		
		doubleValue= a;
		System.out.println("int -> double : "+doubleValue);
		
		doubleValue = longValue;
		System.out.println("long -> double : "+doubleValue);
		
		//큰 범위--> 작은 범위 
		a=(int)longValue;
		System.out.println("long->int : "+a);
		
		a=(int)doubleValue;
		System.out.println("double -> int : "+a);
		
		

	}

}
