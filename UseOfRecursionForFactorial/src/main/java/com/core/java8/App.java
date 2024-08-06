package com.core.java8;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
	
		// List<String> listString = new ArrayList<>();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		Integer inputInt = scanner.nextInt();
		System.out.println(findFactorialByRecursion(inputInt));
	}

	private static Integer findFactorialByRecursion(Integer inputInt) {
		
		if(inputInt < 0 || inputInt == null) {
			throw new IllegalArgumentException("IllegalArgument");
			
		}
		if(inputInt == 0 || inputInt == 1) {
			return 1;
		}
		int factorialSum = inputInt * findFactorialByRecursion(inputInt - 1);
		

		
		return factorialSum;
	}
}
