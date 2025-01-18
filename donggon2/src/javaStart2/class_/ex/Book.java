package javaStart2.class_.ex;

public class Book {
	String name;
	int price;
	int quantity;
	
	public  int buy(int a) {
		if(quantity >= a) {
		System.out.println(name+"책 "+a+"개 구매 ==> "+(price * a)+"지출");
		return this.quantity -= a;
		}
		else {
			System.out.println("재고가부족해요!! ");
			return quantity;
		}
	}

}
