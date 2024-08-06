package com.core.java8.online;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App2 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        // 1. Convert List of String into String .i.e List<String> into String
        
        // 2. Convert List of Integer into Integer .i.e List<Integer> into Integer
        
        
        List<String> listOfString = Arrays.asList("a","b","c","d");
        
        String delimeter = ",";

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int i = 0;
        while (i < listOfString.size()) {
          sb.append(listOfString.get(i));
          
          System.out.println(sb);
          sb.append(delimeter);
          System.out.println(sb);
          i++;
        }
        //sb.append(listOfString.get(i));//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4

        String res = sb.toString();
        System.out.println(res);        //A,B,C
        
        System.out.println("...........................");
        
        int j = 0;
        while (j < listOfString.size()-1) {// keep saving one index
        	//store only upt second last element from begin
            sb2.append(listOfString.get(j));
            
            System.out.println(sb2);
            sb2.append(delimeter);
            System.out.println(sb2);
            j++;
          }
          sb2.append(listOfString.get(j));//use saved index here, store last element

          String result = sb2.toString();
          System.out.println(result);     
        
    }
    
}
