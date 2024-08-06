package com.core.java8.online.CodingTest5;

import java.util.Scanner;

/**
* 	Hello world!
* 	JAVA program to find lcm and gcd/hcf of two numbers
  	This JAVA program is to find LCM and GCD/HCF of two numbers.

	LCM(Least Common Multiple) is the smallest positive number which is divisble by both the numbers.

	For example, lcm of 8 and 12 is 24 as 24 is divisble by both 8(8*3) and 12(12*2).

	HCF(Highest Common Factor)/GCD(Greatest Common Divisor) is the largest positive integer which divides each of the two numbers.

	For example, gcd of 8 and 12 is 4 as divisors of 8 are 1,2,4,8 and divisors of 12 are 1,2,3,4,12 , so the greatest common divisor is 4.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int n1,n2;
    	int gcd,lcm,remainder,numerator,denominator;
		Scanner sc = new Scanner(System.in);
    	System.out.println("Enter two Numbers");
    	n1=sc.nextInt();
	n2=sc.nextInt();
    	if (n1>n2)
	{	
    		numerator=n1;
    		denominator=n2;
		}
		else
		{
   			numerator=n2;
   		 	denominator=n1;
    	}
    	remainder=numerator%denominator;
		while(remainder!=0)
		{
	   		numerator=denominator;
		     	denominator=remainder;
   		 	remainder=numerator%denominator;
		}
		gcd = denominator;
		lcm = n1*n2/gcd;
		System.out.println("GCD of "+n1+" and "+n2+" = "+gcd);
		System.out.println("LCM of "+n1+" and "+n2+" = "+lcm);
}
}
