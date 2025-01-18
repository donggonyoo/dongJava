package javaBasic2.collection.comparable.test;

public class CardGameMain {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player player1 = new Player("동곤자바");
		Player player2 = new Player("화이팅");

		for (int i = 0; i < 5; i++) {
			player1.drawCard(deck);//deck안에 셔플기능이있음
			player2.drawCard(deck);
		}

		player1.showHand();
		player2.showHand();
		int winner = getWinner(player1, player2);
		switch(winner) {
		case -1 : System.out.println(player2.getName()+"승리");
		break;
		case 0 : System.out.println("동점");
		break;
		case 1 : System.out.println(player1.getName()+"승리");
		break;
		}
	}

	private static int getWinner(Player p1, Player p2) {
		return p1.rankSum()>p2.rankSum() ? 1:
			(p1.rankSum()==p2.rankSum())? 0:-1;

	}
}


