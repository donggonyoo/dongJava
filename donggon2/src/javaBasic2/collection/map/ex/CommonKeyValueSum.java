package javaBasic2.collection.map.ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CommonKeyValueSum {
	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("A", 1);
		map1.put("B", 2);
		map1.put("C", 3);

		Map<String, Integer> map2 = new HashMap<>();
		map2.put("B", 4);
		map2.put("C", 5);
		map2.put("D", 6);

		HashMap<Object,Integer> hashMap = new HashMap<>();
		for (String a : map1.keySet()) {
			if(map2.containsKey(a)) {
				hashMap.put(a, map1.get(a)+map2.get(a));
			}

		}
		System.out.println(hashMap);
	}

}
