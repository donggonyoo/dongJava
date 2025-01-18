package javaStart1.array_;

import java.util.Scanner;

public class Array_Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수의 크기를 입력하세요 : ");
		int a = scan.nextInt();
		
		int[] num = new int[a];
		
		for (int i = 0; i < num.length; i++) {
			System.out.print((i+1)+"번째 정수입력 : ");
			num[i] = scan.nextInt();
			System.out.println(" ");
		}
		
		int maxNum = num[0];
		int minNum = num[0];
		
		for(int i = 0 ; i < num.length ; i++) {
			if(num[i] > maxNum) {
				maxNum = num[i];
			}
			else if(num[i] < minNum) {
				minNum = num[i];
			}
		}
		System.out.println("최솟값 : "+minNum);
		System.out.println("최대값 : "+maxNum);

	}

}
