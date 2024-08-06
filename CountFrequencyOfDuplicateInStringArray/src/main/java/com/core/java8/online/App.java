package com.core.java8.online;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Hello world! Java program to print frequencies of all elements using HashMap
 * Java program to print frequencies of all elements using TreeMap
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		int arrInteger[] = { 10, 34, 5, 10, 3, 5, 10 };
		String arrString[] = { "Java", "Java", "Java", "SpringBoot", "EJB", "EJB", "EJB", "EJB", "EJB", "EJB", "JPA",
				"JavaScript", "SpringFramework", "AOP" };
		printFrequencyOfIntElementHashMap(arrInteger);
		printFrequencyOfIntElementTreeMap(arrInteger);

		printFrequencyOfStringElementHashMap(arrString);
		printFrequencyOfStringElementTreeMap(arrString);

	}

	private static void printFrequencyOfStringElementHashMap(String[] arrString) {
		
		// Creates an empty HashMap
				HashMap<String, Integer> hashmap = new HashMap<>();

				// Traverse through the given array
				for (int i = 0; i < arrString.length; i++) {

					System.out.println(hashmap.get(arrString[i]));
					Integer counter = hashmap.get(arrString[i]);

					if (hashmap.get(arrString[i]) == null) {
						// this is first occurrence of element at i index
						hashmap.put(arrString[i], 1);
					} else {
						// If elements already exists in hash map then increment value-part only by 1 of this pair
						hashmap.put(arrString[i], counter + 1);// ++c

					}

				}

				// Print result
				for (Map.Entry<String, Integer> m : hashmap.entrySet()) {

					System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
				}

	}

	private static void printFrequencyOfStringElementTreeMap(String[] arrString) {
		

	}

	private static void printFrequencyOfIntElementHashMap(int[] arrInteger) {
		System.out.println(".........printFrequencyOfIntElementHashMap start........");

		// Creates an empty HashMap
		HashMap<Integer, Integer> hashmap = new HashMap<>();

		// Traverse through the given array
		for (int i = 0; i < arrInteger.length; i++) {

			System.out.println(hashmap.get(arrInteger[i]));
			Integer counter = hashmap.get(arrInteger[i]);

			if (hashmap.get(arrInteger[i]) == null) {
				// this is first occurrence of element at i index
				hashmap.put(arrInteger[i], 1);
			} else {
				// If elements already exists in hash map then increment value-part only by 1 of this pair
				hashmap.put(arrInteger[i], counter + 1);// ++c

			}

		}

		// Print result
		for (Map.Entry<Integer, Integer> m : hashmap.entrySet()) {

			System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
		}
		System.out.println(".........printFrequencyOfIntElementHashMap end........");

	}

	private static void printFrequencyOfIntElementTreeMap(int[] arrInteger) {
		
		System.out.println(".........printFrequencyOfIntElementTreeMap start........");
		
		// Creates an empty TreeMap
		Map<Integer, Integer> treemap = new TreeMap<>();

		// Traverse through the given array
		for (int i = 0; i < arrInteger.length; i++) {

			System.out.println(treemap.get(arrInteger[i]));
			Integer counter = treemap.get(arrInteger[i]);

			if (treemap.get(arrInteger[i]) == null) {
				// this is first occurrence of element at i index in TreeMap object
				treemap.put(arrInteger[i], 1);
			} else {
				// If elements already exists in TreeMap object then increment value-part only
				// by 1 of this pair
				treemap.put(arrInteger[i], counter + 1);// ++c

			}

		}

		// Print result
		for (Map.Entry<Integer, Integer> m : treemap.entrySet()) {

			System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
		}
		System.out.println(".........printFrequencyOfIntElementTreeMap end........");

	}
}
