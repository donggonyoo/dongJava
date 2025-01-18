package javaStart1.method_;

public class Method_returnBool {

	public static void main(String[] args) {
		boolean result = odd(748246);
		System.out.println(result);


	}
	private static boolean odd(int a) {
		if(a % 2 == 0) {
			System.out.println(a+"는");
			System.out.print("짝수인가? ");
			return true;
		}else {
			System.out.println(a+"는");
			System.out.print("짝수인가? ");
			return false;
		}
	
		
	}

}
