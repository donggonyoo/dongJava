package javaStart2.pack;

import javaStart2.pack.a.Data_2;
import javaStart2.pack.b.Data_1;

public class Data_main {

	public static void main(String[] args) {
		new Data_();
		System.out.println();
		
		System.out.println("pack.a의 인스턴스 생성 ");
		new Data_2();
		System.out.println();
		
		System.out.println("pack.b의 Data_1을 더 자주 사용한다 가정");
		System.out.println("pack.b 의 인스턴스 생성");
		System.out.println("import 를 사용해 패키지명을 안 적고 생성가능");
		new Data_1();
		
		

	}

}
