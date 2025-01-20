package javaBasic2.collection.map.ex;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ItemPriceTest {
	public static void main(String[] args) { 
		HashMap<String,Integer> map = new HashMap<>
		(Map.of("사과",100,"바나나",1500,"망고",1000,"딸기",1000));
		
		System.out.println(map);
		
		System.out.println("가격을 입력 : ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		for (Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue()==a) {
				System.out.print(entry.getKey()+" ");
			}}
	}
}
