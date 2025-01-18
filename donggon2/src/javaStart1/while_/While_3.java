package javaStart1.while_;

import java.util.Scanner;

public class While_3 {

	public static void main(String[] args) {
		int result =1;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 :");
		int i = scan.nextInt();
		System.out.print("몇 제곱 할까요?");
		int sqrt = scan.nextInt();
		int count=0;

		while(count < sqrt) {
			count++;
			result *= i;
			System.out.println("i : "+i+" , ^"+count+" : " +result);

		}System.out.println("result : "+result);

	}
}
