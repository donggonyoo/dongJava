package javaBasic2.collection.map.ex;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Cart {
	
	Map<Product, Integer> map = new HashMap<>();

	public void add(Product product, int i) {
		if(map.containsKey(product)) {
			map.put(product, map.get(product)+i);
		}
		else {map.put(product, i);}}

	public void printAll() {
		System.out.println("@ 모든상품 출력 @");
		for(Entry<Product, Integer>entry : map.entrySet()) {
			System.out.println("상품 : "+entry.getKey()
			+" 수량 : "+entry.getValue());
		}}

	public void minus(Product product, int i) {
		Integer a = map.getOrDefault(product, 0);//키에 연결된 값 반환
		int minusCount = a-i;
		if(minusCount<=0) {
			map.remove(product);}
		else {
			map.put(product, minusCount);}}
}
