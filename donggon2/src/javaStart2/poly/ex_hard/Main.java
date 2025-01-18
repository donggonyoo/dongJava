package javaStart2.poly.ex_hard;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PayService payService = new PayService();

		//kakao 결제
		while(true) {
			System.out.println("결제수단 입력(종료하려면 exit)"
					+ "");
			String option = scan.nextLine();
			if(option.equals("exit")) {
				System.out.println("결제를 종료합니다");
				break;
			}

			System.out.println("금액 입력(0원 입력시 종료)");
			int amount = scan.nextInt();
			if(amount==0) {
				System.out.println("프로그램종료");
				break;
			}

			payService.processPay(option, amount);
			scan.nextLine();

		}}

}
