package javaStart2.final_;

public class Final_1 {

	public static void main(String[] args) {
		//final 지역 변수
		final int a;
		a=20;
//		a=20;컴파일오류 
		System.out.println(a);
		
		int b = 10;
		b=20;
		System.out.println(b);
		
		method(12);

	}
	//final 매개변수
	static void method(final int parameter) {//인자로전달된 값을 바꿀 수 없음
	//parameter = 20; 컴파일 오류
	}

}
