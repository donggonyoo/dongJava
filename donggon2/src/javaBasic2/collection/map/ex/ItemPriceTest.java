package javaBasic2.collection.map.ex;

import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ItemPriceTest {
	public static void main(String[] args) { 
		Map<String, Integer> map = new HashMap<>();
		map.put("사과", 500);
		map.put("바나나", 500);
		map.put("망고", 1000);
		map.put("딸기", 1000);
		
		for (Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1000) {
				System.out.print(entry.getKey()+" ");
				
			}
		}
	}

}
