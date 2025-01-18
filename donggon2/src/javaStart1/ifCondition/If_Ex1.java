package javaStart1.ifCondition;

import java.util.Scanner;

public class If_Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("물품의 가격 입력 : ");
		int price = scan.nextInt();

		System.out.print("고객의 나이를 입력하세요 : ");
		int age = scan.nextInt();
		int discount=0;


		if(0 < age && age < 10) {
			if(5000<price && price < 10000) {
				discount += 500;
			}
			else if(price >= 10000){
				discount += 1000;
			}
		}
		if(price >= 10000) {
			discount += 1000;
		}
		System.out.println("할인금액은 "+discount+"입니다 ");
		System.out.println("결제해야할 금액 : "+(price-discount));
	}

}
