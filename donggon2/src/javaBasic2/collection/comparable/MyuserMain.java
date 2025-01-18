package javaBasic2.collection.comparable;

import java.util.Arrays;

public class MyuserMain {
	public static void main(String[] args) {
		Myuser myuser1 = new Myuser("a", 31);
		Myuser myuser2 = new Myuser("b", 3);
		Myuser myuser3 = new Myuser("d", 10);
		Myuser myuser4 = new Myuser("c", 1);
		
		Myuser[] a = {myuser1,myuser2,myuser3,myuser4};
		System.out.println("정렬 전");
		System.out.println(Arrays.toString(a));
		
		System.out.println("age정렬 후 (오름차순)");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		System.out.println("Id정렬(Idcomparator)");
		Arrays.sort(a,new Idcomparator());
		System.out.println(Arrays.toString(a));

		
		
		
		

	}

}
