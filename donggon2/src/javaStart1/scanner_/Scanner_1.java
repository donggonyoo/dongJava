package javaStart1.scanner_;

import java.util.Scanner;

public class Scanner_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int a = scan.nextInt();
		
		System.out.print("실수  입력 : ");
		double b = scan.nextDouble();
		
		scan.nextLine();
		//실수 or 정수를 입력 시  숫자 끝에 \n(엔터) 이 자동 입력 됨
		// 5를 입력했다면 5 까지만 읽고 \n 이 남아있는 오류가 있어 그 다음에 문자열을 사용하지못함
		//그래서 scan.nextLine();으로 \n 을제거 후 문자열 입력받자
		
		
		System.out.print("문자  입력 : ");
		String c = scan.nextLine();
		
		
		
		
		
		
		
		

	}

}
