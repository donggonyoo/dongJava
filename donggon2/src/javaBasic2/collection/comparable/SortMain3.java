package javaBasic2.collection.comparable;

import java.util.Set;
import java.util.TreeSet;

public class SortMain3 {
	public static void main(String[] args) {
		Myuser myuser1 = new Myuser("a", 31);
		Myuser myuser2 = new Myuser("b", 3);
		Myuser myuser3 = new Myuser("d", 10);
		Myuser myuser4 = new Myuser("c", 1);
		
		Set<Myuser> set = new TreeSet<>();
		set.add(myuser1);
		set.add(myuser2);
		set.add(myuser3);
		set.add(myuser4);
		
		System.out.println("기본정렬(Comparable)");
		System.out.println(set);
		
		Set<Myuser> set2 = new TreeSet<>(new Idcomparator());
		set2.add(myuser1);
		set2.add(myuser2);
		set2.add(myuser3);
		set2.add(myuser4);
		System.out.println("\nIdComparator정렬");
		System.out.println(set2);
		
	

	}

}
