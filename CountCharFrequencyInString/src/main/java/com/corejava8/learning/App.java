package com.corejava8.learning;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		String str2 = "JavaSpringHibernateJPASAOPRESTAWS";
		char[] characterArray = str2.toCharArray();

		Map<Character, Integer> mapObj2 = new HashMap<>();
		for (int i = 0; i < characterArray.length; i++) {
			System.out.println("mapObj.get(characterArray[i])  : " + characterArray[i] + " : " + mapObj2.get(characterArray[i]));
			if (mapObj2.containsKey(characterArray[i])) {
				int count = mapObj2.get(characterArray[i]);// Its return Integer value of Map<Character,Integer>
				mapObj2.put(characterArray[i], count + 1);

			} else {
				mapObj2.put(characterArray[i], 1);
			}
		}
		System.out.println(mapObj2);

	}

}
