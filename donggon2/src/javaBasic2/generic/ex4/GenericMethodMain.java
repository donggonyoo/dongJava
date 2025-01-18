package javaBasic2.generic.ex4;

public class GenericMethodMain {
	public static void main(String[] args) {
		Integer i = 10;
		Object obj = GenericMethod.objectMethod(i);//object는 모두의 부모
		Integer d = (Integer)obj; //타입을 바꾸려면 다운캐스팅을해야함!
		System.out.println(d); 
		
		String a = "동곤 자바";
		String generic = GenericMethod.<String>genericMethod(a);
		System.out.println(generic);
		
		double b = 10.5;
		long c = 11111199999L;
		Double numberMethod = GenericMethod.numberMethod(b);
		Long numberMethod2 = GenericMethod.numberMethod(c);
		System.out.println(numberMethod);
		System.out.println(numberMethod2);
		
	}

}
