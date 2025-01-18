package javaStart1.ch01;

public class Operate5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		//a 는 5보다크고 10보다 작다(&& : 둘다 진실이여야 참 , || 하나라도 참이면 참 , )
		boolean resultAnd = a > 5 && a < 10;  //둘다 진실이 아니므로 거짓 
		boolean resultOr = a > 5 || a < 10; //둘 중 하나는 진실이므로 참 
		boolean resultNot = !(a>0); // !(참) == 거짓 
		
		System.out.println("AND : "+resultAnd);
		System.out.println("OR : "+resultOr);
		System.out.println("NOT : "+resultNot);
		

	}

}
