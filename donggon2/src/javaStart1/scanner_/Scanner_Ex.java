package javaStart1.scanner_;

import java.util.Scanner;

public class Scanner_Ex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수1 입력  : ");
		int a = scan.nextInt();
		
		System.out.print("정수2입력 : ");
		int b = scan.nextInt();
		
		if(a>b) {
			System.out.println(a+"가 더큽니다 ");
		}
		else if(b>a) {
			System.out.println(b+"가 더 큽니다");
		}
		else {
			System.out.println("두 수는 같아");
		}

	}

}
