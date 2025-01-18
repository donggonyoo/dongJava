package javaStart2.class_.ex;

public class Book_main {

	public static void main(String[] args) {
		Book book = new Book();
		book.name = "채식주의";
		book.price = 10000;
		book.quantity = 5;
		
		
		Book book2 = new Book();
		book2.name = "김영한의JPA";
		book2.price = 25000;
		book2.quantity = 8;
		
		Book[] books = new Book[] {book,book2};
		
		for (Book b : books) {
			System.out.println(b.name+"의 가격 : "+b.price+
					" | 현재수량 : "+b.quantity);
		}
		System.out.println("");
		System.out.println("@@책 구매후 재고@@");
		book.buy(3); //책을 사는 메서드 추가 (5개중에3개샀으므로 2개의재고가남아야함)
		book2.buy(9);
		System.out.println("");
		for (Book b : books) {
			System.out.println(b.name+"의 가격 : "+b.price+
					" | 현재수량 : "+b.quantity);
		}

	}

}
