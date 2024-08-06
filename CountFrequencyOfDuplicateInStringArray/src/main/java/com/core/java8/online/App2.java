package com.core.java8.online;

import java.util.Map;
import java.util.TreeMap;

public class App2 {
	
	public static void main(String[] args) {
		
		
		// Creates an empty TreeMap
		Map<Integer, Integer> treemap = new TreeMap<>();
		
		//treemap.put(null, null);Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Comparable.compareTo(Object)" because "k1" is null
		treemap.put(1, 1);
		treemap.put(1, 222);//override based on present key in TreeMap object
		treemap.put(1, 1);//override based on present key in TreeMap object
		//treemap.put(null, null);Exception in thread "main" java.lang.NullPointerException
		treemap.put(5, null);//ok
		System.out.println(treemap);
		System.out.println( "JVM version:" + System.getProperty("java.version"));
				
	}

}
