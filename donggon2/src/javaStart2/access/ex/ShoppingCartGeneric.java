package javaStart2.access.ex;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartGeneric {
	List<Item> items = new ArrayList<Item>();
	
	void addItem(Item item) {
		if(items.size()>=10) {
			System.out.println("장바구니가 가득찼어요(최대10개)");
		}
		else {
			items.add(item);	
		}
	}
	void displayItem() {
		int total=0;
		for (Item item : items) {
			total+=item.totalPrice();
		}
		System.out.println(items);
		System.out.println("총 지불금액 : "+total);
	}

}
