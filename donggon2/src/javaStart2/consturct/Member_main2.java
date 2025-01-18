package javaStart2.consturct;

public class Member_main2 {

	public static void main(String[] args) {
		Member member1 = new Member("유동곤",25,80);
		Member member2 = new Member("하",40,50);
		
		
		
		Member[] memberList = new Member[] {member1 , member2};
		
		
		for (Member member : memberList) {
			System.out.println(member.name+""
					+ "의 나이 : "+member.age+"|"
							+ "성적 : "+member.grade);
		}
		

	}
//	static void MemberInit1(Member member , String name , int age , int grade) {
//		member.name = name;
//		member.age = age;
//		member.grade = grade;
//		
//	}
	

}
