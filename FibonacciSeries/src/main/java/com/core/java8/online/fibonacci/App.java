package com.core.java8.online.fibonacci;

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
			findFibonacciSeries(count);
			System.out.println("print using stream");
			findFibonacciSeriesArray(count).stream().forEach(System.out::println);
		}
        System.out.println();
    }
    
    public static void findFibonacciSeries(int count) {//if count is 5-> n+2 output
    	//0
    	//1
    	//1
    	//2
    	//3
    	//5
    	//8
    	int n1 = 0;
    	int n2 = 1;
    	int  n3;
    	
    	System.out.println(n1);
    	System.out.println(n2);
    	for(int x = 0; x < count; x++ ) {
    		n3 = n1 + n2;
    		System.out.println(n3);
    		// update value of n1 and n2 always
    		n1 = n2;
    		n2 = n3;
    	}
    	
    	
    }
    public static List<Integer> findFibonacciSeriesArray(int count) {
    	
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
