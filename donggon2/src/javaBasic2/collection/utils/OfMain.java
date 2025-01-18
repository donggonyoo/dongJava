package javaBasic2.collection.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
	public static void main(String[] args) {
		List<Integer>list = List.of(1,2,3);
		Set<Integer> set = Set.of(1,5,6,2);
		 Map<String, Integer> map = Map.of("id1",22,"id2",4);
		System.out.println(list);
		System.out.println(set);
		System.out.println(map);
		
		System.out.println(list.getClass());//불변객체
//		list.add(4);
		
		System.out.println("불변-->가변");
		ArrayList<Integer> list2 = new ArrayList<>(list);
		list2.add(4);
		System.out.println(list2);
		
		System.out.println("가변-->불변");
		Collection<Integer> list3 = Collections.unmodifiableCollection(list2);
//		list3.add(5);
		System.out.println(list3);
		
		

	}

}
