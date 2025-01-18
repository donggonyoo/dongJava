package javaStart1.array_;

import java.util.Scanner;

public class Array_Ex_final {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학생의 수를 입력하세요 : ");
		int a = scan.nextInt();
		
		int[][]students = new int[a][3];
		String[] subjects = new String[] {"수학 ","영어","국어"};
		
		
		for (int i = 0; i < students.length; i++) {
			System.out.println("* 학생["+(i+1)+"]의 점수 *");
			for(int j=0; j<subjects.length; j++) {

				System.out.print(subjects[j]+"점수 : ");
				students[i][j] = scan.nextInt();
			}
			
		}
		
		for (int i = 0; i < students.length; i++) {
			int sum = 0;
			double avg=0; //외부for문 시작과 동시에 sum , avg(변수) 초기화
			
			for(int j=0; j<subjects.length; j++) {
				sum += students[i][j];
				avg = (double)sum / students[i].length;
				
			}System.out.print("학생"+(i+1)+"의 총점수 : "+sum);//내부 for문이 끝나면 호출
			System.out.printf("평균 : %.3f \n",avg); //소수점3자리에서 반올림
			
		}
		
		
		

	}
}
