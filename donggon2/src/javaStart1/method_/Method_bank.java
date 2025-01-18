package javaStart1.method_;

import java.util.Scanner;

public class Method_bank {

	public static void main(String[] args) {
		int balance = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("## ATM ##");


		while(true) {
			System.out.println("1.입금 | 2.출금 | 3.잔액확인 | another key:종료 ");
			System.out.print("입력한 키 : ");
			int key  = scan.nextInt();
			if(key == 1 ) {
				System.out.print("입금 금액 : ");
				int money = scan.nextInt();
				balance = deposit(balance, money);
				System.out.println("현재잔액 : "+balance);

			}
			else if(key == 2) {
				System.out.print("출금 금액 : ");
				int money = scan.nextInt();
				balance = withdraw(balance, money);	
			}
			else if(key == 3) {
				System.out.println("현재잔액 : "+balance);
			}
			else {
				System.out.println("시스템종료 ");
				break;
			}
		}





	}
	private static int withdraw(int balance, int money) {
		if(money <= balance) {
			System.out.println(money+"를 출금 ㅣ");
			balance -= money;
			return balance;
		}
		else {
			System.out.println("잔액 부족 |");
			System.out.println("잔액 : "+balance+" | 출금액 : "+money);
			return balance;
		}


	}
	private static int deposit(int balance , int money) {
		System.out.print(money+"를 입금 | ");
		balance += money;
		return balance;	

	}

}
