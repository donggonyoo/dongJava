package javaStart2.oop_1.ex;

public class Calculator {

	private int x; //set을 통해서만 접근
	int y;
	
	void set(int x ) {
		this.x = x;
		System.out.println("초기숫자 : "+x);
	}
	
	void reset() {
		this.x = 0;
		System.out.println("@@ 리셋! @@");
	}
	
	void add(int y) {
		System.out.print(x+" + "+y+" = ");
		x += y;
		System.out.println(x);
	} 
	
	void minus(int y) {
		System.out.print(x+" - "+y+" = ");
		x -= y;
		System.out.println(x);
		
	}
	
	void mulitply(int y) {
		System.out.print(x+" * "+y+" = ");
			x *= y;
			System.out.println(x);
		
	}
	
	void divide(int y) {
		if(!(x==0 || y == 0)) {
			System.out.print(x+" / "+y+" = ");
			x /= y;
			System.out.printf("%.3f \n",x);
		}
		else {
			System.out.println("0은 나눌 수 없어요");
		}
	}
	
}
