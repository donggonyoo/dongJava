package javaStart2.final_;

public class Final_1 {

	public static void main(String[] args) {
		//final 지역 변수
		final int a;
		a=20;
//		a=20;컴파일오
		System.out.println(a);
		
		int b = 10;
		b=20;
		System.out.println(b);
		
		method(12);

	}
	//final 매개변수
	static void method(final int parameter) {
	//parameter = 20; 컴파일 오류
	}

}
