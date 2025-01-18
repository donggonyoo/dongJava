package javaStart1.array_;

public class Array_2 {

	public static void main(String[] args) {
		int[][]double_array = new int[2][3];
		System.out.println("double_array.length : "+double_array.length);//행이 몇개냐?
		System.out.println("double_array[0].length : "+double_array[0].length);//행의 길이
		
		
		int i = 1;
		for (int row = 0; row < double_array.length; row++) {
			for (int column = 0; column < double_array[row].length; column++) {
				double_array[row][column] = i++;
			}
		}
		
		for (int row = 0; row < double_array.length; row++) {
			for (int column = 0; column < double_array[row].length; column++) {
				System.out.print(double_array[row][column]+"  ");
				
			}System.out.println(""); //하나의 행 종료 후 라인변경 
		}
		

	}

}
