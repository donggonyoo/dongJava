package javaStart2.poly.basic;

public class PolyMain2 {

	public static void main(String[] args) {
	
	/*
	 * 다형적 참조 :
	 * 부모는 자식을 품을 수 있다(참조할 수 있다)
	 */
		//부모변수가 부모인스턴스 참조
		System.out.println("Parent -> Parent");
		Parent parent = new Parent();
		parent.method();
//		Parent.childMethod(); 부모는 자식메서드 사용X
		
		//자식변수가 자식인스턴스 참조
		System.out.println("Child -> Child");
		Child child = new Child();
		child.method();
		child.method();
		
		
		
		System.out.println("Parent -> Child");
		Parent poly = new Child();
		poly.method();
//		poly.childMethod();
//자식인스턴스를 참조하지만Parent타입이므로 자식의기능 사용x
		
		
		

	}

}
