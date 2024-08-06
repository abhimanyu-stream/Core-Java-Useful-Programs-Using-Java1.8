package com.core.java8.online;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 * Java Stream map() vs flatMap() Example
 * map(): It is used for transformation only.

   flatMap(): It is used for both transformation and flattening.
   flatMap() = map() + flattening
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //1. convert List<String> into List<Integer> using map()
        //2. List<List<Integer>> into List<Integer> using flatmap()
        
        //task 1.
        List<String> listOfString = Arrays.asList("1","2","3","4");
        
        List<Integer> listOfInt = listOfString.stream().map(Integer::valueOf).collect(Collectors.toList());
        
        listOfInt.stream().forEach(System.out::println);
        for(int i:listOfInt) {
        	
        	System.out.println(i);
        }
        
        //task 2.
        
        List<Integer> listofInt1 = Arrays.asList(1,2);
        List<Integer> listofInt2 = Arrays.asList(3,4);
        List<Integer> listofInt3 = Arrays.asList(5,6);
        List<Integer> listofInt4 = Arrays.asList(9,0);
        
        List<List<Integer>> listOfListOfInt = Arrays.asList(listofInt1, listofInt2, listofInt3, listofInt4);
        
        List<Integer> listofIntegerResult = listOfListOfInt.stream().flatMap(oneListOfInt -> oneListOfInt.stream()).collect(Collectors.toList());
        
        listofIntegerResult.stream().forEach(System.out::println);
       
    }
}
