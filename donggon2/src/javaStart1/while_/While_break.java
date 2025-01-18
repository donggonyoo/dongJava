package javaStart1.while_;

import java.util.Scanner;

public class While_break {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(true) {
			sum += i;
			if(sum > 20) {
				System.out.println("합이 20보다 크면 종료 ");
				System.out.println("i : "+i+"  sum : "+sum);
				break;
			}i++;
		}
	}
}
