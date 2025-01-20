package javaBasic2.collection.map.ex;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Ex1 {
	public static void main(String[] args) {
		String[][] productArr =
		{{"Java", "10000"}
		, {"Spring", "20000"}
		, {"JPA", "30000"}};
		
		System.out.println("productArr[0][0] : "+productArr[0][0]);
		System.out.println("productArr[0][1] : "+productArr[0][1]);
		System.out.println("productArr[1][0] : "+productArr[1][0]);
		System.out.println("productArr[1][1] : "+productArr[1][1]);
		
		HashMap<Object,Object> hashMap = new HashMap<>();
		for (String[] s : productArr) {
			hashMap.put(s[0], s[1]);
		}
//		for (int i = 0; i < productArr.length; i++) {
//			hashMap.put(productArr[i][0], productArr[i][1]);
//			
//		} 이거를 향상된 for문을 사용해 위에 처럼활용
		for(Entry<Object, Object> a : hashMap.entrySet()) {
			System.out.println("책이름 : "+a.getKey()
			+"@가격 : "+a.getValue());
		}

	}

}


