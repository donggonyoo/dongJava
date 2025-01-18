package javaStart1.method_;

public class Method_repact_1 {
	
	public static void main(String[] args) {
		String a = "안녕!";
		String b = "반복문!!";
		message_for(a, 5);
		message_for(b,3);
		
		

	}
	private static void message_for(String message,int a) {
		 for (int i = 0; i < a; i++) {
			System.out.println(message);
		}
		
		
	}

}
