package javaBasic2.collection.map.ex;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest {
	public static void main(String[] args) {
		HashMap<Object,Object> book = new HashMap<>();
		book.put("apple","사과");
		book.put("banana","바나나");
		book.put("wartermelon","수박");
		book.put("book","책");
		book.put("fruits","과일");
		
		Scanner scan = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("==단어사전==");
			System.out.println("찾을 영단어를 입력하세요");
			String a = scan.nextLine();
			if(book.containsKey(a)) {
				System.out.println(a+" : "+book.get(a));
			}
			else if(a.equals("q")) {
				break;
			}
			else {
				System.out.println("사전에없는단어입니다");
			}
		}

	}
}
