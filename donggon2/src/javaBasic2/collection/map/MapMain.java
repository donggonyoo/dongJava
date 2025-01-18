package javaBasic2.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMain {
	public static void main(String[] args) {
		HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "동곤자바");
		hashMap.put(1, "키 중복시 마지막으로 저장한 값이 들어감");
		hashMap.put(2, "많관부");
		hashMap.put(3, "Map을사용해봤습니다.");
		
		System.out.println(" map : "+hashMap+"\n");

		
		System.out.println("@@특정 키 값 조회@@");
		String vaule1 = hashMap.get(1);
		System.out.println("1번key의 값 : "+vaule1+"\n");
		
		System.out.println("@@keySet 사용@@");
		Set<Integer> keySet = hashMap.keySet();
		for (Integer key : keySet) {
			String value = hashMap.get(key);
			System.out.println("key : "+key+" value : "+value);
		}
		System.out.println();
		
		System.out.println("@@entrySet 사용@@");
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println("key : "+entry.getKey() +
					" value : "+entry.getValue());
		}
		
		System.out.println("\n@@값 목록 조회@@");
		Collection<String> values = hashMap.values();
		for (String string : values) {
			System.out.println("vaule : "+string);
		}
		
		
	}

}
