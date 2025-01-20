package javaStart2.poly.Interface;

public class Child implements InterfaceA, InterfaceB {

	@Override
	public void MethodA() {
		System.out.println("interfaceA.method");
	}
	
	@Override
	public void MethodB() {
		System.out.println("interfaceB.method");	
	}
	
	@Override
	public void MethodCommon() {
		System.out.println("methodCommon");
		
	}
	

}
