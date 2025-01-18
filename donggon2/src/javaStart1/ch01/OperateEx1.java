package javaStart1.ch01;

import java.util.Scanner;

public class OperateEx1 {
	public static void main(String[] args) {
		//3개의 변수 입력 
		int num1 = 10;
		int num2 = 12;
		int num3 = 30;

		//변수의 합과 평균 구하
		int sum = num1 + num2 + num3 ;
		double avg = (double)sum / 3;
		//52.0 / 3
		//sum은 int형이므로 소수점이나오지않는다 double(실수)로 형변환 후 나누기


		System.out.printf("sum : %d ",sum);
		System.out.printf("avg : %.3f",avg);


		System.out.println("\n 응용Version");
		Scanner scan = new Scanner(System.in); //Scanner 사용해 입력받기 
		int newNum = 0;
		int result = 0;
		int count = 0;

		while(true) {
			System.out.print("정수를 입력하세요(종료key :  -1) : ");
			newNum = scan.nextInt();
			if(newNum == -1) {  //-1 입력 시 break(조건문탈출)
				break;
			}
			result += newNum; //입력값 newNum 을 result에 누적 
			count++; //계산 누적할때마다 증가 (전체 숫자 갯수를 세는 것)

		}

		double newAvg = (double)result / count;
		System.out.println("result : "+result);
		System.out.printf("newAvg : %.3f",newAvg);
		








	}

}
