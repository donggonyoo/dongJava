package javaBasic2.generic.ex1;

public class BoxMain {
	public static void main(String[] args) {
		IntegerBox iBox = new IntegerBox();
		StringBox sBox = new StringBox();
		
		
		iBox.setValue(12); //오토박싱에 의해 int --> Integer
		Integer value = iBox.getValue();
		System.out.println(value);
		
//		Integer에 대한 상기 !
//		String a = "13";
//		System.out.println("StringA : "+a+" type:"+a.getClass());
//		Integer b = Integer.valueOf(a);
//		System.out.println("IntegerB : "+b+" type : "+b.getClass());
//		int c = b.intValue();
//		System.out.println("intC : "+c+" type : int"); 
		
		sBox.setValue("하하하");
		String value2 = sBox.getValue();
		System.out.println(value2);
		//만약 double ,Boolean 객체 등을 담을 박스가 필요하다면??
	}

}
