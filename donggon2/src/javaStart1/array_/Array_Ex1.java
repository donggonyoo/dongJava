package javaStart1.array_;


public class Array_Ex1 {

	public static void main(String[] args) {
		int[]grades = new int[3];
		grades[0] = 50;
		grades[1] = 60;
		grades[2] = 70;
		
		for (int i = 0; i < grades.length; i++) {
			System.out.println("학생["+(i+1)+"]의 점수는 : "+grades[i]);
		}

	}

}
