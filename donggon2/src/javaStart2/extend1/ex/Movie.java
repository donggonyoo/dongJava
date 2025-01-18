package javaStart2.extend1.ex;

public class Movie extends Item{
	
	public String director;
	public String actor;

	public Movie(String name, int price, String director , String actor) {
		super(name, price);
		this.director = director;
		this.actor = actor;
	}

	@Override
	public int getPrice() {
		return this.price;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("감독 : "+director+" 배우 : "+actor);
	}
	
	

}
