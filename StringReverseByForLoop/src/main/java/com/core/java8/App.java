package com.core.java8;

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
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        
        String reversedString = findReverseOfGivenString(inputString);
        System.out.println(reversedString);
    }

	private static String findReverseOfGivenString(String inputString) {
		
		StringBuilder stringBuilder =  new StringBuilder();
		for(int i = inputString.length()-1; i >= 0 ; i--) {
			stringBuilder.append(inputString.charAt(i));
		}
		
		
		return new String(stringBuilder);
	}
}
