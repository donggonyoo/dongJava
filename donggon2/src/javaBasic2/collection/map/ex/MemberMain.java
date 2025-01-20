package javaBasic2.collection.map.ex;

public class MemberMain {
	public static void main(String[] args) {
		 Member member1 = new Member("id1", "회원1");
		 Member member2 = new Member("id2", "회원2");
		 Member member3 = new Member("id3", "회원3"); // 회원 저장
		 MemberRepository reposit = new MemberRepository();
		 reposit.save(member1);
		 reposit.save(member2);
		 reposit.save(member3);
		 
		 // 회원 조회
		 Member findMember1 = reposit.findById("id1");
		 System.out.println("findMember1 = " + findMember1);
		 Member findMember3 = reposit.findByName("회원3");
		 System.out.println("findMember3 = " + findMember3);
		 
		 // 회원 삭제
		 reposit.remove("id1");
		 Member removedMember1 = reposit.findById("id1");
		 System.out.println("removedMember1 = " + removedMember1);
		 }

}
