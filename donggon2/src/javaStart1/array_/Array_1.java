package javaStart1.array_;

import java.util.Scanner;

public class Array_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수 입력 : ");
		int a = scan.nextInt();
		int[] products = new int[a];
		int i =0;
		
		while(i < products.length) { 
			System.out.print("학생["+(i+1)+"] 의 점수 : ");
			int grade = scan.nextInt();
			products[i] = grade;
			i++;
		}
		//평균구하기 => 향상된 for문(for-each)
		int sum=0;
		for (int b : products) {
			sum+=b;	
		}
		double avg = (double)sum/products.length;
		System.out.println("총점 : "+sum+"| 학생의 수 : "+products.length);
		System.out.printf("이 학급의 평균은 : %.3f \n",avg); //소수점 3자리까지만 
		

		System.out.printf("** 평균(%.3f) 이상의 학생 **  \n",avg); 
		for (int num=0;  num<products.length;  num++) {
			if(products[num] > avg) {
				System.out.print("학생["+(num+1)+"] : "+products[num]+" ");
				
			}


		}
	}

}
