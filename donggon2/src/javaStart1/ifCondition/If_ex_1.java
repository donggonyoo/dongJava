package javaStart1.ifCondition;

import java.util.Scanner;

public class If_ex_1 {
//	문제: "거리에 따른 운송 수단 선택하기"
//		주어진 거리에 따라 가장 적합한 운송 수단을 선택하는 프로그램을 작성하자. 다음과 같은 기준을 따른다.
//		거리가 1km 이하이면: "도보"
//		거리가 10km 이하이면: "자전거"
//		거리가 100km 이하이면: " 지하철  "
//		거리가 100km 초과이면: "고속버스 "

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("**운송 수단 추천 System **");
		System.out.print("목적지까지의 거리를 입력하세요 : ");
		int distance = scan.nextInt();
		
		if(distance <= 2) {
			System.out.println("도보 ");
		}
		else if (distance <=10) {
			System.out.println("자전거 ");
		}
		else if(distance <= 100) {
			System.out.println("지하철");
		}
		else if (distance > 100) {
			System.out.println("고속버스");
		
		}
		

	}

}
