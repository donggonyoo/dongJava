package javaBasic2.collection.list;

import java.util.ArrayList;

public class Average {
//	10,20,50,60,30,70,25,55,60 의 평균과 중간값을 구하는 프로그램을 구현하시오.
//	평균의 소수 이하 자리는 무시하고 int형으로 출력하시오.
//
//	[결과]
//	42
//	50
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sum =0;
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(60);
		list.add(30);
		list.add(70);
		list.add(25);
		list.add(55);
		list.add(60);
		list.sort(null);//중간값을 구하기위함
		
		for (Integer integer : list) {
			sum+= integer;
		}
		int average = sum/list.size();
		int middle = list.get(list.size()/2);
		System.out.println(average);
		System.out.println(middle);
		

	}

}
