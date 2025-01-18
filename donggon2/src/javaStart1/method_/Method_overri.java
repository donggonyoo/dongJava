package javaStart1.method_;

public class Method_overri {
	public static void main(String[] args) {
		int result1 = sqrt(1,4);
		int result2 = sqrt(1,4,3);
		System.out.println(result1);
		System.out.println(result2);

	}
	private static int sqrt(int a , int b) {
		return a*b;
	}
	
	private static int sqrt(int a , int b,int c) {
		return a*b*c;
	}
}
