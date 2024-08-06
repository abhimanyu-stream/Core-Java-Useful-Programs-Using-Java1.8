package com.core.java8.online;

//Java program to demonstrate
//HashMap and HashTable
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class App3 {
	public static void main(String args[]) {
		// ----------hashtable -------------------------
		Hashtable<Integer, String> ht = new Hashtable<>(11);
		System.out.println("-------------Hash table start--------------");
		// Size means number of elements present in hashtable object
		System.out.println("Size HashTable  is : " + ht.size());

		// ht.put(null, null);//Exception in thread "main"
		// java.lang.NullPointerException
		ht.put(101, " Java");
		ht.put(101, "Spring");
		ht.put(102, "Hibernate");
		ht.put(103, "SpringBoot");
		System.out.println("Size HashTable is : " + ht.size());

		for (Map.Entry<Integer, String> m : ht.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println("-------------Hash table end--------------");

		System.out.println("-----------Hash map start-----------");
		HashMap<Integer, String> hm = new HashMap<>(16);

		System.out.println("Size  HashMap is : " + hm.size());

		//hm.put(null, null);// ok null null
		//hm.put(null, null);// No Exception thrown, but HashMap object has contains first pair as null as key
							// and value
		hm.put(100, "Java");
		hm.put(100, "Hibernate");
		hm.put(100, "SpringBoot");
		hm.put(104, "JavaScript");
		hm.put(101, "HTML");
		hm.put(102, "CSS");
		hm.put(null, null);// No Exception thrown, but HashMap object put this null pair at first index pair
		System.out.println("Size  HashMap is : " + hm.size());
		for (Map.Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("-----------Hash map end-----------");
	}
}