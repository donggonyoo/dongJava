package javaStart1.ifCondition;

import java.util.Scanner;

public class If_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("가진 돈을 입력하세요 : ");
		int money = scan.nextInt();
		
		if(money <=  2500) {
			System.out.println("간식이나 먹자 ");	
		}
		else if(2500<money && money <= 5000) {
			System.out.println("편의점에서 밥 먹자 ");
		}
		else if(5000 < money && money <= 9000) {
			System.out.println("국밥 먹자 ");
		}
		else if(9000< money) {
			System.out.println("식당 좀 찾아볼까?");
		}
		

	}

}
