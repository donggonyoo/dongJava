package javaStart2.access.ex;

public class ShoppingCart {
	private Item[] items = new Item[10];
	private int count;
	
	public void addItem(Item item) {
		if(count >= items.length) {
			System.out.println("장바구니가 찼어요(10개)");
			return;
		}
		items[count] = item;
		count++;
	}
	public void displayItems() {
		System.out.println("장바구니 상품 출력");
		for (int i = 0; i < count; i++) {
			Item item = items[i];
			System.out.println("상품명:" + item.getName() + ", 합계:" +
			item.totalPrice());
			}
		
	}
	

}
