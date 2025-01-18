package javaStart2.varChange.ex;

import java.util.Scanner;

public class Item_hardMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("주문 할 상품의 갯수 입력 : ");
		int a = scan.nextInt();
		
		
		Item [] items = new Item[a];
		int totalPrice = 0;
		
		for (int i = 0; i < items.length; i++) {
			scan.nextLine(); // \n 제거
			System.out.println((i+1)+" 번째 상품 입력 :");
			
			System.out.print("상품명 : ");
			String name = scan.nextLine();
			
			System.out.print("상품의 가격 : ");
			int price = scan.nextInt();
			
			System.out.print("상품의 수량 : ");
			int quantity = scan.nextInt();
			
			items[i] = createOrder(name, price, quantity);
			System.out.println("주소 : "+items[i]);
			totalPrice += price * quantity;
			
		}
		
		printOrders(items);//출력용
		System.out.println("총 결제 금액 : "+totalPrice);
		
		
	}

	private static Item createOrder(String name, int price, int quantity) {
		Item item = new Item();
		item.name = name;
		item.price = price;
		item.quantity = quantity;
		
		return item;
	}
	private static void printOrders(Item[] items) {
		for (int i = 0; i < items.length; i++) {
			System.out.println("상품명 : "+items[i].name+
					"| 가격 : "+items[i].price+
					"| 수량 : "+items[i].quantity);
		}
		
	}

}
