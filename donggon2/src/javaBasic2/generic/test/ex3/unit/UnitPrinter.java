package javaBasic2.generic.test.ex3.unit;

public class UnitPrinter {
	
	public static <T extends Biounit> void printV1(Shuttle<T> value) {
		T out = value.out();
		System.out.println(out);
	}
	
	public static void printV2(Shuttle<? extends Biounit> t) {
		Biounit out = t.out(); //와일드카드사용시 명확한 타입반환X (상위부모반환)
		System.out.println(out);
	}

}
