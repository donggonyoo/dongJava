package javaStart2.class_;

public class Start_class_main2 {
	public static void main(String[] args) {
		Students students1 = new Students();
		students1.name="학생1";
		students1.age = 15;
		students1.grade=90;
		
		Students students2 = new Students();
		students2.name="학생2";
		students2.age = 16;
		students2.grade=78;
	
		
		Students[] student = new Students[] {students1,students2};
		
		//for문
		for (int s = 0; s < student.length; s++) {
			System.out.println((student[s].name+"의 나이 : "+student[s].age+" | "
					+ "점수 : "+student[s].grade));
		}
		
		//향상된 for-each문 사용(배열에서많이사용)
		for (Students s : student) {
			System.out.println(s.name +"의나이 :"+s.age
					+" | 점수 : "+s.grade);
		}
	}

}
