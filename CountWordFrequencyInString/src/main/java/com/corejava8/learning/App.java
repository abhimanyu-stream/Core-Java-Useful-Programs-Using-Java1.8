package com.corejava8.learning;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
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
    }
}
