package javaBasic2.collection.set;

import java.util.ArrayList;

public class MyHashSetV1Main {

	public static void main(String[] args) {
		MyHashSetV1 set = new MyHashSetV1(10);
		set.add(1);
		set.add(2);
		set.add(11);//중복
		set.add(23);
		set.add(88);
		set.add(8);//hashIndex중복
		
		System.out.println(set);
		
		
		
		
		
		//검색
		int search = 88;
		boolean contains = set.contains(search);
		System.out.println("set에 "+search+"이(가) 존재하는가?? : "+contains);
		
		//삭제
		
		boolean remove = set.remove(23);
		System.out.println("remove : "+remove);
		System.out.println(set);
		set.add(72);
		System.out.println(set);

	}

}
