package javaStart2.oop_1.ex;

public class Employee {
	private String type;
	private String name;
	private String dept;
	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	 void getInfo() {
		System.out.print(name+"|"+dept+"|");
	}
	
	public int getPay(){
		return 0;
	}
	public String getName() {
		return name;
	}

}
