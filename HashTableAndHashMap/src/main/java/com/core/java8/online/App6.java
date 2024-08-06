package com.core.java8.online;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class App6 extends Thread{
	
	static ConcurrentMap<Integer,String> concurrentHashMap=new ConcurrentHashMap<>();   
    public void run()   
    {   
        try  
        {   
            Thread.sleep(1000);   
            // Child thread trying to add object  
            // Adding new element in the object with the key 103  
            concurrentHashMap.put(103,"A");   
        }   
        catch(InterruptedException e)   
        {   
            System.out.println("Child Thread will add objects");   
        }   
    }   

    public static void main(String[] args) throws InterruptedException   
    {   
    	concurrentHashMap.put(100,"X");   
    	concurrentHashMap.put(101,"Y");   
    	concurrentHashMap.put(102,"Z");   
        App6 t=new App6();   
        t.start();  
        
		
		  for(Map.Entry<Integer,String> s: concurrentHashMap.entrySet()) {
		  
		  //s.setValue(null);Exception in thread "main" java.lang.NullPointerException
		  
		  s.setValue("microservice");
		  }
		 
        for (Object o : concurrentHashMap.entrySet())   
        {   
            
        	//concurrentHashMap.put(null, null);//Exception in thread "main" java.lang.NullPointerException
        	//concurrentHashMap.put(null, "ejb");//Exception in thread "main" java.lang.NullPointerException
        	//concurrentHashMap.put(521, null);//Exception in thread "main" java.lang.NullPointerException
           // System.out.println(s);   
        	concurrentHashMap.put(102,"Maven");   
            Thread.sleep(1000);   
        }   
        System.out.println(concurrentHashMap);   
    }   

}
