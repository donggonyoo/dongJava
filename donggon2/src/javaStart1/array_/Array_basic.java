package javaStart1.array_;

public class Array_basic {

	public static void main(String[] args) {
		int[] grade= new int[3];
		//int[] grade = @7adf9f5f;
		//grade = @7adf9f5f;
		System.out.println(grade);
		
		grade[0] = 1;
		//@7adf9f5f[0] = 1; 참조값을통해 실제배열에 접근
		grade[1] = 2;
		grade[2] = 3;
		System.out.println(grade[0]);
		//인덱스 사용해 해당위치로 접근 후 배열의값 읽어옴
	}

}
