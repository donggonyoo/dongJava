package javaStart1.scope;

public class Scope_For {

	public static void main(String[] args) {
		int m = 10;
		for (int i = 0; i < 3; i++) {
			System.out.println("내부 -> 외부 m : "+m);//블록 내부에서 외부는 접근가능 
			System.out.println("내부 -> 내부 i : "+i);
			
		}//i의 생존 끝 
		System.out.println("외부 -> 외부 m : "+m); //m은 main이 끝나야 생존이 끝나므로 호출가능
//		System.out.println("i : "+i); 생존주기 끝났으므로 오류발생 

	}

}
