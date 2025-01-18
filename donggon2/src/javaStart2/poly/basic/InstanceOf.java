package javaStart2.poly.basic;

public class InstanceOf {

	public static void main(String[] args) {
		Parent parent1 = new Parent();
		System.out.println("** parent1 **");
		call(parent1);
		
		Parent parent2 = new Child();
		System.out.println("** parent2 **");
		call(parent2);
		
		

	}

	private static void call(Parent parent) {
		parent.method();
		if(parent instanceof Child child) {
			System.out.println("child인스턴스 존재");
			child.method();
			
		}
	}


}

