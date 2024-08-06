package com.core.java8.Queue;

public class QueueException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8566024752155719751L;
	
	public int checkQueueIsEmptyOrFull(Queue queue) {
		
		if(queue.currentNumberOfElementsInQueue == queue.maxSize) {
			
			throw new RuntimeException("This Queue is Full");
		}else if(queue.currentNumberOfElementsInQueue == 0){
			throw new RuntimeException("This Queue is Empty");
		}
		// if Exception is not thrown then send current size of Array to the caller
		// its mean that there is/are some empty index available in Array.
		return queue.currentNumberOfElementsInQueue;
		
	}

}
