package com.core.java8.online;


//Java program to demonstrate
//adding elements to Hashtable

import java.io.*;
import java.util.*;

class App2 {
	public static void main(String args[])
	{
		// No need to mention the
		// Generic type twice
		Hashtable<Integer, String> ht1 = new Hashtable<>(4);

		// Initialization of a Hashtable
		// using Generics
		Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(2);

		// Inserting the Elements
		// using put() method
		ht1.put(1, "one");
		ht1.put(2, "two");
		ht1.put(3, "three");
		System.out.println(ht1.size());

		ht2.put(4, "four");
		ht2.put(5, "five");
		ht2.put(6, "six");
        ht2.put(7, "six");
        
       System.out.println(ht2.size());
		// Print mappings to the console
		System.out.println("Mappings of ht1 : " + ht1);
		System.out.println("Mappings of ht2 : " + ht2);
	}
}
