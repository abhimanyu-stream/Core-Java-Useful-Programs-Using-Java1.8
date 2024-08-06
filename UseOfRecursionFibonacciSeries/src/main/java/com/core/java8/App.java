package com.core.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try (Scanner scanner = new Scanner(System.in)) {
			int count = scanner.nextInt();
			//System.out.println(count);
			System.out.println("print using method");
			
			for(int i = 0; i < count; i ++) {
				System.out.println(findFibonacciSeriesArray(i));
			}
			
			
			
			
			System.out.println("print using stream");
			List<Integer> resultFibonacciSeriesArray = findFibonacciSeriesReturnListOfInteger(count);
			System.out.println(resultFibonacciSeriesArray);
			
			
		}
        System.out.println();
    }

	private static int findFibonacciSeriesArray(int count) {
		
		if(count == 0) {
			return 0;
		}else if(count == 1 || count == 2) {
			return 1;
		}
		
		return findFibonacciSeriesArray(count - 2) + findFibonacciSeriesArray(count - 1);
	}

	private static List<Integer> findFibonacciSeriesReturnListOfInteger(int count) {


		int n1 = 0;
    	int n2 = 1;
    	int  n3;
    	
    	//System.out.println(n1);
    	//System.out.println(n2);
    	
    	List<Integer>  seriesFibonacci = new ArrayList<>();
    	seriesFibonacci.add(n1);
    	seriesFibonacci.add(n2);
    	for(int x = 0; x < count; x++ ) {
    		n3 = n1 + n2;
    		//System.out.println(n3);
    		seriesFibonacci.add(n3);
    		n1 = n2;
    		n2 = n3;
    	}
    	
    	return seriesFibonacci;
		
	}
}
