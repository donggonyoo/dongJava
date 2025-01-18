package javaBasic2.collection.iterable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class JavaIterableMain {
	public static void main(String[] args) {

		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		
		HashSet<Object> hashSet = new HashSet<>();
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(4);
		
		printAll(arrayList.iterator());
		printAll(hashSet.iterator());
		
		forEach(arrayList);
		forEach(hashSet);
	}

	
	private static void forEach(Iterable<Object> iterable) {
		System.out.println("iterableClass : "+iterable.getClass());
		for (Object object : iterable) {
			System.out.println(object);
			
		}
		
		
	}


	private static void printAll(Iterator<Object> iterator) {
		System.out.println("iteratorClass :" +iterator.getClass());
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
