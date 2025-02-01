package javaStart2.extend1.ex;

public class Album extends Item{
	
	public String artist;


	public Album(String name , int price, String artist) {
		super(name, price);
		this.artist = artist;
	}

	@Override
	public int getPrice() {
		return this.price;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("아티스트 : "+artist);
	}
	
	

}
