package javaStart2.access.ex;

public class Item {
	private String name;
	private int price;
	private int quantity;
	
	public Item(String name, int price, int quantity) {

		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}
	
	public int totalPrice() {
		return price * quantity;
		
	}

	@Override
	public String toString() {
		return "{name=" + name + ", price=" + price + ", quantity=" + quantity+"}" ;
	}
	

}
