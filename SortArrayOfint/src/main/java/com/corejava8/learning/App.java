package com.corejava8.learning;

/**
 * Hello world!
 * Bubble Sort
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    	
		int[] arr = {23,11,34,44,32,11,67,8,2,9};
		int[] arr2 = new int[arr.length];
		int temp;
		for(int i = 0; i <= arr.length; i++) {
			for(int j= i+ 1; j< arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i< arr.length ; i++) {
			arr2[i] = arr[i];
			System.out.println(arr[i]);
		}

	}
    
}
