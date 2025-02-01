package javaBasic2.collection.comparable.test;

import java.util.Comparator;

public class PlayerCompartor implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		return o1.rankSum()>o2.rankSum() ? 1 :
			(o1.rankSum()==o2.rankSum())? 0 : -1;
	}
	

}
