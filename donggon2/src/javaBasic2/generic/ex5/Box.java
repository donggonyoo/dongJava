package javaBasic2.generic.ex5;

public class Box<T> {
	private T value;
	
	public void setValue(T value) {
		this.value = value;
	}
	public T get() {
		return value;
		

	}

}
