package javaStart2.access;

public class Inner_Access {

	public static void main(String[] args) {
		PublicClass a = new PublicClass();
		a.publicField = 10;
//		a.privateFiled = 20;
		a.defalutField=30;
		
		a.publicMethod();
//		a.privateMethod();
		a.defalutMethod();
		
		a.innerMethod();

	}

}
