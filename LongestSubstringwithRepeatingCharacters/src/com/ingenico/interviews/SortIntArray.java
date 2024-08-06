package com.ingenico.interviews;

public class SortIntArray {

	public static void main(String[] args) {
		
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
/*
// output :-   2
8
9
11
11
23
32
34
44
67
*/

