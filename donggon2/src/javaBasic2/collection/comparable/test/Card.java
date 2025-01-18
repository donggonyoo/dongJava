package javaBasic2.collection.comparable.test;

public class Card implements Comparable<Card> {
	
	private final int rank;
	private final Suit suit;
	
	public Card(int rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public int getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}

	@Override
	public int compareTo(Card o) {
		if(this.rank != o.rank) { 
			return Integer.compare(this.rank, o.rank);
		}
		else { //카드의숫자가같다면 문양으로비교
			return this.suit.compareTo(o.suit);
		}
	}

	@Override
	public String toString() {
		return "Card [rank=" + rank + ", suit=" + suit + "]";
	}
	
	
	

}
