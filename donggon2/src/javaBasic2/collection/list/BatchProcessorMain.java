package javaBasic2.collection.list;

public class BatchProcessorMain {
	public static void main(String[] args) {
		BatchProcessor arrayBatch = new BatchProcessor(new MyarrayList<>());
		BatchProcessor linkedBatch= new BatchProcessor(new MyLinkedList<>());
		
		arrayBatch.logic(49999);
		linkedBatch.logic(49999);
		
		

	}

}
