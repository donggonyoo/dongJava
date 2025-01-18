package javaBasic2.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapMain2 {
	public static void main(String[] args) {
		
		run(new HashMap<String, Integer>());
		run(new LinkedHashMap<String, Integer>());
		run(new TreeMap<String, Integer>());

	}

	private static void run(Map<String, Integer> map) {
		map.put("User4", 20);
		map.put("User3", 30);
		map.put("User2", 20);//값은 중복되어도상관x
		map.put("User1", 60);
		System.out.println("class : "+map.getClass());
		Set<Entry<String, Integer>> entry = map.entrySet();
		for (Entry<String, Integer> e : entry) {
			System.out.println("key : "+e.getKey()
			+" value : "+e.getValue());
		}
		System.out.println();
	}

}
