package com.core.java8.online;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        SomeClass someClassObj = new SomeClass();
        double result = someClassObj.findSquareRoot(250);
        System.out.println(result);
       
    }

}
class SomeClass implements SquareRoot {


	public  double findSquareRoot(int n) {
	
		return 	Math.sqrt(n);
	}
	
	
	
}
