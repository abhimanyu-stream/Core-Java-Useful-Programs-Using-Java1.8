package com.core.java8.online;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 * 
 * 
 * 
 * 
	4 approaches to convert a list  to String in Java,

	Using StringBuilder
	Using Java 8 and above
	Solution using Guava’s joiner class
	By using Apache Commons Lang library
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        // 1. Convert List of String into String .i.e List<String> into String
        
        // 2. Convert List of Integer into Integer .i.e List<Integer> into Integer
        
        
        List<String> listOfString = Arrays.asList("a","b","c","d");
        
        System.out.println(listOfString);
        
        String resultStr = String.join(",", listOfString);
        System.out.println(resultStr);
        
        System.out.println("......................................");
        
        
        System.out.println(listOfString.size());
        System.out.println(listOfString.size()-1);
        System.out.println("......................................");
        
        for(String s:listOfString) {
        	 System.out.println(s);
        }
        System.out.println("......................................");
        
        for(int i=0; i<listOfString.size(); i++) {
        	
        	 System.out.println(listOfString.get(i));
        }
        System.out.println("......................................");
        
    }
    
}
