package javaStart2.access.a;

import javaStart2.access.PublicClass;
import javaStart2.access.a.ProtectedClass;

public class Outer_Access {

	public static void main(String[] args) {
		PublicClass a = new PublicClass();
		System.out.println("publicClass (다른패키지에존재)");
		a.publicField=10;
//		a.privateFiled = 20;
//		a.defalutFiled=30;
		
		a.publicMethod();
		System.out.println("========");
//		a.privateMethod();
//		a.defalutMethod();
		a.innerMethod();
		
		System.out.println("같은패키지에 public클래스를 상속받은 클래스");
		ProtectedClass b = new ProtectedClass();
		b.publicField=20;//모든패키지사용가능
		b.defalutField=10;//같은패키지에서사용가능
		b.protectedField=5;//같은패키지에서사용가능( 상속받았다면 다른패키지도가능)
//		b.privateField=3; 같은클래스에서만 접근가능
		b.publicMethod();
		b.defalutMethod();
		b.protectedMethod();
		System.out.println("====innerMethod===");
		b.innerMethod();
		

	}

}
