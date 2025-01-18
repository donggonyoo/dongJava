package javaBasic2.generic.test.ex3.unit;

public class UnitPrinterTest {

	public static void main(String[] args) {
		Shuttle<Biounit> shuttle1 = new Shuttle<>();
		shuttle1.in(new Zelot("질럿1", 30));
		Biounit out = shuttle1.out();
		
		Shuttle<Biounit> shuttle2 = new Shuttle<>();
		shuttle2.in(new Marine("마린1", 50));
		Biounit out2 = shuttle2.out();
		
		Biounit maxHp = UnitUtil.maxHp(out, out2);
		System.out.println(maxHp);
		
		UnitPrinter.printV1(shuttle1);
		UnitPrinter.printV2(shuttle2);
		
		
		
		

	}

}
