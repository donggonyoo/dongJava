package javaStart1.while_;


public class While_continue {

	public static void main(String[] args) {
		int i = 0;

		System.out.println("홀수만 출력 ");
		while(i < 10) {
			i++;
			if(i % 2 == 0 ) {
				continue;
			}
			System.out.print(i+", ");
			
		}
	}
}
