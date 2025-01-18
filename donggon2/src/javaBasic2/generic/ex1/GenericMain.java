package javaBasic2.generic.ex1;

public class GenericMain {
	public static void main(String[] args) {
		GenericBox<Integer> iBox = new GenericBox<Integer>();
		GenericBox<String> sBox = new GenericBox<String>();
		
		iBox.setValue(14);
		sBox.setValue("동곤자바");
		
		Integer value = iBox.getValue();
		String value2 = sBox.getValue();
		
		System.out.println("IntegerBox : "+value);
		System.out.println("StringBox : "+value2);
		

	}

}
