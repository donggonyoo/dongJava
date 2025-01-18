package javaBasic2.collection.set.ex;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex3 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
		Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

		Set<Integer>union = new HashSet<Integer>(set1);
		union.addAll(set2);
		

		Set<Integer> intercection = new HashSet<Integer>(set1);
		intercection.retainAll(set2);
	

		Set<Integer> diffrence = new HashSet<Integer>(set1);
		diffrence.removeAll(set2);

		System.out.println("합집합(addAll 사용) : "+union);
		System.out.println("교집합(retainAll 사용) : "+intercection);
		System.out.println("차집합(removeAll 사용) : "+diffrence);

	}

}
