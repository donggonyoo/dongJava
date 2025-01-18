package javaBasic2.generic.test.ex2;

public class PairMain {
	public static void main(String[] args) {
		Pair<Integer, String> pair1 = new Pair<>(20250106,"Date");
		System.out.println(pair1.getFirst());
		System.out.println(pair1.getSecond());
		System.out.println("pair1 = " + pair1);
		
		Pair<String, String> pair2 = new Pair<>("안녕하세요", "동곤자바입니다");
		System.out.println(pair2.getFirst());
		System.out.println(pair2.getSecond());
		System.out.println("pair2 = " + pair2);
		
		
		}

}
