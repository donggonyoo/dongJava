package javaBasic2.collection.list;

public class MyarrayListMain {
	public static void main(String[] args) {
		MyarrayList<Object> myarrayList = new MyarrayList<>();
		myarrayList.add(1);
		myarrayList.add(2);
		myarrayList.add(3);
		myarrayList.add("안녕");
		myarrayList.add("하세요");
		
		Object object = myarrayList.get(0);
		int indexOf = myarrayList.indexOf("안녕");
		
		System.out.println("안녕 의 인덱스 : "+indexOf);
		System.out.println("0번 인덱스 데이터 : "+object);
		
		
		System.out.println(myarrayList);

	}

}
