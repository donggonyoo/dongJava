package javaStart1.ifCondition;

import java.util.Scanner;

public class If_Ex_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count=0;
		System.out.println("** 소수 맞추기 프로그램  **");
		System.out.println("소수란 ? 1을 제외한 약수가 없는 정수");
		
		System.out.print("정수 하나를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.print("약수 : ");
		
		for(int i =1; i<num ;i++) {
			if(num % i ==0 ){
				System.out.print(i+" ");
				count++;
			}
		}System.out.println("");
		
		if(count == 1) {
			System.out.println("소수입니다");
		}
		else {
			System.out.println("소수가 아닙니다");
		}

	}

}
