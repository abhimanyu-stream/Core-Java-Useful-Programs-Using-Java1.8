package com.core.java8.online.java8test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        DoSum doSum = (x, y)->{
        	return x + y;
        };
        
        int sumresult = doSum.sumInt(2, 5);
        System.out.println(sumresult);
    }
}
