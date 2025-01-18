package javaStart2.poly.basic;

public class OverrideMain {

	public static void main(String[] args) {
		Child child = new Child();
		child.method();
		System.out.println("child.value : "+child.value);
		System.out.println();
		
		Parent parent = new Parent();
		parent.method();
		System.out.println("parent.value : "+parent.value);
		System.out.println();
		
		Parent poly = new Child();
		poly.method();
		System.out.println("poly.value : "+poly.value);
		
		

	}

}
