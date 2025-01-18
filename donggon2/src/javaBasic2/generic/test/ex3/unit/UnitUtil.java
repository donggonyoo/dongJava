package javaBasic2.generic.test.ex3.unit;

public class UnitUtil {
	
	public static<T extends Biounit> T maxHp(T name1,T name2){
		return name1.getHp()>name2.getHp() ? name1 : name2;
		
	}
	public static void main(String[] args) {
		Zelot zelot1 = new Zelot("질럿1", 70);
		Zelot zelot2 = new Zelot("질럿2", 80);
		Zelot maxHp = maxHp(zelot1, zelot2);
		System.out.println(maxHp);

	}

}
