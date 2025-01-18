package javaStart1.ifCondition;

import java.util.Scanner;

public class Switch_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("당신의 등급을 입력 : ");
		int grade = scan.nextInt();
		int coupon=switch(grade){
		case 1 -> 3000;
		case 2 -> 2000;
		case 3 -> 1000;
		default -> 500;
		};
		System.out.println("발급된할인쿠폰 : "+coupon);
	
	}

}
