package javaBasic2.collection.set;

import java.util.Arrays;

public class HashStart3 {
	public static void main(String[] args) {
		Integer[] inputArray = new Integer[100];
		inputArray[1] = 1;
		inputArray[2] = 2;
		inputArray[5] = 5;
		inputArray[8] = 8;
		inputArray[99] = 99;
		System.out.println("inputArray = " + Arrays.toString(inputArray));
		int searchValue = 8;
		
		int result = inputArray[searchValue];
		System.out.println("result : "+result);
		}

}
