package javaStart2.consturct;

public class Member {
	String name;
	int age;
	int grade;
	
	
	Member(String name , int age , int grade){
		this.name = name;
		this.age = age;
		this.grade = grade;
		System.out.println("매개변수 3개짜리 생성자");
	}
	
	Member(String name , int age){
		this.name = name;
		this.age = age;
		this.grade = 67;
		System.out.println("매개변수 2개짜리 생성자");
	}
	
	

	void MemberInit(String name_ , int age_ , int grade_) {
		name = name_;
		age = age_;
		grade = grade_;
		
	}
}
