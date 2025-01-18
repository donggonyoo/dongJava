package javaBasic2.collection.list;

public class BatchProcessor {
	
	private List<Integer> list;
	
	public BatchProcessor(List<Integer> e) {
		list=e;
	}
	
	public void logic(int size) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			list.add(0,i);
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("앞에 데이터"+size+"번 추가하는 데 걸리는 시간  : "
		+((endTime-startTime))+"ms");
	}

}
