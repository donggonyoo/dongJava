package javaStart2.consturct.ex;


public class Book {
	String name;
	String author;
	int quantity;
	
	//기본 생성자
	
	public Book() {
	}
	//매개변수3개짜리 생성자
	public Book(String name, String author, int quantity) {
		this.name = name;
		this.author = author;
		this.quantity = quantity;
	}
	

	//매개변수 2개짜리 생성자
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}

	//출력메서드
	public  void  displayInfo() {
		System.out.println(name +"의 저자,"
				+author+"| 수량 : "+quantity);
		
		
	}
	public  void name(String name) {
		this.name = name;
		
		
		
	}


}
