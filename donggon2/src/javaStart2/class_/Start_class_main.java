package javaStart2.class_;

public class Start_class_main {
	public static void main(String[] args) {
		Students students = new Students();
		students.name="학생1";
		students.age = 15;
		students.grade=90;
		
		Students students2 = new Students();
		students2.name="학생2";
		students2.age = 16;
		students2.grade=78;
	
		
		System.out.println(students);
		System.out.println(students2);
		
		System.out.println(students.name+"의 나이:"+students.age
				+" |점수 : "+students.grade);
		
		System.out.println(students2.name+"의 나이:"+students2.age
				+" |점수 : "+students2.grade);
		
		
		

	}

}
