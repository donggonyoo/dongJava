package javaStart1.while_;

import java.util.Scanner;

public class Ex_for {

	public static void main(String[] args) {
		System.out.println("** 짝수만 더 하기  **");
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a = scan.nextInt();
		int sum = 0;
		System.out.print("짝수만 출력 : ");
		for (int i = 0; i <= a; i++) {
			if(i%2 == 0) {
				System.out.print(i+",");
				sum+=i;
			}else {
				continue;
			}
			
		}
		System.out.println("");
		System.out.println("1부터"+a+"까지의 짝수 합 : "+sum);

	}

}
