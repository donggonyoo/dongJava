package javaStart1.ifCondition;

import java.util.Scanner;

public class Switch_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("당신의 등급을 입력 : ");
		int grade = scan.nextInt();
		int coupon=0;
		
		switch(grade) {
		case 1 :
			coupon = 3000;
			break;
		
		case 2 : 
			coupon = 2000;
			break;
		
		case 3 : 
			coupon = 1000;
			break;
		
		default: 
			System.out.println("회원 가입 하세요 ");
		}System.out.println("발급된할인쿠폰 : "+coupon);
	
	}

}
