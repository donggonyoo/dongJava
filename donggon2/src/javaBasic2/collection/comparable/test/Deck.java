
package javaBasic2.collection.comparable.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> card = new ArrayList<Card>();
	
	public Deck() {
		initCard();
		sufflecard();
	}
	private void initCard() {
		for (int i = 1; i <= 13; i++) {
			for(Suit suit : Suit.values()) {
				card.add(new Card(i, suit));//리스트에 13*4장의 카드를집어넣음(카드팩만들기)
			}
		}
	}
	private void sufflecard() {
		Collections.shuffle(card);//무작위로섞기
	}
	public Card drawCard() {
		 return card.remove(0); //카드꺼내기(앞에서부터)
		 }
	

}
