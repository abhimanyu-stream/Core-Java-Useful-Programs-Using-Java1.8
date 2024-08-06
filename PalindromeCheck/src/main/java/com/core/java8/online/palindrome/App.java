package com.core.java8.online.palindrome;

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
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String inString = scanner.nextLine();
        System.out.println("Enter a int");
        int inputInt = scanner.nextInt();
        
        checkStringPalindrome(inString);
        checkIntPalindrome(inputInt);
        
        
    }

	private static void checkIntPalindrome(int inputInt) {
		
	
		int sum = 0;
		int remainder;
		int originalInt = inputInt;//store input 
		
		while(inputInt != 0) {
			
			remainder = inputInt%10;// remainder
			sum = (sum * 10) + remainder;
		//	System.out.println(remainder);
			inputInt = inputInt / 10;
			
			
			
		}
		
		if (originalInt == sum) {
			System.out.println(originalInt + " is " + "Palindrome");
		} else {
			System.out.println(originalInt + " is not" + "Palindrome");
		}
		
	}

	private static void checkStringPalindrome(String inString) {
		
		
		// If reverse of input String  and original input String is same
		
		String reverse = "";
		for(int i = inString.length()-1; i >= 0; i--) {
			
			reverse += inString.charAt(i);
		}
		if(reverse.equals(inString)) {
			System.out.println(inString + " is " + "Palindrome");
		}else {
			System.out.println(inString + " is not " + "Palindrome");
		}
		
	}
}
