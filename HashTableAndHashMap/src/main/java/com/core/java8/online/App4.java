package com.core.java8.online;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class App4 {
	
	
	public static void main(String[] args) {
		
		System.out.println(".........HashMap start..........");
		Map<String, String> map = new HashMap<>();
		map.put(null, null);
		map.put("a", "abhimanyu");
		map.put("j", "java");
		map.put("s", "springboot");
		map.put(null, null);
		System.out.println(map);
		
		for(Map.Entry<String, String> s: map.entrySet()) {
			
			System.out.println(s.getKey() + ":   " + s.getValue());
			s.setValue("abc");
			System.out.println(s.getKey() + ":   " + s.getValue());
			
		}
		System.out.println(".........HashMap end..........");
		
		System.out.println(".........ConcurrentHashMap start..........");
		
		
		ConcurrentMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
		
		//concurrentHashMap.put(null, null);Exception in thread "main" java.lang.NullPointerException
		
		concurrentHashMap.put("a", "Java");
		concurrentHashMap.put("b", "Spring");
		concurrentHashMap.put("c", "Hibernate");
		concurrentHashMap.put("a", "JavaScript");
		concurrentHashMap.put("a", "Java");
		concurrentHashMap.put("a", "JavaAPI");
		//concurrentHashMap.put(null, null);Exception in thread "main" java.lang.NullPointerException
		System.out.println(concurrentHashMap);

		
		for(Map.Entry<String, String> s: concurrentHashMap.entrySet()) {
			System.out.println(s.getKey() + ":   " + s.getValue());
			
			
		}
		
		for(Map.Entry<String, String> s: concurrentHashMap.entrySet()) {
			
			s.setValue("abc");
			System.out.println(s.getKey() + ":   " + s.getValue());
			
		}
		System.out.println(".........ConcurrentHashMap end..........");
	}

}
