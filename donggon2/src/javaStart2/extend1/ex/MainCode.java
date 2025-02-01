package javaStart2.extend1.ex;

public class MainCode {
	public static void main(String[] args) {
		Book book = new Book("채식주의자", 10000, "Gang Han", "12345");
		Album album = new Album("Love Dive", 23600,"IVE");
		Movie movie = new Movie("소방관", 15000,"곽경택","곽도원");

		book.print();
		album.print();
		movie.print();
		int sum = book.getPrice() + album.getPrice() + movie.getPrice();
		System.out.println("상품 가격의 합: " + sum);
	}
}


