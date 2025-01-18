package javaBasic2.collection.comparable.test;

public enum Suit {
	SPADE("\u2660"),
	HEART("\u2665"),
	DIAMOND("\u2666"),
	CLUB("\u2663");
	
	private String a;
	
	Suit(String a) {
		this.a = a;
	}
	
	String getIcon(){
		return this.a;
	}
	

}
