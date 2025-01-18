package javaStart2.oop_1.memory.ex;

import java.util.Scanner;

public class MathMain {

	public static void main(String[] args) {
//		new MathUtil();
		Scanner scan = new Scanner(System.in);
		System.out.print("배열의 크기 입력 : ");
		int[] num = new int[scan.nextInt()];
		
		int i=0;
		while(i < num.length) {
			System.out.print((i+1)+"번째 숫자 입력 : ");
			int number = scan.nextInt();
			num[i] = number;
			i++;
		}
		
		int sum = MathUtil.sum(num);
		System.out.println("sum : "+sum);
		
		double avg = MathUtil.avg(num);
		System.out.println("avg = "+avg);
		
		int min = MathUtil.min(num);
		System.out.println("min : "+min);
		
		int max = MathUtil.max(num);
		System.out.println("max : "+max);
		
		

	}

}
