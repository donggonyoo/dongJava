package javaStart2.varChange.ex;

public class Store_main {

	public static void main(String[] args) {
		Item item1 = createItem("당근", 1000, 3);
		Item item2 = createItem("수박", 3500, 5);

		printItem(item1);
		printItem(item2);


	}
	private static Item createItem(String name , int price, int quantity) {
		Item item = new Item();
		item.name = name;
		item.price = price;
		item.quantity = quantity;
		return item;
	}
	private static void printItem(Item item) {
		System.out.println(item.name+" | 가격 : "+item.price+" | 수량 : "+item.quantity);
	}

}

