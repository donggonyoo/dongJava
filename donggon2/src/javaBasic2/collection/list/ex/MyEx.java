package javaBasic2.collection.list.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyEx {
	
	private List<Integer> x ;
	
	public MyEx (int a) {
		x = new ArrayList<>(a);
	}
	
	public void add(int a) {
		x.add(a);
	}
	public void max() {
		System.out.println("max : "+Collections.max(x));
	}
	
	public void min() {
		System.out.println("min : "+Collections.min(x));
	}
	
	public void totalSum() {
		int sum=0;
		for (int i = 0; i < x.size(); i++) {
			if((i+1)==x.size()) {
				sum+=x.get(i);
				System.out.print(x.get(i)+"==");
			}
			else {
				sum+=x.get(i);
				System.out.print(x.get(i)+"+");
			}	
		}
		System.out.println("sum : "+sum);
	}
	public void display() {
		System.out.println("입력한 총 숫자 : "+x);
	}
	
	

}
