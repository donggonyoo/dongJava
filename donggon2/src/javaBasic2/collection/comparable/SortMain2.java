package javaBasic2.collection.comparable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SortMain2 {
	public static void main(String[] args) {
		Myuser myuser1 = new Myuser("a", 31);
		Myuser myuser2 = new Myuser("b", 3);
		Myuser myuser3 = new Myuser("d", 10);
		Myuser myuser4 = new Myuser("c", 1);
		
		ArrayList<Myuser> list = new ArrayList<>();
		list.add(myuser1);
		list.add(myuser2);
		list.add(myuser3);
		list.add(myuser4);
		System.out.println("원본 리스트");
		System.out.println(list+"\n");
		
		
		System.out.println("기본정렬(Comparable)");
		list.sort(null);
		System.out.println(list);
		
		System.out.println("\nIdComparable정렬");
		list.sort(new Idcomparator());
		System.out.println(list);
		
	

	}

}
