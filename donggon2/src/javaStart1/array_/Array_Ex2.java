package javaStart1.array_;


public class Array_Ex2 {

	public static void main(String[] args) {
		int[]grades = new int[]{10,40,50};
	
		for (int i = 0; i < grades.length; i++) {
			System.out.println("학생["+(i+1)+"]의 점수는 : "+grades[i]);
		}

	}

}
