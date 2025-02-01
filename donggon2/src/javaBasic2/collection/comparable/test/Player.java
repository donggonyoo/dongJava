package javaBasic2.collection.comparable.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Player {
	
	private String name;
	private List<Card> hand;
	
	public Player(String name) {
		this.name = name;
		this.hand = new ArrayList<>();
	}
	public String  getName() {
		return this.name;
	}
	
	public void drawCard(Deck deck) {
		hand.add(deck.drawCard());
	}
	public int rankSum() {
		int value=0;
		for (Card card : hand) {
			value+=card.getRank();
		}
		return value;
	}
	
	public void showHand() {
		hand.sort(null);
		System.out.println(name+"의 덱 :"+hand+
				"\n 점수 : "+rankSum());
	}
	

}
