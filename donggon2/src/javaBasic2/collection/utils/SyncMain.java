package javaBasic2.collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("!!list class!!");
		System.out.println(list.getClass());
		List<Object> syncList = Collections.synchronizedList(list);
		System.out.println();
		System.out.println("!!synchronizedList.class!!");
		System.out.println(syncList.getClass());

	}

}
