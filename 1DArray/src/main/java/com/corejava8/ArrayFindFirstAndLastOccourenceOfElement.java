package com.corejava8;

/**
 * Hello world!
 *  Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
Example 1:
Input: nums = [5,7,7,8,8,8,8,8,10], target = 8
Output: [3,7]


Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:
Input: nums = [], target = 0
Output: [-1,-1]


The Naive Approach is to run a for loop and check given elements in an array.  

1. Run a for loop and for i = 0 to n-1
2. Take first = -1 and last = -1 
3. When we find element first time then we update first = i 
4. We always update last=i whenever we find the element.
5. We print first and last.
 */
public class ArrayFindFirstAndLastOccourenceOfElement {
    public static void main( String[] args ) {
        
        
        
        // count element first index and last index
        
        int [] nums = {5,7,7,8,8,8,8,8,10};
        
        
        int first = -1;
        int last = -1;
        
        
        // find 8
        
        for(int i = 0; i < nums.length; i++) {
        	
        	if (8 != nums[i])// if nums do not contains element then control will for i++ then a next iteration of for loop starts.
                continue;
            if (first == -1)// if nums contains element then control will come at this line if( first == -1)
                first = i;
            last = i;
        	
        }
        if (first != -1) {
            System.out.println("First Occurrence = " + first);
            System.out.println("Last Occurrence = " + last);
        }
        else
            System.out.println("Not Found");
        
        
    }
}
