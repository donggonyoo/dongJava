package javaBasic2.collection.utils;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortMain {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(12);
		list.add(87);
		list.add(43);
		list.add(23);
		System.out.println("리스트 : "+list);
		Integer max = Collections.max(list);
		Integer min = Collections.min(list);
		System.out.println("최솟값 : "+min);
		System.out.println("최대값 : "+max);

		Collections.shuffle(list);
		System.out.println("shuffle : "+list);

		Collections.sort(list);
		System.out.println("sort : "+list);

		Collections.reverse(list);
		System.out.println("reverse : "+list);



	}

}
