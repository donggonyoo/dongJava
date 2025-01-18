package javaStart1.ifCondition;

import java.util.Scanner;

public class If_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("음식 값을 입력하세요 : ");
		int food = scan.nextInt();
		
		if(food < 10000) {
			System.out.println("맛점 하세여 ");
			
		}else {
			System.out.println("낭비를 줄입시다 . ");
		}

	}

}
