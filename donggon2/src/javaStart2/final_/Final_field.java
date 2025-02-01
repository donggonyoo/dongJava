package javaStart2.final_;

public class Final_field {
	final int a;
	static final int VALUE = 20;

	public Final_field(int a) {
		this.a = a;
	}
	public static void main(String[] args) {
		Final_field final_field = new Final_field(10);
//		final_field.a = 20;
//		final_field.VALUE = 30;
		System.out.println("The final field Final_field.a cannot be assigned\n"
				+ "	The final field Final_field.VALUE cannot be assigned");
		
	}

}
