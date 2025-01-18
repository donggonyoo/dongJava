package javaBasic2.generic.test.ex3.unit;

public class Biounit {
	private String name;
	private int hp;
	
	public Biounit(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}

	/**
	 * @return the name
	 */
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
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "Biounit [name=" + name + ", hp=" + hp + "]";
	}
	
	

}
