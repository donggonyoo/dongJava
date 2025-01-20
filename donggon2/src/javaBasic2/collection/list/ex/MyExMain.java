package javaBasic2.collection.list.ex;

import java.util.Scanner;

public class MyExMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("리스트의 크기를 입력하세요 : ");
		int size = scan.nextInt();
		MyEx myEx = new MyEx(size);
		
		for (int i = 1; i <= size; i++) {
			System.out.print(i+"번째 숫자 : ");
			int a = scan.nextInt();
			myEx.add(a);}
		
		myEx.display();
		myEx.max();
		myEx.middle();
		myEx.min();
		myEx.totalSum();
	}

}
