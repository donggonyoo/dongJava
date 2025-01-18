package javaStart2.oop_1.memory;
public class JavaMemoryMain1 {
	public static void main(String[] args) {
		System.out.println("Main method Start");
		Method1();
		System.out.println("Main Method End");
		

	}
	static void Method1() {
		System.out.println("Method1 start");
		Data data1 = new Data("힙 영역");
		Method2(data1);
		System.out.println("method1 End");
	}
	static void Method2(Data data2) {
		System.out.println("Method2 Start");
		System.out.println("data : "+data2.name);
		System.out.println("Method2 End");
	}

}
