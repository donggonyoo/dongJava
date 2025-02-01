package javaStart2.extend1.super1;

public class Child extends Parent{
	
	public int value = 1;

	@Override
	public void name() {
		super.name();
		System.out.println("자식");
	}
	
	public void call() {
		System.out.println(this.value);
		System.out.println(super.value);
		
	}
	
	
	
	

}
