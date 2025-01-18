package javaBasic2.generic.animal;

public class Animal {
	private String name;
	private int size;
	
	public Animal(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	public void sound() {
		System.out.println("동물울음소리");
	}
	
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", size=" + size + "]";
	}
	
}
