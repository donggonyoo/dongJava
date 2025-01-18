package javaStart2.class_;

public class Start_class1 {
	public static void main(String[] args) {
		String[] students = new String[]{"학생1","학생2"};
		int[] studentsAge = new int[]{19,20};
		int[] studentsGrade = new int[] {80 , 92};
		
		for (int s = 0; s < studentsGrade.length; s++) {
			System.out.println(students[s]+"의 나이 : "+studentsAge[s]+" | "
					+ "점수 : "+studentsGrade[s]);
		}

	}

}
