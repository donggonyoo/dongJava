package javaStart1.scanner_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Scanner_Market {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum=0;
		List<String> set = new ArrayList<>();
		while(true) {
			System.out.println("1:상품입력 |  2:결제 | another key:프로그램종료 ");
			int menu = scan.nextInt();
			if(menu==1) {
				scan.nextLine();
				System.out.println("** 상품 입력 Display **");
				
				System.out.print("상품명 입력 : ");
				
				String product = scan.nextLine();
				set.add(product);
				
				System.out.print("가격 입력 : ");
				int price = scan.nextInt();
				
				System.out.print("수량 입력 : ");
				int quantity = scan.nextInt();
				
				sum+= quantity * price;		
				System.out.println("상품명 : "+product+" | 가격 : "+price+" | 수량 : "+quantity);
			}
			else if(menu == 2) {
				System.out.println("상품 목록 :"+set);
				System.out.println("결제 금액 : "+sum);
				break;
			}
			else {
				break;
			}
		}
		
		
	}

}
