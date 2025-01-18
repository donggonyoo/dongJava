package javaStart1.method_;

public class Method_2 {

	public static void main(String[] args) {
		int sum1 = add(5,10);
		System.out.println("sum : " +sum1);
		
		
		int sum2 = add(3,19);
		System.out.println("sum : " +sum2);

		
		
	}
	private static int add(int a, int b) { //private로 지정해 위 클래스에서만 사용
		System.out.println(a+"+"+b+" 연산 수행");
		return a + b;  
	}

}
