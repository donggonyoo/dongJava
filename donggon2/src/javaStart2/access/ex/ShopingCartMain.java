package javaStart2.access.ex;

public class ShopingCartMain {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Item item1 = new Item("마늘" ,2000, 2);
		Item item2 = new Item("상추", 3000, 4);


		cart.addItem(item1);
		cart.addItem(item2);
		cart.displayItems();
		System.out.println();
		
		//List를 사용해 새롭게 구현
		ShoppingCartGeneric cart2 = new ShoppingCartGeneric();
		cart2.addItem(item1);
		cart2.addItem(item2);
		cart2.displayItem();
		
	}
}

