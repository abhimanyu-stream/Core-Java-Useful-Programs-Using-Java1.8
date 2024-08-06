package com.core.java8.Queue;

import java.util.Arrays;
import java.util.Objects;

public class Queue {
	
	
	private int[] intQueueArray;
	protected int maxSize;
	private int rear;
	private int front;
	protected int currentNumberOfElementsInQueue;
	
	
	/**
	 * 1. If rear == -1 And front == -1 then Queue is empty, It is know as UnderFlow state. This Time no Deletion/Removal 
	 * 2. If rear == (maxSize - 1) i.e at the last index of Array and front > rear then Queue is Full, and no newElement can be inserted into Queue.This Time no Addition/Insertion .It is known as OverFlow state
	 * 3. If front And rear == -1 then put front=0 and rear=0, then insert new Element in to Queue. This Time front and rear are at same index
	 * 4. If rear == (maxSize - 1) and front > rear then, no element can be inserted, And there may be some indexes are remain empty, And according to the definition of Stack we have to insert at rear position only, now at this situation rear position can not be updated as rear++. This problem can be solved by Circular Queue
	 * 
	 * 
	 * */
	public Queue() {}
	
	public Queue(int maxSize) {
		super();
		this.intQueueArray = new int[maxSize];
		this.maxSize = maxSize;
		this.rear = -1;
		this.front = -1;
		this.currentNumberOfElementsInQueue = 0;
		infoAboutQueue();
	}
	
	private void infoAboutQueue() {
		
		if(this.rear == -1 && this.front == -1) {
			
			System.out.println("Queue is Empty now\n\n");
			
		}else {
			System.out.printf("front position is %d" +"---"+ "And rear position is %d", this.front, this.rear);
		}
	}
	

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(intQueueArray);
		result = prime * result + Objects.hash(currentNumberOfElementsInQueue, front, maxSize, rear);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Queue other = (Queue) obj;
		return currentNumberOfElementsInQueue == other.currentNumberOfElementsInQueue && front == other.front
				&& Arrays.equals(intQueueArray, other.intQueueArray) && maxSize == other.maxSize && rear == other.rear;
	}

	
	
	@Override
	public String toString() {
		return "Queue [intQueueArray=" + Arrays.toString(intQueueArray) + ", maxSize=" + maxSize + ", rear=" + rear
				+ ", front=" + front + ", currentNumberOfElementsInQueue=" + currentNumberOfElementsInQueue + "]";
	}

	
	public int insertElementInQueue(int newElement) {
		
		if(this.rear == maxSize - 1) {
			System.out.println("Queue is Full now\n");
			return intQueueArray[rear];
		}else {
			if(this.front == -1) {
				// at This Time front and rear at -1
				
				this.front = 0;
				this.rear = 0;
				this.intQueueArray[rear] = newElement;// at This Time front and rear are at index 0.
				this.currentNumberOfElementsInQueue +=1;
				
			}else {
				this.rear += 1;
				this.intQueueArray[rear] = newElement;
				this.currentNumberOfElementsInQueue +=1;
			}
		}
		
		return newElement;
	}
	
	public void removeElementFromQueue() {
		
		if(this.front == -1) {
			
			System.out.println("Queue is Empty\n");
		}else if(this.front > this.rear){
			System.out.println(" Index of front is > than rear\n");
		}else {
			System.out.printf("Removed element is %d\n", intQueueArray[this.front]);
			intQueueArray[this.front] = 0;
			this.front += 1;
			this.currentNumberOfElementsInQueue -=1;
			
		}
		
		
	}
	
	
	public int[] getIntQueueArray() {
		return intQueueArray;
	}

	
	public int getMaxSize() {
		return maxSize;
	}

	
	public int getRear() {
		return rear;
	}

	

	public int getFront() {
		return front;
	}

	

	public int getCurrentNumberOfElementsInQueue() {
		return currentNumberOfElementsInQueue;
	}

	
	
	
	

}
