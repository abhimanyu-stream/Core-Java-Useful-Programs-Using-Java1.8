package com.ingenico.interviews;

import java.util.HashMap;
import java.util.Map;

public class FindWordCountinString {

	public static void main(String[] args) {
		
		
		String str = "Abhimanyu is interviewing  for a new job Abhimanyu is interviewing  for a new job Abhimanyu is interviewing  for a new job";
		String str2= "JavaSpringHibernateJPASAOPRESTAWS";
		String [] splitted = str.split(" ");
		
		Map<String ,Integer> mapObj = new HashMap<>();
		for(int i =0; i< splitted.length; i++) {
			System.out.println("mapObj.get(splitted[i])  : "+ splitted[i] + "  :" + mapObj.get(splitted[i]));
			if(mapObj.containsKey(splitted[i])) {
				int count = mapObj.get(splitted[i]);
				mapObj.put(splitted[i], count + 1);
				
				
				
			}else {
				mapObj.put(splitted[i], 1);
			}
		}
		System.out.println(mapObj);
		
		System.out.println("//>>>>>>>>>>>>>>>>>>>>////>>>>>>>>>>>>>>>>>>>>//");
		
		char[] characterArray = str2.toCharArray();
		
		Map<Character ,Integer> mapObj2 = new HashMap<>();
		for(int i =0; i< characterArray.length; i++) {
			System.out.println("mapObj.get(characterArray[i])  : "+ characterArray[i] + " : " +mapObj2.get(characterArray[i]));
			if(mapObj2.containsKey(characterArray[i])) {
				int count = mapObj2.get(characterArray[i]);
				mapObj2.put(characterArray[i], count + 1);
				
				
				
			}else {
				mapObj2.put(characterArray[i], 1);
			}
		}
		System.out.println(mapObj2);

	}
	
}
