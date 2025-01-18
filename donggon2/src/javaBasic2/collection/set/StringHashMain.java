package javaBasic2.collection.set;

public class StringHashMain {
	static final int CAPACITY = 10;

	public static void main(String[] args) {
		char charA = 'A';
		char charB = 'B';
		char charC = 'C';
		char charD = 'D';
		System.out.println(charA +" = "+(int)charA);
		System.out.println(charB +" = "+(int)charB);
		
		System.out.println("hashCode(A)  = "+hashCode("A"));
		System.out.println("hashCode(B)  = "+hashCode("B"));
		System.out.println("hashCode(AB)  = "+hashCode("AB"));
		
		System.out.println("hashIndex(A)  = "+hasIndex(hashCode("A")));
		System.out.println("hashIndex(B)  = "+hasIndex(hashCode("B")));
		
		
		
		
		

	}
	static int hashCode(String str) {
		char[] charArray = str.toCharArray();
		int sum = 0;
		for (char c : charArray) {
			sum+=c;
		}
		return sum;
	}
	
	static int hasIndex(int value) {
		return value % CAPACITY;
	}
}
