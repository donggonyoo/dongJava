package javaBasic2.collection.set;

import java.util.ArrayList;

public class MyHashSetV2Main {

	public static void main(String[] args) {
		MyHashSetV2 set = new MyHashSetV2(11);
		MemberHash mem1 = new MemberHash("idA");
		MemberHash mem2 = new MemberHash("idA");//중복객체(동일한 객체는하나만들어가게됨)
		set.add(1);
		set.add(2);
		set.add("안녕");
		set.add(23);
		set.add(88);
		set.add("뭐하니??");
		set.add(mem1);
		set.add(mem2);
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
