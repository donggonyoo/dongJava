package javaStart2.poly.basic;

public class DownCast {

	public static void main(String[] args) {
		Parent parent1 = new Child();
		Child child1 = (Child) parent1;
		child1.method(); //문제 없음

		Parent parent2 = new Parent();
		Child child2 = (Child) parent2; //런타임 오류 - ClassCastException
		child2.method(); //실행 불가
	}
}






