
package javaBasic2.collection.set;

public class MemberMain {
	public static void main(String[] args) {
		 //Object의 기본 hashCode는 객체의 참조값을 기반으로 생성
		 Object obj1 = new Object();
		 Object obj2 = new Object();
		 System.out.println("obj1.hashCode() = " + obj1.hashCode());
		 System.out.println("obj2.hashCode() = " + obj2.hashCode());
		 //각 클래스마다 hashCode를 이미 오버라이딩 해두었다.
		 Integer i = 10;
		 String strA = "A";
		 String strAB = "AB";
		 System.out.println("10.hashCode = " + i.hashCode());
		 System.out.println("'A'.hashCode = " + strA.hashCode());
		 System.out.println("'AB'.hashCode = " + strAB.hashCode());
		 //hashCode는 마이너스 값이 들어올 수 있다.
		 System.out.println("-1.hashCode = " + Integer.valueOf(-1).hashCode());
		 //둘은 같을까 다를까?, 인스턴스는 다르지만, equals는 같다.
		 MemberHash member1 = new MemberHash("idA");
		 MemberHash member2 = new MemberHash("idA");
		 MemberNotHash member3 = new MemberNotHash("idC");
		 MemberNotHash member4 = new MemberNotHash("idC");
		 
		 //equals, hashCode를 오버라이딩  한 경우
		 System.out.println("(member1 == member2) = " + (member1 == member2));
		 System.out.println("member1 equals member2 = " +
		member1.equals(member2));
		 System.out.println("member1.hashCode() = " + member1.hashCode());
		 System.out.println("member2.hashCode() = " + member2.hashCode());
		
		 //equals , hashCode를 오버라이딩 하지 않은 경우
		 System.out.println("(member3 == member4) = " + (member3 == member4));
		 System.out.println("member3 equals member4 = " +
		member3.equals(member4));
		 System.out.println("member3.hashCode() = " + member3.hashCode());
		 System.out.println("member4.hashCode() = " + member4.hashCode());
		 
		
		 
		 
		 }

}
