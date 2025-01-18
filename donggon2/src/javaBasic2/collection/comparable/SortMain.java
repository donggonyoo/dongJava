package javaBasic2.collection.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortMain {
	public static void main(String[] args) {
		Integer[] a = {1,5,2,12};
		System.out.println("원본배열");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a,new AscComapator());
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a,new DescComapator());
		System.out.println(Arrays.toString(a));
		
		

	}
	static class AscComapator implements Comparator<Integer>{
		public AscComapator() {
			System.out.println("오름차순");
		}
		@Override
		public int compare(Integer o1, Integer o2) {
			System.out.println("o1 : "+o1+" o2 : "+o2);
			return (o1<o2)?-1 : (01==02)? 0 : 1;
		}
		
	}
	
	static class DescComapator implements Comparator<Integer>{
		public DescComapator() {
			System.out.println("내림차순");
		}
		
		@Override
		public int compare(Integer o1, Integer o2) {
			System.out.println("o1 : "+o1+" o2 : "+o2);
			return ((o1<o2)?-1 : (01==02)? 0 : 1)*-1;
		}
		
	}

	

}
