
package javaStart2.poly.interface_abstract;
public class Bird extends AbstractAnimal implements Fly{

	@Override
	void sound() {
		System.out.println("닭이 꼬끼오");
		
	}

	@Override
	public void fly() {
		System.out.println("닭이 날아다녀요");
		
	}
	
	

}
