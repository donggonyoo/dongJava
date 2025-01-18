package javaBasic2.generic.test.ex3.unit;

public class Shuttle<T extends Biounit> {
	
	private T t;
	
	public void in(T t) {
		this.t = t;	
	}
	public T out() {
		return t;
	}
	
	public void showInfo() {
		System.out.println(t.toString());
	}
	
	public static void main(String[] args) {
		Shuttle<Biounit> shuttle = new Shuttle<>();
		shuttle.in(new Marine("마린1", 40));
		
		shuttle.showInfo();
		
		UnitPrinter.printV1(shuttle);
		UnitPrinter.printV2(shuttle);

	}
	

}
