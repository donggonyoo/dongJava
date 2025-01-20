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
	public void middle() {
		x.sort(null);
		if(x.size()%2==0) {
			System.out.println("리스트 크기가홀수인경우만 중간값 찾기가능");}
		else{
			System.out.println("middle : "+x.get(x.size()/2));}
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
		}System.out.println("sum : "+sum);
	}
	public void display() {
		System.out.println("List : "+x);
	}
	
	

}
