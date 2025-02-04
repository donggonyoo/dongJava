package javaStart2.oop_1.memory.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MathUtil {
	
	private MathUtil() {
		//인스턴스 생성 막기위해 private
	}
	
	public static int sum(int[] array) {
		int total=0;
		for (int i : array) {
			total += i;
		}
		return total;	
	}
	
	
	public static double avg(int[] array) {
		double total=0;
		for (int i = 0; i < array.length; i++) {
			total+=array[i];
		}
		return total/array.length;
	}
	
//	public static int min(int[] array) {
//		int min = array[0];
//		for (int i : array) {
//			if(min > i) {
//				min = i;
//			}
//		}
//		return min;
//	}
	public static int min(int[] array) {
		Integer[] a = Arrays.stream(array).boxed().toArray(Integer[]::new);
		List<Integer> a2 = Arrays.asList(a);
		return (int)Collections.min(a2);
	
		
	}
	
	public static int max(int[] array) {
		int max = array[0];
		for (int i : array) {
			if(max < i) {
				max = i;
			}
		}
		return max;
	}
	
	
	

}
