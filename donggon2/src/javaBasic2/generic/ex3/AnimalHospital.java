package javaBasic2.generic.ex3;

import javaBasic2.generic.animal.Animal;

public class AnimalHospital<T extends Animal> {
	
	private T value;
	
	public AnimalHospital(T value) {
		this.value = value;
	}
	
	public void checkUp() {
		
		System.out.println(value);
		value.sound();
		System.out.println("");
		
	}
	
	public void bigger(T target) {
		 if(value.getSize()>target.getSize()) {
			System.out.println(value.getName()+"이 더 큼");
		 }
		 else if(value.getSize() < target.getSize()) {
				System.out.println(target.getName()+"이 더 큼"); 
		 }
		 else {
			 System.out.println("둘의 크기는 같다");
		 }
		
	}
	

}
