package javaBasic2.generic.ex5;

import javaBasic2.generic.animal.Cat;

public class WildCardMain {
	public static void main(String[] args) {
		Box<Object> box = new Box<>();
		box.setValue("하하");
		
		Cat cat = new Cat("냐옹이", 3);
		Box<Cat> box2 = new Box<>();
		box2.setValue(cat);
		
		
		WildcardEx.genericMethod(box);
		WildcardEx.printWildcardV1(box);
		WildcardEx.printGenericMethod2(box2);
		WildcardEx.printWildcardV2(box2);
		WildcardEx.printAndReturnGeneric(box2);
		WildcardEx.printAndReturnWildcard(box2);

	}
	
		

	

}
