package javaStart2.extend1.super1;

public class SuperMain {

	public static void main(String[] args) {
		Child child = new Child();
		child.name();
		child.call();
		System.out.println("부모클래스에 자식인스턴스를 담을 수 있음");
		System.out.println("자식의기능은 사용못함!!");
		Parent child2 = new Child();
//		child2.call();
		child2.name();

	}

}
