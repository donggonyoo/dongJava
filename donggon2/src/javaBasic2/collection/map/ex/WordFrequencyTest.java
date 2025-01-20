package javaBasic2.collection.map.ex;

import java.util.HashMap;

public class WordFrequencyTest {
	 public static void main(String[] args) {
		 String text = "orange@banana@apple@apple@banana@apple";
		 
		 HashMap<String, Integer> map = new HashMap<>();
		 String[] words = text.split("@");
		 
		 for (String s : words) {
			 Integer i = map.get(s); //처음루프를 돌리면 null이 나오게되어있다
			 if(i==null) {
				 i=0;}
			 i++; //if문 후에 실행
        //(배열에있는 것으로만돌아가는 for each문 이기 때문에 항상 +1을해줌)
			 map.put(s, i);
			 //처음루프 : map.put(orrrange , 1)
		}
		 System.out.println(map);
		 }
}